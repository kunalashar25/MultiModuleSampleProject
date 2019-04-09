package com.test.dao;

import org.apache.commons.io.FileUtils;

public class TestDao {

	// Service Layer and Presentation layer classes won't be accessible here as they
	// are child modules.

	// accessing FileUtils class from commons-io dependency present in parent
	// project i.e. MultiModuleSampleProject
	private FileUtils utils;

}
