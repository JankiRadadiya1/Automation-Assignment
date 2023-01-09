package Practice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class File_partice {
public static Properties prop;
public static WebDriver driver;
	public static void main(String [] args) throws IOException {
			
		prop = new Properties();
	   String path = System.getProperty("user.dir") + "\\src\\main\\java\\Practice\\Confi.properties";		
	   FileInputStream fs = new FileInputStream(path);
    	prop.load(fs);
	
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
       driver.get(prop.getProperty("url")); 	
    	
    List<WebElement> Links =	driver.findElements(By.tagName("a"));
       driver.findElement(By.id("closeButton")).click();
        System.out.println(Links.size());
    
      for(int i=0; i<Links.size(); i++) {
    		System.out.println(Links.get(i).getText() + " : presence of this link is : " + Links.get(i).isDisplayed());
    	 
			String url1 = Links.get(i).getAttribute("href");
			System.out.println(url1);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(true, "Invalid Response Code");
			Links.get(i).click();
		
		
	}

	}}
	
	
	
	
