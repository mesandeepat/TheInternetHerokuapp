package PageClasses;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.nio.file.Files; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.theInternet.IntenetHerokuappPOC.BaseClass;

public class FileDownloadPageClass extends BaseClass {
	
	WebDriver driver; 
	
	@FindBy(css= ".example a:nth-of-type(3)")
	private WebElement lambdaTestLink; 
	
	public FileDownloadPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void validateFileDownload() {
		
		// Set the download directory
        String downloadPath = System.getProperty("user.dir") + "/downloads";
        
        // Configure Chrome to download files automatically
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("safebrowsing.enabled", true);
        
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        // Launch Chrome browser
        getDriver().get("https://the-internet.herokuapp.com/download");

        // Click on a file link to download
        WebElement fileLink = lambdaTestLink; 
        fileLink.click();

        // Wait for download to complete
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        // Verify if file is downloaded
        Path filePath = Paths.get(downloadPath + lambdaTestLink);
        if (Files.exists(filePath)) {
            System.out.println("File downloaded successfully!");
        } else {
            System.out.println("File download failed!");
        }
	}
	}
