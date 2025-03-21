package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.DisappearingElementsPageClass;
import PageClasses.HomePageClass;

public class DisappearingElementsTestClass extends BaseClass {
	
	@Test
	
	public void validateDisappearingElements() { 
		HomePageClass home = new HomePageClass(getDriver());
		DisappearingElementsPageClass dis = new DisappearingElementsPageClass(getDriver()); 
		home.clickDisappearingEle();
		dis.validatingAllTheBtns();
		
	}

}
