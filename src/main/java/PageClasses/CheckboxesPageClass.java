package PageClasses;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPageClass {
	
	WebDriver driver; 
	
	@FindBy(xpath= "//div[@id = 'content']//div//form//input[1]")
	private WebElement checkbox1; 
	
	@FindBy(xpath= "//div[@id = 'content']//div//form//input[2]")
	private WebElement checkbox2; 
	
	public CheckboxesPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateCheckbox1IsNotSelected() { 
		try { 
			return !checkbox1.isSelected();
		} catch (NoSuchElementException e) { 
			return true; 
		}
	}
	
	public boolean validateCheckbox2IsSelected() { 
		try { 
			return checkbox2.isSelected(); 
		} catch (NoSuchElementException e) { 
			return false; 
		}
	}
	
	public void checkCheckbox1() { 
		checkbox1.click();
	}
	
	public boolean validateChecbox1IsSelected() { 
		try { 
			return checkbox1.isSelected(); 
		} catch (NoSuchElementException e) { 
			return false; 
		}
	}

}
