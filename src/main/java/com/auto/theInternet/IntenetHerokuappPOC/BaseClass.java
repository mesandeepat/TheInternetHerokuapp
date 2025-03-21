package com.auto.theInternet.IntenetHerokuappPOC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static final String BASE_URL = "https://the-internet.herokuapp.com/"; 
    private static final Logger logger = LogManager.getLogger(BaseClass.class);

    @BeforeMethod
    @Parameters({"browser"})
    public void setup(@Optional("firefox") String browser) {
        logger.info("Initializing browser: " + browser);

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
        } else {
            logger.error("Invalid browser name provided: " + browser);
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        logger.info("Browser initialized: " + browser);
        getDriver().manage().window().maximize();
        getDriver().get(BASE_URL);
        logger.info("Navigated to: " + BASE_URL);
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {
        if (driver.get() != null) {
            logger.info("Closing browser.");
            driver.get().quit();
            driver.remove();
            logger.info("Browser session ended.");
        }
    }
}

