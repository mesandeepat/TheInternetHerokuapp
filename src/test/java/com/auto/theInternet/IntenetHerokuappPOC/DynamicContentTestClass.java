package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.DynamicContentPageClass;
import PageClasses.HomePageClass;

public class DynamicContentTestClass extends BaseClass {
		
	@Test
	
	public void validateDynamicContentVariable() { 
		
		HomePageClass home = new HomePageClass(getDriver());
		DynamicContentPageClass content = new DynamicContentPageClass(getDriver()); 
		home.clickDynamicContent();
		
		content.validateHeading();
		
		content.validateParaBelowHeading();
		
		content.validateFirstPara();
		
		content.validateSecondPara();
		
		content.validateThirdPara();
		
	}

}
