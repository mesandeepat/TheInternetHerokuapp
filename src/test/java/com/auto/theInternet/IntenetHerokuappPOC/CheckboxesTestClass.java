package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.CheckboxesPageClass;
import PageClasses.HomePageClass;

public class CheckboxesTestClass extends BaseClass {
	
	@Test
	public void validateCheckboxes() { 
		HomePageClass home = new HomePageClass(getDriver()); 
		CheckboxesPageClass check = new CheckboxesPageClass(getDriver()); 
		home.clickCheckboxes();
		
		check.validateCheckbox1IsNotSelected(); 
		check.validateCheckbox2IsSelected(); 
		
		check.checkCheckbox1();
		
		check.validateChecbox1IsSelected(); 
	}

}
