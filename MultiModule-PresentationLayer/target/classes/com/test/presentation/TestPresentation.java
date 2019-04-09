package com.test.presentation;

import org.apache.commons.io.FilenameUtils;

import com.test.dao.TestDao;
import com.test.service.TestService;

public class TestPresentation {

	// all classes of Service and Integration layer are accessible at Presentation
	// layer
	private TestPresentation presentation;
	private TestService service;
	private TestDao dao;

	// accessing FileUtils class from commons-io dependency present in parent
	// project i.e. MultiModuleSampleProject
	private FilenameUtils utils;

}
