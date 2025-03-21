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

public class DynamicContentPageClass extends BaseClass {
	
	WebDriver driver;
	
	@FindBy(css= ".example h3")
	private WebElement pageHeading; 
	
	@FindBy(css= ".example p:nth-of-type(1)")
	private WebElement para;
	
	@FindBy(xpath= "(//div[@id = 'content']//div//div[2])[1]")
	private WebElement firstPara; 
	
	@FindBy(xpath= "(//div[@id = 'content']//div//div[2])[2]//div[2]")
	private WebElement secondPara; 
	
	@FindBy(xpath= "(//div[@id = 'content']//div//div[2])[4]")
	private WebElement thirdPara;
	
	public DynamicContentPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validateHeading() {
		String expectedHeading = pageHeading.getText(); 
		System.out.println(expectedHeading);
		Assert.assertEquals(expectedHeading, "Dynamic Content");
	}
	
	public void validateParaBelowHeading() { 
		String expectedParaBelowHeading = para.getText(); 
		System.out.println(expectedParaBelowHeading);
		Assert.assertEquals(expectedParaBelowHeading, "This example demonstrates the ever-evolving nature of content by loading new text and images on each page refresh.");
	}
	
	public void validateFirstPara() { 
		String beforeRefresh = firstPara.getText(); 
		getDriver().navigate().refresh();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(firstPara)); 
		
		String afterRefresh = firstPara.getText(); 
		
		if(beforeRefresh.equals(afterRefresh)) { 
		System.out.println("The text did not got changed after page refresh");
			
		} else { 
			System.out.println("This text got changed");
		}
		
	}
	
	public void validateSecondPara() { 
		String beforeRefresh = secondPara.getText(); 
		getDriver().navigate().refresh();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(firstPara)); 
		
		String afterRefresh = secondPara.getText(); 
		
		if(beforeRefresh.equals(afterRefresh)) { 
		System.out.println("The text did not got changed after page refresh");
			
		} else { 
			System.out.println("This text got changed");
		}
		
	}
	
	public void validateThirdPara() { 
		String beforeRefresh = secondPara.getText(); 
		getDriver().navigate().refresh();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(thirdPara)); 
		
		String afterRefresh = secondPara.getText(); 
		
		if(beforeRefresh.equals(afterRefresh)) { 
		System.out.println("The text did not got changed after page refresh");
			
		} else { 
			System.out.println("This text got changed");
		}
		
	}
	

}
