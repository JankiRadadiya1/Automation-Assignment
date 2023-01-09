package dynamic_Waits_conditions;
import java.time.Duration;

//eg of explicit wait-> Thread.sleep() -> final saviour of all selenium Tester (it pause execution what ever time you specifiy give)	
//now instead of Thread.sleep now we are using WebdriverWait
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
//it apply on the particular webelement which taking so much time to load (synchronization problem)
public class Explicit_Wait {
               public static WebDriver driver;
               public static WebDriverWait wait;
	public static void main(String[] args)  {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.id("password")).sendKeys("Selenium@123");			
		
			//if signin button not working we use explicity wait for signin button:->
	
			wait = new WebDriverWait(driver , Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.className("signinbtn"))).click();
			
    		driver.findElement(By.className("rd_logout")).click();
	}

}
