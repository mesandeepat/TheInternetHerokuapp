package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.ChallengingDOMPageClass;
import PageClasses.HomePageClass;

public class ChallengingDOMTestClass extends BaseClass {
	
	@Test
	
	public void validateChallengingDOM() { 
		HomePageClass home = new HomePageClass(getDriver());
		ChallengingDOMPageClass challenge = new ChallengingDOMPageClass(getDriver()); 
		home.clickChallengingDOM();
		
		challenge.validateBlueBtnIsDisplayed(); 
		challenge.validateDeleteBtnFrom9thRowOfTable(); 
		challenge.validateEditBtnFrom6thRowOfTable(); 
		challenge.validateTxtFrom3rdRowAnd6thColumn();
		
	}

}
