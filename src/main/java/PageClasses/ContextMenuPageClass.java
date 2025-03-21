package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.auto.theInternet.IntenetHerokuappPOC.BaseClass;

public class ContextMenuPageClass extends BaseClass {
	
	WebDriver driver; 
	
	@FindBy(css= "#hot-spot")
	private WebElement displayArea; 
	
	public ContextMenuPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}

	public void validateContentMenuOnSpace() { 
		Actions action = new Actions(driver);
		action.contextClick(displayArea).perform();
		
		String textOnAlert = getDriver().switchTo().alert().getText(); 
		Assert.assertEquals(textOnAlert, "You selected a context menu");
		
		getDriver().switchTo().alert().accept();
		
	}
}
