package dynamic_Waits_conditions;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;
//FluentWait class implements the Wait interface in selenium, FluentWait object defines the maximum amount of time to wait for a condition. 
//Below is the example for a common way of using Fluent Wait
public class Fluent_Wait {
	public static WebDriver driver;
	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
     	 driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
	//	WebElement anything = wait.until(new Function<Webdriver, WebElement>(){
		//	public WebElement apply(WebDriver driver) {
				
			}
	//	}

}
