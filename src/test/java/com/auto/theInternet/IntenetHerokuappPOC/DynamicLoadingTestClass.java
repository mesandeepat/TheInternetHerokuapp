package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.DynamicLoadingPageClass;
import PageClasses.HomePageClass;

public class DynamicLoadingTestClass extends BaseClass {
	
	@Test
	public void validateDynamicLoading() { 
		
		HomePageClass home = new HomePageClass(getDriver());
		DynamicLoadingPageClass loading = new DynamicLoadingPageClass(getDriver()); 
		
		home.clickDynamicLoading();
		
		loading.clickElementOnPageLoad();
		
		loading.validateElementRendered();
		
		
	}
	

}
