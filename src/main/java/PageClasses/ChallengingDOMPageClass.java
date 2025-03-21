package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDOMPageClass {
	
	WebDriver driver; 
	
	@FindBy(xpath= "//div[@class = 'large-2 columns']//a[1]")
	private WebElement blueBtn;
	
	@FindBy(xpath = "//table//tr[6]//td[7]//a[1]")
	private WebElement editBtnFrom6thRow; 
	
	@FindBy(xpath = "//table//tr[9]//td[7]//a[2]")
	private WebElement deleteBtnFrom9thRow; 
	
	@FindBy(xpath = "//table//tr[3]//td[6]")
	private WebElement textFrom3rdRowAnd6thColumn; 
	
	public ChallengingDOMPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateBlueBtnIsDisplayed() { 
		try { 
			return blueBtn.isDisplayed(); 
		} catch (Exception e) {
			return false; 
		}
	}
	
	public boolean validateEditBtnFrom6thRowOfTable() { 
		try { 
			return editBtnFrom6thRow.isDisplayed(); 
		} catch (Exception e) { 
			return false; 
		}
	}
	
	public boolean validateDeleteBtnFrom9thRowOfTable() { 
		try { 
			return deleteBtnFrom9thRow.isDisplayed(); 
		} catch (Exception e) {
			return false; 
		}
	}
	
	public void validateTxtFrom3rdRowAnd6thColumn() { 
		String value = textFrom3rdRowAnd6thColumn.getText(); 
		System.out.println("Text in 3rd row and 6th column cell of table is: " +  value);
	}
	

}
