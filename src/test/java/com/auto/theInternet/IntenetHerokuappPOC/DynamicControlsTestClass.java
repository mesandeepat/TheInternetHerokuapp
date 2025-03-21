package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.DynamicControlsPageClass;
import PageClasses.HomePageClass;

public class DynamicControlsTestClass extends BaseClass {
	
	@Test
	
	public void validateDynamicControl() {
	
	
	HomePageClass home = new HomePageClass(getDriver());
	DynamicControlsPageClass controls = new DynamicControlsPageClass(getDriver()); 
	
	home.clickDynamicControls();
		
	controls.validatetextField();
	
	controls.validateTextArea();
	
	
}
	
}
