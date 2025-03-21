package PageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.auto.theInternet.IntenetHerokuappPOC.BaseClass;

public class DynamicLoadingPageClass extends BaseClass {
	
	WebDriver driver; 
	
	@FindBy(css= ".example a:nth-of-type(1)")
	private WebElement elementOnPageLink; 
	
	@FindBy(css= ".example a:nth-of-type(2)")
	private WebElement elementRenderedLink; 
	
	@FindBy(css= ".example #start button")
	private WebElement hiddenStartBtn; 
	
	@FindBy(css= "#finish h4")
	private WebElement helloWorldText; 
	
	@FindBy(css= ".example a:nth-of-type(2)")
	private WebElement elementRenderedOnPage; 
	
	public DynamicLoadingPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void clickElementOnPageLoad() { 
		elementOnPageLink.click();
		
		hiddenStartBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.visibilityOf(helloWorldText)); 
		
		String text = helloWorldText.getText(); 
		Assert.assertEquals(text, "Hello World!");
		
	}
	
	public void validateElementRendered() { 
		
		getDriver().navigate().back();
		
		elementRenderedOnPage.click();
		hiddenStartBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.textToBePresentInElement(helloWorldText, "Hello World!")); 
		
		String text = helloWorldText.getText(); 
		Assert.assertEquals(text, "Hello World!");
		
		
		
	}
	
	

}
