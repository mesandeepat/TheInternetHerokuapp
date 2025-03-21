package com.auto.theInternet.IntenetHerokuappPOC;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageClasses.EntryAdPageClass;
import PageClasses.HomePageClass;

public class EntryAdTestClass extends BaseClass {
	
	WebDriver driver; 
	
	@Test
	
	public void validateEntryAd() { 
		
		HomePageClass home = new HomePageClass(getDriver());
		EntryAdPageClass entry = new EntryAdPageClass(getDriver()); 
		
		home.clickEntryAd();
		entry.validateModal();
	}

}
