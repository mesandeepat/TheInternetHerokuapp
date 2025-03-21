package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.BrokenImagesClass;
import PageClasses.HomePageClass;

public class BrokenImageTestClass extends BaseClass {
	
	
	@Test
	public void validateStateOfImages() { 
		HomePageClass home = new HomePageClass(getDriver());
		BrokenImagesClass image = new BrokenImagesClass(getDriver()); 
		
		home.clickBrokenImages();
		image.validateBrokenImagePositionFromListOfImages();
		
	}

}
