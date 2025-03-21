package PageClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExitIntentPageClass {
	
	WebDriver driver; 
	
	@FindBy(css= ".modal-title:nth-of-type(1) h3")
	private WebElement modalTitle; 
	
	@FindBy(css= ".modal-footer p:nth-of-type(1)")
	private WebElement modalClosureBtn; 
	
	public ExitIntentPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void validateExitIntent() { 
		
		Actions actions = new Actions(driver);

        // Move mouse to center first
        actions.moveByOffset(200, 200).perform();

        // Move mouse to the top edge of the viewport (exit intent simulation)
        actions.moveByOffset(0, -200).perform();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(modalTitle)); 
        
        String modalHeading = modalTitle.getText(); 
        Assert.assertEquals(modalHeading, "This is a modal window");
        
        modalClosureBtn.click();
        
        wait.until(ExpectedConditions.invisibilityOf(modalTitle)); 
        
	}

}
