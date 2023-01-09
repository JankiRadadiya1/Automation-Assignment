package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class EcomDemo{
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();          
		 driver.manage().window().maximize();
	     driver.get("https://www.saucedemo.com/");	
	     driver.findElement(By.id("user-name")).sendKeys("standard_user");
	     driver.findElement(By.id("password")).sendKeys("secret_sauce");
	     driver.findElement(By.id("login-button")).click();
	     Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
         driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
         driver.findElement(By.id("shopping_cart_container")).click();
         driver.findElement(By.id("checkout")).click();
         driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Janki");
         driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Radadiya");
         driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("12345");
	     driver.findElement(By.xpath("//input[@name='continue']")).click();
	     driver.findElement(By.id("finish")).click();
	     driver.manage().deleteAllCookies();
	     driver.close();    	     
	}
	
}
