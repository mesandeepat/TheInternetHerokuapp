package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.DragAndDropPageClass;
import PageClasses.HomePageClass;

public class DragAndDropTestClass extends BaseClass {
	
	@Test
	
	public void validatingDragAndDrop() { 
		HomePageClass home = new HomePageClass(getDriver());
		DragAndDropPageClass drag = new DragAndDropPageClass(getDriver()); 
		
		home.clickDragAndDrop();
		
		String expectedTextAfterDragging = drag.validateDraggingElement(); 
		Assert.assertEquals(expectedTextAfterDragging, "B");
	}

}
