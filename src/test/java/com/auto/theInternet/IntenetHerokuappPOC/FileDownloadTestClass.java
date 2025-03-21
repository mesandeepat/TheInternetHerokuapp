package com.auto.theInternet.IntenetHerokuappPOC;

import org.testng.annotations.Test;

import PageClasses.FileDownloadPageClass;
import PageClasses.HomePageClass;

public class FileDownloadTestClass extends BaseClass {
	
	@Test
	
	public void validateFileDownload() { 
		
		HomePageClass home = new HomePageClass(getDriver());
		FileDownloadPageClass download = new FileDownloadPageClass(getDriver()); 
		home.clickFileDownload();
		
		download.validateFileDownload();

	}
}
