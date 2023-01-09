package Handle_Links_PartialLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingLinks {

	 public static WebDriver driver;
		public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.manage().window().maximize(); 
         driver.get("https://www.surveymonkey.ca");
         
       //clicking on link:->in a  between <> in a application
         driver.findElement(By.linkText("LOG IN")).click();
       //capture link text:->
         driver.findElement(By.linkText("LOG IN")).getText();
       //count total number of links:->collection without defining any length
        driver.findElement(By.tagName("a"));
       //define collection define with help of LIST:->it is a interface,webelement is also a interface.
        List<WebElement> links =  driver.findElements(By.tagName("a"));
        System.out.println("Total num of links on homepage is:" +links.size());

	}

	}


