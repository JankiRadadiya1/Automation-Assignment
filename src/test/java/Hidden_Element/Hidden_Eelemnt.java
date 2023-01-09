package Hidden_Element;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Eelemnt {

	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();

	      //implicit wait
 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	      //URL launch
	      driver.get("https://learn.letskodeit.com/p/practice");

	      // identify element and click
	      driver.findElement(By.id("hide-textbox")).click();

	      // Javascript executor class with executeScript method
	      JavascriptExecutor j = (JavascriptExecutor) driver;

	      // identify element and set value
	      j.executeScript("document.getElementById('displayed-text').value='Selenium';");
	      String s =  (String) j.executeScript("return document.getElementById('displayed-text').value");
	      System.out.print("Value entered in hidden field: " +s);
	      driver.close();
	   }
	
	}


