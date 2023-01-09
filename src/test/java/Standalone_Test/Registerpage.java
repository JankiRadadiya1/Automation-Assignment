package Standalone_Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Registerpage {
public static  SoftAssert softassert ;
	@Test
	public static void Register() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://rahulshettyacademy.com/client");
	     driver.findElement(By.className("btn1")).click();
	    driver.findElement(By.id("firstName")).sendKeys("Janki");
	    driver.findElement(By.id("lastName")).sendKeys("Radadiya");
	    driver.findElement(By.id("userEmail")).sendKeys("jankiradadiya3110@gmail.com");
	    driver.findElement(By.id("userMobile")).sendKeys("4167013255");
WebElement drp = driver.findElement(By.xpath("//input[@id='login']/preceding::select[1]"));
 Select select = new Select(drp);
  select.selectByIndex(3);
  
 Assert.assertFalse(driver.findElement(By.xpath("//input[@id='login']/preceding::label[3]/child::input[@type='radio']")).isSelected()); //to check is sselected or not so not selected so false->not faling
  driver.findElement(By.xpath("//input[@id='login']/preceding::label[3]/child::input[@type='radio']")).click();       //now selecting
  Assert.assertTrue(driver.findElement(By.xpath("//input[@id='login']/preceding::label[3]/child::input[@type='radio']")).isSelected()); //again checking now is selected or not so yes->return true and not failled	
	
driver.findElement(By.id("userPassword")).sendKeys("Bhavna@1410");
driver.findElement(By.id("confirmPassword")).sendKeys("Bhavna@1410");
	
driver.findElement(By.className("col-md-1")).click();
driver.findElement(By.id("login")).click();


}}
