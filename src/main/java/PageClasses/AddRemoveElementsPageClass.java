package PageClasses;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPageClass {
	
	WebDriver driver; 
	
	@FindBy(xpath= "//button[@onclick = 'addElement()']")
	private WebElement addEleBtn; 
	
	@FindBy(xpath= "//button[@onclick = 'deleteElement()']")
	private WebElement deleteBtn; 
	
	
	public AddRemoveElementsPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}   
	
	public void clickAddBtn() { 
		addEleBtn.click();
	}
	
	public void clickDelBtn() {
		deleteBtn.click();
	}
	
	public boolean validateAddBtnIsDisplayed() {
		try { 
			return addEleBtn.isDisplayed(); 
		} catch (NoSuchElementException e) { 
			return false; 
		}
		
	}
	
	public boolean validateAddBtnIsNotDisplayed() {
		try { 
			return !addEleBtn.isDisplayed(); 
		} catch (NoSuchElementException e) { 
			return true;
		}
		
	}
	
	
	public boolean validateDeleBtnIsDisplayed() {
		try { 
			return deleteBtn.isDisplayed(); 
		} catch (NoSuchElementException e) { 
			return false; 
		}
		
	}                                                                                                                                                                                                   
	
	public boolean validateDeleteBtnIsNotDisplayed1() {
		try { 
			return !deleteBtn.isDisplayed(); 
		} catch (NoSuchElementException e) { 
			return true;
		}
		
	}
	

}
