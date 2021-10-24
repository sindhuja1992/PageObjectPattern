package SeleniumTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.*;
import org.testng.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OpenGoogleSearchEngine {
WebDriver driver;
	
	@BeforeTest
    public void beforeTest() {  
        String exePath = "/Users/annu/Desktop/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();  
    } 

	@Test
	public void verifyTitle() {

	   driver.get("https://www.browserstack.com/");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       WebElement ele = driver.findElement(By.id("signupModalButton"));
       if(ele.isDisplayed())
       {
    	   String expectedTitle = ele.getText();
    	   Assert.assertEquals(expectedTitle, "Get started free");
       }
       driver.close();
    }
}
