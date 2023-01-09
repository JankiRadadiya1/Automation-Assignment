package Screenshot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//we have convert webdriver object to screenshot object by casting our driver object to take screenshot so it is ready to capture the screen shot
//getScreenshotAs -> method and as parameter we are passing .File so we get output in file format 
//than to bring file on screen FileUtils ->method to copy the file from src object to our local machine than copyfile from src to local machine
//There is an interface called TakesScreenshot which provides the getScreenshotAs() method and which selenium uses to take a screenshot.
public class Screenshot_VisiblePage {
  public static WebDriver driver;
		
 @Test
 public void TakeScreenShot() {
	  WebDriverManager.chromedriver().setup();
       
      // Initialize browser
       driver = new ChromeDriver();
      
      //navigate to url
      driver.get("https://demoqa.com");
      
     //Take the screenshot
      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      
      //Copy the file to a location and use try catch block to handle exception //We can save the image in different file formats like PNG, JPEG, GIF, BMP
      try {
          FileUtils.copyFile(screenshot, new File("C:\\Users\\janki\\Automation Learning\\Selenuim_Locators\\homePageScreenshot.png"));
      } catch (IOException e) {
          System.out.println(e.getMessage());
      }     
      //closing the webdriver
         driver.close();
      
 
       //    ➢ Taking a ScreenShot:
      //  	 - FileUtils class from apache commons library is used to take a screenshot.
       // 	 - The following snippet remains the same for taking a screenshot.
       // 	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //	 FileUtils.copyFile(scrFile, new File("Location where screenshot	needs to be store"))
  }
}

			  
	


