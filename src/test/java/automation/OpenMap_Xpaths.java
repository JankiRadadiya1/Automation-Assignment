package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMap_Xpaths {

	  public static WebDriver driver;
		public static void main(String[] args) {
			
	      	WebDriverManager.chromedriver().setup();
	         ChromeDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
			 driver.get("https://openweathermap.org/");// --->25 dynamic xpaths all different from each other
					driver.findElement(By.xpath("//input[@name='q']")).sendKeys("janki");
    driver.findElement(By.xpath("//div[@id='desktop-menu']/descendant::a[1]")).click();
    driver.findElement(By.xpath("//ul[@id='mobile-menu']/descendant::a[1]")).click();
    driver.navigate().back();
    driver.findElement(By.xpath("//div[@id = 'banner_android']/following-sibling::nav[1]/descendant::a[2]")).click();
    driver.findElement(By.xpath("//nav[@id='nav-website']/descendant::ul[@id='mobile-menu']/li[2]/descendant::a[1]")).click();
    driver.findElement(By.xpath("//div[@class='stick-footer-panel__btn-container']/button[1]")).click();	
    driver.navigate().back();
    driver.findElement(By.xpath("//div[@id='desktop-menu']/ul[1]/li[1]/a[1]")).click();
    driver.findElement(By.xpath("//nav[@id='nav-website']/ul[@id='first-level-nav']/div/ul/li[1]/a")).click();
    driver.navigate().back();
    driver.findElement(By.xpath("//div[@id='desktop-menu']/child::form[1]/following-sibling::ul/li[1]/a[1]")).click();
    driver.findElement(By.xpath("//div[@id='weather-widget']/descendant::div[5]/following-sibling::span[1]")).click();
    driver.findElement(By.xpath("//div[@class='section-content grid-container donate-section white-text']/child::p/child::b[2]/following-sibling::a[1]")).click(); 
	driver.findElement(By.xpath("//div[@class='text-container']/child::ul[1]/following-sibling::a[1]")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//div[@class='mobile-padding']/child::div/child::ul/following-sibling::a[1]")).click();
	driver.findElement(By.xpath("//div[@id='footer-website']/descendant::div[4]/child::ul/child::li[1]/child::a[1]")).click();
	driver.findElement(By.xpath("//div[@id='footer-website']/descendant::div[4]/child::ul/child::li[1]/following-sibling::li[1]/a[1]")).click();
	driver.findElement(By.xpath("//div[@class='daily-container block mobile-padding']/descendant::li[1]/child::span[1]")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//button[@class='button-round dark']/preceding::div[1]/child::input[1]")).sendKeys("Monday");		
    driver.findElement(By.xpath("//div[@class='sub not-found']/preceding::button[1]")).click();

}
		}
 