import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Browser {
 public static WebDriver driver;	
               
	@Test
	public void Chromeoption() {
		        WebDriverManager.chromedriver().setup();                                 //set the driver server exe path
		
		    ChromeOptions chromeoption =  new ChromeOptions();                 //Create object for ChromeOptions
		    
		 // set chrome as Headless(2 ways)->
		    chromeoption.setHeadless(true);                                                      //method called setHeadless -parameter as true
//		    chromeoption.addArguments("--headless");                    
	    
		  //Instantiate Chrome Driver
			WebDriver driver = new ChromeDriver(chromeoption);
			 driver.get("https://www.google.com");
			System.out.println("Page title is - " + driver.getTitle());
			System.out.println("Current Url : "+ driver.getCurrentUrl());
			driver.close();
	/*	
	----------------------------------------------------------------------------------------------------------------------------------------------------		
			//For firefox Headless browser:->
		WebdriverManager.chromedriver.setup();
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);

			WebDriver driver = new FirefoxDriver(options);
			driver.get("https://www.google.com");
			System.out.println("Page title is - " + driver.getTitle());
			System.out.println("Current Url : "+ driver.getCurrentUrl());
			driver.findElement(By.name("q"));
	-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
	*HtmlUnitDriver is the built-in headless browser in selenium webdriver, HtmlUnitDriver is present in org.openqa.selenium.htmlunit package
      Unlike Headless Firefox, Chrome, With HtmlUnitDriver, we just need to create an object for that class to create a headless browser. HTMLUnit is completely developed using java.

	HtmlUnitDriver driver = new HtmlUnitDriver();
	driver.get("https://www.google.com");
	System.out.println("Page title is - " + driver.getTitle());
	System.out.println("Current Url : "+ driver.getCurrentUrl());
	driver.findElement(By.name("q"));
	driver.close();
		
			*/
			
			
	}

}
