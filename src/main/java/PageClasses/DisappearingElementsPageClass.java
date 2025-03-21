package PageClasses;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.theInternet.IntenetHerokuappPOC.BaseClass;

public class DisappearingElementsPageClass extends BaseClass {
	
	WebDriver driver; 
	
	@FindBy(xpath= "//ul//li[1]//a")
	private WebElement homeBtn; 
	
	@FindBy(xpath= "//ul//li[2]//a")
	private WebElement aboutBtn; 
	
	@FindBy(xpath= "//ul//li[3]//a")
	private WebElement contactUsBtn; 
	
	@FindBy(xpath= "//ul//li[4]//a")
	private WebElement portfolioBtn; 
	
	@FindBy(xpath= "//ul//li[5]//a")
	private WebElement galleryBtn; 
	
	public DisappearingElementsPageClass(WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validatingAllTheBtns() { 
		aboutBtn.click();
		getDriver().navigate().back();
		
		contactUsBtn.click();
		getDriver().navigate().back();
		
		portfolioBtn.click();
		getDriver().navigate().back();
		
		try { 
			galleryBtn.isDisplayed(); 
			System.out.println("gallery item is listed and getting clicked");
			galleryBtn.click();
		} catch (NoSuchElementException e) { 
			System.out.println("Gallery item is not listed");
		}
		
	}

}
