package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.auto.theInternet.IntenetHerokuappPOC.BaseClass;

public class DropDownPageClass extends BaseClass {
	
	WebDriver driver; 
	
	@FindBy(css= "#dropdown:nth-of-type(1)")
	private WebElement dropdown; 
	
	public DropDownPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void validateSelectingFirstElementFromDropDown() { 
		Select select = new Select(dropdown); 
		select.selectByIndex(1);
		
	}
	
	public void validateSelectingSecondElementFromDropDown() { 
		Select select = new Select(dropdown); 
		select.selectByIndex(2);
	}

}
