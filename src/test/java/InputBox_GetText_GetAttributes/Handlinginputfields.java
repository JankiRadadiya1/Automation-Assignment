package InputBox_GetText_GetAttributes;
//sendkeys->it is use to type in the input fields

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlinginputfields {

	 public static WebDriver driver;
		public static void main(String[] args) {
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\janki\\Automation Learning\\ChromeDriver\\chromedriver.exe\\");
				WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize(); //maximize browser
         driver.get("https://www.surveymonkey.ca/use	pur/sign-in/?/ut_source=megamenu");//open any application
		//Enter username:->
         driver.findElement(By.id("username")).sendKeys("seleniumtraining");
        //Enter password:->
         driver.findElement(By.id("password")).sendKeys("selenium1234");
        //to log in :->
         driver.findElement(By.xpath("//button[@type='submit']")).click();
           
         //driver.quit();
	}
	
	
	

}
