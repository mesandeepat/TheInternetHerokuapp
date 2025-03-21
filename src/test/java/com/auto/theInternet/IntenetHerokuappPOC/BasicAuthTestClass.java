package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePageClass;

public class BasicAuthTestClass extends BaseClass {
	
	@Test
	public void BasicAuth() { 
		HomePageClass home = new HomePageClass(getDriver()); 
		home.validateBasicAuth();
		
		
	}

}
