package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.ABTestingPageClass;
import PageClasses.HomePageClass;

public class ValidateABTesting extends BaseClass {
	
	
	@Test
	public void validateABTest() { 
		HomePageClass home = new HomePageClass(getDriver()); 
		ABTestingPageClass abTest = new ABTestingPageClass(getDriver()); 
		home.getHomePageHeadingAndValidate();
		
		home.clickABTesting();
		
		abTest.getHeadingText();
		abTest.getVariationText();
		
	}
	

}
