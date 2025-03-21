package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ABTestingPageClass {
	private WebDriver driver; 
	
	 @FindBy(tagName = "h3")  
	    private WebElement pageHeading;

	 @FindBy(tagName = "p")  
	    private WebElement paraText;
	
	public ABTestingPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	  public void getHeadingText() {
	        String expectedHeading = pageHeading.getText();
	        Assert.assertTrue(expectedHeading.contains("A/B Test "));
	      
	    }

	    public void getVariationText() {
	        String expectedText= paraText.getText();
	        Assert.assertTrue(expectedText.contains("Also known as split testing."));
	    }

}
