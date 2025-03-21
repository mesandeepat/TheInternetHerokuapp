package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.AddRemoveElementsPageClass;
import PageClasses.HomePageClass;

public class AddRemoveElementsTestClass extends BaseClass {
	
	@Test
	public void validateAddAndRemoveButtons() { 
		HomePageClass home = new HomePageClass(getDriver()); 
		AddRemoveElementsPageClass addRemove = new AddRemoveElementsPageClass(getDriver()); 
		home.getHomePageHeadingAndValidate();
		home.clickAddRemoveElements();
		
		addRemove.validateAddBtnIsDisplayed(); 
		
		addRemove.validateDeleteBtnIsNotDisplayed1(); 
		
		addRemove.clickAddBtn();
		
		addRemove.validateDeleBtnIsDisplayed(); 
		
		addRemove.clickDelBtn();
		
		addRemove.validateDeleteBtnIsNotDisplayed1(); 
	}

}
