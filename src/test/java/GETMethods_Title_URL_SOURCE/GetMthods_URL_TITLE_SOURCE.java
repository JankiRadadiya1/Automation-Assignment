package GETMethods_Title_URL_SOURCE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMthods_URL_TITLE_SOURCE {

	
	     public static WebDriver driver;	
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/register");
			
			//How To Caputure title of the WebPage:->	
		   System.out.println("The Title of the web page is :->" +driver.getTitle());	
		   
		   //How to Capture current URL of the Webpage:->
		   System.out.println("the Current URL of the Webpage is:-> " +driver.getCurrentUrl());
			
			//how to get Page Source of the Web Page from DOM:->
		   System.out.println("the page source is:-> " +driver.getPageSource());


		}

	}
