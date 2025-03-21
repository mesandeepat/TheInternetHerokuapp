package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.ExitIntentPageClass;
import PageClasses.HomePageClass;

public class ExitIntentTestClass extends BaseClass {
	
	
	@Test(enabled=false)
	
	public void validateExitIntent() { 
		
		//Not running in suite, since unable to bring focus out of webpage
		HomePageClass home = new HomePageClass(getDriver());
		ExitIntentPageClass exit = new ExitIntentPageClass(getDriver()); 
		home.clickExitIntent();
		
		exit.validateExitIntent();
		
	}

}
