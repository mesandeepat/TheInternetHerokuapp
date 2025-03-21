package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.auto.theInternet.IntenetHerokuappPOC.BaseClass;

public class HomePageClass extends BaseClass {
	private WebDriver driver; 
	
	@FindBy(css = "h1.heading")
	private WebElement homePageHeading; 
	
	@FindBy(xpath = "//ul//li[1]//a")
	private WebElement clickABTesting;
	
	@FindBy(xpath = "//ul//li[2]//a")
	private WebElement clickAddRemoveElements;
	
	@FindBy(xpath = "//ul//li[3]//a")
	private WebElement clickBasicAuth;
	
	@FindBy(xpath = "//ul//li[4]//a")
	private WebElement clickBrokenImages;
	
	@FindBy(xpath = "//ul//li[5]//a")
	private WebElement clickChallengingDOM;
	
	@FindBy(xpath = "//ul//li[6]//a")
	private WebElement clickCheckboxes;
	
	@FindBy(xpath = "//ul//li[7]//a")
	private WebElement clickContextMenu;
	
	@FindBy(xpath = "//ul//li[8]//a")
	private WebElement clickDigestAuthentication;
	
	@FindBy(xpath = "//ul//li[9]//a")
	private WebElement clickDisappearingElements;
	
	@FindBy(xpath = "//ul//li[10]//a")
	private WebElement clickDragAndDrop;
	
	@FindBy(xpath = "//ul//li[11]//a")
	private WebElement clickDropDown;
	
	@FindBy(xpath = "//ul//li[12]//a")
	private WebElement clickDynamicContent;
	
	@FindBy(xpath = "//ul//li[13]//a")
	private WebElement clickDynamicControls;
	
	@FindBy(xpath = "//ul//li[14]//a")
	private WebElement clickDynamicLoading;
	
	@FindBy(xpath = "//ul//li[15]//a")
	private WebElement clickEntryAd;
	
	@FindBy(xpath = "//ul//li[16]//a")
	private WebElement clickExitIntent;
	
	@FindBy(xpath = "//ul//li[17]//a")
	private WebElement clickFileDownload;
	
	@FindBy(xpath = "//ul//li[18]//a")
	private WebElement clickFileUpload;
	
	@FindBy(xpath = "//ul//li[19]//a")
	private WebElement clickFloatingMenu;
	
	@FindBy(xpath = "//ul//li[20]//a")
	private WebElement clickForgotPassword;
	
	@FindBy(xpath = "//ul//li[21]//a")
	private WebElement clickFormAuthentication;
	
	@FindBy(xpath = "//ul//li[22]//a")
	private WebElement clickFrames;
	
	@FindBy(xpath = "//ul//li[23]//a")
	private WebElement clickGeoLocation;
	
	@FindBy(xpath = "//ul//li[24]//a")
	private WebElement clickHorizontalSlider;
	
	@FindBy(xpath = "//ul//li[25]//a")
	private WebElement clickHovers;
	
	@FindBy(xpath = "//ul//li[26]//a")
	private WebElement clickInfiniteScroll;
	
	@FindBy(xpath = "//ul//li[27]//a")
	private WebElement clickInputs;
	
	@FindBy(xpath = "//ul//li[28]//a")
	private WebElement clickJQueryUIMenus;
	
	@FindBy(xpath = "//ul//li[29]//a")
	private WebElement clickJavascriptAlerts;
	
	@FindBy(xpath = "//ul//li[30]//a")
	private WebElement clickJavascriptOnloadEventError;
	
	@FindBy(xpath = "//ul//li[31]//a")
	private WebElement clickKeyPresses;
	
	@FindBy(xpath = "//ul//li[32]//a")
	private WebElement clickLargeAndDeepDom;
	
	@FindBy(xpath = "//ul//li[33]//a")
	private WebElement clickMultipleWindows;
	
	@FindBy(xpath = "//ul//li[34]//a")
	private WebElement clickNestedFrames;
	
	@FindBy(xpath = "//ul//li[35]//a")
	private WebElement clickNotificationMessages;
	
	@FindBy(xpath = "//ul//li[36]//a")
	private WebElement clickRedirectLink;
	
	@FindBy(xpath = "//ul//li[37]//a")
	private WebElement clickSecureFileDownload;
	
	@FindBy(xpath = "//ul//li[38]//a")
	private WebElement clickShadowDOM;
	
	@FindBy(xpath = "//ul//li[39]//a")
	private WebElement clickShiftingContent;
	
	@FindBy(xpath = "//ul//li[40]//a")
	private WebElement clickSlowResources;
	
	@FindBy(xpath = "//ul//li[41]//a")
	private WebElement clickSortableDataTables;
	
	@FindBy(xpath = "//ul//li[42]//a")
	private WebElement clickStatusCodes;
	
	@FindBy(xpath = "//ul//li[43]//a")
	private WebElement clickTypos;
	
	@FindBy(xpath = "//ul//li[44]//a")
	private WebElement clickWYSIWYGEditor;
	
	public HomePageClass(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	public void getHomePageHeadingAndValidate() { 
		Assert.assertTrue(homePageHeading.getText().equals("Welcome to the-internet")); 	
		
	}
	
	public void clickABTesting() { 
		clickABTesting.click();
	}
	
	public void clickAddRemoveElements() { 
		clickAddRemoveElements.click();
	}
	
	public void validateBasicAuth() { 
		//clickBasicAuth.click();
		getDriver().get("http://admin:admin@the-internet.herokuapp.com/basic_auth"); 
		String expectedPageTitle = getDriver().getTitle(); 
		System.out.println("page title: " + getDriver().getTitle());
		
		Assert.assertEquals(expectedPageTitle, "The Internet");
	}
	
	public void clickBrokenImages() { 
		clickBrokenImages.click();
	}
	
	public void clickChallengingDOM() { 
		clickChallengingDOM.click();
	}
	
	public void clickCheckboxes() { 
		clickCheckboxes.click();
	}
	
	public void clickContextMenu() { 
		clickContextMenu.click();
	}
	
	public void clickDigestAuth() { 
		clickDigestAuthentication.click();
	}
	
	public void clickDisappearingEle() { 
		clickDisappearingElements.click();
	}
	
	public void clickDragAndDrop() { 
		clickDragAndDrop.click();
	}
	
	public void clickDropDown() { 
		clickDropDown.click();
	}
	
	public void clickDynamicContent() { 
		clickDynamicContent.click();
	}
	
	public void clickDynamicControls() { 
		clickDynamicControls.click();
	}
	
	public void clickDynamicLoading() { 
		clickDynamicLoading.click();
	}
	
	public void clickEntryAd() { 
		clickEntryAd.click();
	}
	
	public void clickExitIntent() { 
		clickExitIntent.click();
	}
	
	public void clickFileDownload() { 
		clickFileDownload.click();
	}
	
	public void clickFileUpload() { 
		clickFileUpload.click();
	}
	
	public void clickFloatingMenu() { 
		clickFloatingMenu.click();
	}
	
	public void clickForgotPassword() { 
		clickForgotPassword.click();
	}
	
	public void clickFormAuth() { 
		clickFormAuthentication.click();
	}
	
	public void clickFrames() { 
		clickFrames.click();
	}
	
	public void clickGeoLocation() { 
		clickGeoLocation.click();
	}
	
	public void clickHorizontalSlider() { 
		clickHorizontalSlider.click();
	}
	
	public void clickHovers() { 
		clickHovers.click();
	}
	
	public void clickInfiniteScroll() { 
		clickInfiniteScroll.click();
	}
	
	public void clickInputs() { 
		clickInputs.click();
	}
	
	public void clickJQueryUIMenus() { 
		clickJQueryUIMenus.click();
	}
	
	public void clickJavascriptAlerts() { 
		clickJavascriptAlerts.click();
	}
	
	public void clickJavascriptOnLoadEventError() { 
		clickJavascriptOnloadEventError.click();
	}
	
	public void clickKeyPresses() { 
		clickKeyPresses.click();
	}
	
	public void clickLargeAndDeepDown() { 
		clickLargeAndDeepDom.click();
	}
	
	public void clickMultipleWindows() { 
		clickMultipleWindows.click();
	}
	
	public void clickNestedFrames() { 
		clickNestedFrames.click();
	}
	
	public void clickNotificationMessages() { 
		clickNotificationMessages.click();
	}
	
	public void clickRedirectLink() { 
		clickRedirectLink.click();
	}
	
	public void clickSecureFileDownload() { 
		clickSecureFileDownload.click();
	}
	
	public void clickShadowDOM() { 
		clickShadowDOM.click();
	}
	
	public void clickShiftingContent() { 
		clickShiftingContent.click();
	}
	
	public void clickSlowResources() { 
		clickSlowResources.click();
	}
	
	public void clickSortableDataTables() { 
		clickSortableDataTables.click();
	}
	
	public void clickStatusCodes() { 
		clickStatusCodes.click();
	}
	
	public void clickTypos() { 
		clickTypos.click();
	}
	
	public void clickWYSIWYGEditor() { 
		clickWYSIWYGEditor.click();
	}
	
}
