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

public class DynamicControlsPageClass extends BaseClass {
	
	WebDriver driver; 
	
	@FindBy(xpath= "//input[@type = 'checkbox']")
	private WebElement checkbox; 
	
	@FindBy(xpath= "(//button[@type= 'button'])[1]")
	private WebElement removeBtn; 
	
	@FindBy(xpath= "(//button[@type= 'button'])[1]//following-sibling::p")
	private WebElement itsGoneMessage; 
	
	@FindBy(xpath= "//input[@type = 'text']")
	private WebElement textArea;
	
	@FindBy(xpath= "(//button[@type = 'button'])[2]")
	private WebElement enableBtn;
	
	@FindBy(xpath= "//form[@id = 'input-example']//p")
	private WebElement itsEnabledMessage; 
	
	public DynamicControlsPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void validatetextField() { 
		Assert.assertTrue(checkbox.isEnabled(), "Checkbox is not enabled");
		
		removeBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(itsGoneMessage)); 
		String expectedMessage = itsGoneMessage.getText(); 
		System.out.println("expected message displaying after removing is :" + expectedMessage);
		Assert.assertEquals(expectedMessage, "It's gone!");
		
	}
	
	public void validateTextArea() { 
		Assert.assertFalse(textArea.isEnabled(), "Text area is in enabled state");
		System.out.println("Text area is in disabled state");
		
		enableBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.visibilityOf(itsEnabledMessage)); 
		
		String message = itsEnabledMessage.getText(); 
		Assert.assertEquals(message, "It's enabled!");
		System.out.println("Message getting displayed is :" + message);
		
		Assert.assertTrue(textArea.isEnabled(), "Text are is enabled now");
		System.out.println("Text are is in enabled state");
		
	}
}
