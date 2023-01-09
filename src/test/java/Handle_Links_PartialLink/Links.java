package Handle_Links_PartialLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	 public static WebDriver driver;
		public static void main(String[] args) {		
				WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize(); //maximize browser
      driver.get("https://www.surveymonkey.ca");//open any application	
      
     //define collection define with help of LIST:->it is a interface
   List<WebElement> links =  driver.findElements(By.tagName("a"));
   System.out.println("Total num of links on homepage is:" +links.size());

     //display name of links:->   
  for (int i = 0; i < links.size(); i++) {
  	 String linkName = links.get(i).getText();
	 if(linkName.isEmpty() !=true){      //to print the links that are not empty.
		 System.out.println(i + ":" + linkName);
  
			// verify link is existing:->
			if (linkName.equalsIgnoreCase("Help")) {
				System.out.println("pass");
			} else {
	           System.out.println("fail");
			
	 }
	 }
	 }
  } 
	}

	


