package dynamic_Waits_conditions;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
//implicit wait->Global wait which is applicable for all elements it apply to all webelements  
//it take care when synchronized problem occurs  
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//IMPLICTIS WAITS->across the complete selenium code /you apply the implicits wait condition and let's say you give 10 sec -
//Then you typically are asking Selenuim to wait max 10 sec for that webelement to load, and if not then throw the error
public class Implicit_Waits {
	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		         WebDriverManager.chromedriver().setup();
	          	 driver = new ChromeDriver();
		         driver.manage().window().maximize();
				driver.get("https://demo.nopcommerce.com/register");

                   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
                 // driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
				  driver.findElement(By.id("small-searchterms")).sendKeys("Janki");
		
				 File src =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\janki\\Desktop\\QA resume (bronto IT)\\New folder\\JANKI"));
				
	}
	
	}


