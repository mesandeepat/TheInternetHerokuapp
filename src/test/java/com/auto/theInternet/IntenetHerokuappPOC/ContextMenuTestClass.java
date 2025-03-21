package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.ContextMenuPageClass;
import PageClasses.HomePageClass;

public class ContextMenuTestClass extends BaseClass {
	
	@Test 
	
	public void validateContextMenu() { 
		HomePageClass home = new HomePageClass(getDriver());
		ContextMenuPageClass context = new ContextMenuPageClass(getDriver()); 
		home.clickContextMenu();
		
		context.validateContentMenuOnSpace();
		
	}

}
