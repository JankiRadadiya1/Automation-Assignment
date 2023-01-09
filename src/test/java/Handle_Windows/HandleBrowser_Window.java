package Handle_Windows;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowser_Window {
	
		 public static WebDriver driver;
		public static void main(String[] args) {
		    
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
	
		//getWindowHandle->get id of the single particular window
	   	
			String WindowHandle = driver.getWindowHandle();
			System.out.println(WindowHandle); 
    
		//getWindowsHandles->Get Id of the multiple Windows 
			driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

			driver.findElement(By.cssSelector(".blinkingText")).click();

			Set<String> windows =  driver.getWindowHandles(); //[parentid,childid,subchildId]

			Iterator<String>it = windows.iterator();

			String parentId = it.next();

			String childId = it.next();

			driver.switchTo().window(childId);

			System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

			driver.findElement(By.cssSelector(".im-para.red")).getText();

			String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

			driver.switchTo().window(parentId);

			driver.findElement(By.id("username")).sendKeys(emailId);


		}

	}


