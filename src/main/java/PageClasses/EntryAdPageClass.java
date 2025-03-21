package PageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EntryAdPageClass {
	
	WebDriver driver;
	
	@FindBy(css= ".modal-title:nth-of-type(1)")
	private WebElement modalHeading; 
	
	@FindBy(css= ".modal-footer p:nth-of-type(1)")
	private WebElement closeBtnOnModal; 
	
	
	
	public EntryAdPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void validateModal() { 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(modalHeading)); 
		
		String modal = modalHeading.getText(); 
		
		Assert.assertEquals(modal, "THIS IS A MODAL WINDOW");
		
		closeBtnOnModal.click();
		
		wait.until(ExpectedConditions.invisibilityOf(modalHeading)); 
	}

}
