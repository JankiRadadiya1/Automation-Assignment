package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Xpaths {
     public static WebDriver driver;
	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
driver.findElement(By.xpath("//p[@id='signin_info']/child::a[1]")).click();
driver.findElement(By.xpath("//div[@id='div_login_error']/following-sibling::div[1]/descendant::div[3]/child::input[1]")).sendKeys("seleniumpanda@rediffmail.com");
driver.findElement(By.xpath("//div[@class='cell']/descendant::input[@id='password']")).sendKeys("Selenium@123");
driver.findElement(By.xpath("//div[@class='table nopad']/preceding::input[1]")).click();
driver.findElement(By.xpath("//span[@class='rd_tp-rgt']/following-sibling::a[1]")).click();
driver.findElement(By.xpath("//ul[@class='setAccount']/descendant::li[2]/child::a[1]")).click();
driver.navigate().back();
driver.findElement(By.xpath("//cite[@class='rd_usr_log']/a[1]")).click();
driver.findElement(By.xpath("//a[@class='rd_logout']")).click();

	}

}
