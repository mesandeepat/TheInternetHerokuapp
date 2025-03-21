package PageClasses;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagesClass {
	
	WebDriver driver; 
	
	@FindBy(xpath= "//div[@class = 'example']//img")
	private List<WebElement> images; 
	
	public BrokenImagesClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void validateBrokenImagePositionFromListOfImages() { 
		
		try {
		// Get all images on the page
        System.out.println("Total Images Found: " + images.size());

        for (WebElement img : images) {
            String imageURL = img.getAttribute("src");

            // Validate HTTP response
            if (imageURL != null && !imageURL.isEmpty()) {
                if (isImageBroken(imageURL)) {
                    System.out.println("Broken Image Found: " + imageURL);
                } else {
                    System.out.println("Valid Image: " + imageURL);
                }
            }

        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
    	
}
		
	}

	// Function to check if an image URL is broken
	public boolean isImageBroken(String imageURL) {
    try {
        URL url = new URL(imageURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int responseCode = connection.getResponseCode();
        return (responseCode >= 400); // HTTP error status
    } catch (Exception e) {
        return true; // If any exception occurs, consider it as broken
    }
}
		
	}

