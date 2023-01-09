package basicwebapp;
//What exactly is a WebDriver driver?
//WebDriver is an interface and all the methods which are declared in Webdriver interface are implemented by respective driver class. But if we do upcasting,we can run the scripts in any browser . 
//i.e running the same automation scripts in different browsers to achieve Runtime Polymorphism.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class INTRO_ON_SELENUIM {	
	
//	public static WebDriver driver;             //declaring WEBDRIVER at global level

			public static void main(String[] args) {
 //WebdriverManager is a open source library that carries out managment (download, setup and maintain of drivers)  
				
WebDriverManager.chromedriver().setup();//WebDriverManager in Selenium, is a class that allows us to download and set the browser driver binaries without us
//, having to put them in automation scripts manually.So a WebDriverManager class: automates the management of WebDriver binaries. 

				//creating Webdriver instance:-> chromedriver is a class and it implements the webdriver interface.
     //webdriver is a interface and we are creating an object. 
                    WebDriver driver = new ChromeDriver();   //Chromedriver() -->implementing class 
				                                                                       //newchromedriver();-->object of  implementing class
				                                                                      //driver--> interface reference
			                                                                          //Webdriver -->interface
//Top casting - trying to refer to the implementing class object via interface reference variable
				
		 //Webdriver driver = new Webdriver --> not possible Webdriver is an interface we cannot create object of class
				
		       driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //now using driver reference and using all methods like(get, findelement)etc 	

			
			
			}
			
}
