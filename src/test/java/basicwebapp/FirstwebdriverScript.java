package basicwebapp;
//get is to open any application.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstwebdriverScript {

		 public static WebDriver driver;
			public static void main(String[] args) {
					WebDriverManager.chromedriver().setup();

//Atomation tester at = new seleuinmtester();
//	    interface           class
    	WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize(); //maximize browser
        driver.get("https://www.google.com");//open any application
        
        
    	String AppURL = driver.getCurrentUrl();
 System.out.println("Application URL is:"  +AppURL);       // appurl checking
    if (AppURL.contains("https://www.google.com")) {   // if use to compare expected vs actual
          System.out.println("pass-URL is correct");
        /* String apptitle = driver.getTitle();       
        if (apptitle.equalsIgnoreCase("Google")) {      //google app title checking
        	System.out.println("pass - google application opened");     			
       }else {
		    System.out.println("fail-someother application opened");*/

    }else{
	 System.out.println("Fail- URL is not correct");	
	}
 
         driver.quit();    // to close browzer
	}

}
