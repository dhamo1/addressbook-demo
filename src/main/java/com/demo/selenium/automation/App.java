package com.demo.selenium.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static <WebDriver> void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //initialize the driver
        System.setProperty("webdriver.chrome.driver","c:\\Users\\dhamo\\Documents\\Chrome\\chromedriver-win64\\chromedriver");
        //setup chrome parameters
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        //initialize web driver
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        //invoke wait to load the application page
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //open the url in the browser
        driver.get("https://facebook.com")
        
        //locate new contact and click
        
        //locate firstname and enter firstname
        
        //locate lastname and enter lastname
        
        //locate phone number and enter phone number
        
        //locate email and enter email
        
        //locate dob and enter dob
        
        //locate save and click
        
    }
}
