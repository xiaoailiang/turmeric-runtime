/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.tests.wso2;

import static org.hamcrest.Matchers.containsString;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.apache.axis2.wsdl.WSDL2Java;
import org.ebayopensource.turmeric.tools.GeneratedAssert;
import org.ebayopensource.turmeric.tools.TestResourceUtil;
import org.ebayopensource.turmeric.tools.codegen.AbstractServiceGeneratorTestCase;
import org.ebayopensource.turmeric.tools.codegen.builders.BaseCodeGenerator;
import org.junit.Assert;
import org.junit.Test;

public class WSO2BugTest extends AbstractServiceGeneratorTestCase {

	@Test
	public void testForExceptionClassAndSerialVersionID() throws Exception {
		// Initialize testing paths
		testingdir.ensureEmpty();
		File rootDir = testingdir.getDir();

		File wsdl = TestResourceUtil
				.copyResource(
						"org/ebayopensource/turmeric/test/tools/codegen/data/serviceinputfiles/wsdl_with_fault_tags_IHello.wsdl",
						testingdir, "meta-src");
		// @formatter:off
		String args[] = { 
			"-servicename", "IHelloWorld123", 
			"-gentype", "All",
			"-wsdl", wsdl.getAbsolutePath(), 
			"-namespace", "http://www.ebayopensource.org/marketplace/vivek/service", 
			"-dest", rootDir.getAbsolutePath(),
			"-src", rootDir.getAbsolutePath(),
			"-slayer", "INTERMEDIATE",
			"-scv", "1.0.0",
			"-pr", rootDir.getAbsolutePath() 
		};
		// @formatter:on

		performDirectCodeGen(args);
		
		File outputDir = new File(rootDir, "gen-src");
		File exceptionJavaFile = GeneratedAssert.assertFileExists(outputDir, "org/ebayopensource/marketplace/vivek/service/ExceptionException.java");

		// Asserting serialVersionUID is present in the exception class
		// generated by axis
		Assert.assertTrue("serialVersionUID,is not found in class file",
				searchStringInFile(exceptionJavaFile,
						"private static final long serialVersionUID"));

		File classDir = new File(rootDir, "bin");
		assertConstructor(classDir,
				"org.ebayopensource.marketplace.vivek.service.ExceptionException");
	}

	@Test
	public void testUsingEBCOption() throws Exception {
		// Initialize testing paths
	    testingdir.ensureEmpty();
		File rootDir = testingdir.getDir();
		String[] args = getWSDL2JavaToolArgs(rootDir);
		try {
			WSDL2Java.main(args);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		File srcDir = new File(rootDir, "src");
		File exceptionJavaFile = GeneratedAssert.assertFileExists(srcDir, "org/ebayopensource/marketplace/vivek/ErrorMessageException.java");

		// Asserting serialVersionUID is present in the exception class
		// generated by axis
		Assert.assertTrue("serialVersionUID,is not found in class file",
				searchStringInFile(exceptionJavaFile,
						"private static final long serialVersionUID"));
		File dir = new File(rootDir.getAbsolutePath(), "bin");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		BaseCodeGenerator.compileJavaFile(
					"org.ebayopensource.marketplace.vivek.ErrorMessageException", 
					srcDir.getAbsolutePath(), dir.getAbsolutePath());

		assertConstructor(dir,
				"org.ebayopensource.marketplace.vivek.ErrorMessageException");
	}

	private String[] getWSDL2JavaToolArgs(File rootDir) throws IOException {

		List<String> argsList = new ArrayList<String>();

		argsList.add("-o"); // all generated files location (paretn dir)
		argsList.add(rootDir.getAbsolutePath());
		argsList.add("-s"); // sync style
		argsList.add("-l"); // language
		argsList.add("java");
		argsList.add("-d"); // data binding
		argsList.add("jaxbri");
		argsList.add("-ss"); // server side
		argsList.add("-ssi"); // Service skelton interface
		argsList.add("-noWSDL");
		argsList.add("-noBuildXML");
		argsList.add("-noMessageReceiver");
		argsList.add("-p"); // package name for interface
		argsList.add("org.ebayopensource.marketplace.vivek");

		argsList.add("-sin"); // name for the generated interface
		argsList.add("CalculatorService");

		// argsList.add("-ns2p"); //name for the generated interface
		argsList
				.add("http://www.ebayopensource.org/turmeric/common/v1/types=org.ebayopensource.marketplace.services");

		argsList.add("-ebc");
		argsList
				.add("org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException");
		argsList.add("-uri");

		File wsdl = TestResourceUtil
				.copyResource(
						"org/ebayopensource/turmeric/test/tools/codegen/data/serviceinputfiles/AccountService.wsdl",
						testingdir, "meta-src");
		argsList.add(wsdl.getAbsolutePath());

		String[] args = argsList.toArray(new String[0]);

		return args;
	}

	public void assertConstructor(File ClassDir, String className) {

		try {
			// Convert File to a URL
			URL url = ClassDir.toURI().toURL();
			URL[] urls = new URL[] { url };

			// Create a new class loader with the directory
			ClassLoader loader = new URLClassLoader(urls);

			// Load in the class;
			Class<?> cls = loader.loadClass(className);

			Type[] types = cls.getDeclaredConstructor(java.util.List.class)
					.getGenericParameterTypes();

			checkErrorDataType(types);

			types = cls.getDeclaredConstructor(java.util.List.class,
					java.lang.Throwable.class).getGenericParameterTypes();

			checkErrorDataType(types);

		} catch (MalformedURLException e) {
			e.printStackTrace();
			Assert.fail("URL is not correct");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			Assert.fail("Class not found");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			Assert.fail("Expected constructors dont exist");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Expected constructors dont exist");
		}

	}

	public void checkErrorDataType(Type[] types) {
		for (Type type : types) {
			Type[] types1 = ((ParameterizedType) type).getActualTypeArguments();
			Assert.assertThat(((Class<?>) types1[0]).getName(), containsString("ErrorData"));
			break;
		}
	}

	public void compileJavaFile(String file) {
		JavaCompiler compiler = (JavaCompiler) ToolProvider
				.getSystemJavaCompiler();
		compiler.run(null, null, null, file);
	}

	public static boolean searchStringInFile(File file, String searchText) {

		StringBuilder sb = new StringBuilder();
		String line;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			// Reads until the end-of-file met
			while (null != (line = reader.readLine())) {
				// Read line-by-line directly
				sb.append(line);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		String fileText = sb.toString();

		int position = fileText.indexOf(searchText);
		if (position < 0)
			return false;
		else
			return true;
	}

}
