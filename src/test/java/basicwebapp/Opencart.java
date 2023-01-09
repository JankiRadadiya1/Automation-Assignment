package basicwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {
	  public static WebDriver driver;
	public static void main(String[] args) {
			
      	WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();	
         driver.get("https://www.opencart.com/");
		 driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/descendant::a[1]")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/descendant::a[2]")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//div[@id='marketplace']/descendant::div[@class='col-md-6']/descendant::a[1]")).click();
		 
	}

}
