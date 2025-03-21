package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.DropDownPageClass;
import PageClasses.HomePageClass;

public class DropDownTestClass extends BaseClass {
	
	@Test
	
	public void validateDropDown() {
		
		HomePageClass home = new HomePageClass(getDriver());
		DropDownPageClass drop = new DropDownPageClass(getDriver()); 
		home.clickDropDown();
		
		drop.validateSelectingFirstElementFromDropDown();
		drop.validateSelectingSecondElementFromDropDown();
		
	}

}
