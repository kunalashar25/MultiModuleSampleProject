package com.test.service;

import org.apache.commons.io.FileUtils;

import com.test.dao.TestDao;

public class TestService {

	// Only Integration module classes are accessible at Service Layer
	private TestDao dao;

	// Presentation Layer classes are not accessible as they're child modules

	// accessing FileUtils class from commons-io dependency present in parent
	// project i.e. MultiModuleSampleProject
	private FileUtils utils;

}
