package UploadFile_Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//don't click on choose file button it will take you to desktop app just inspect and inside sendkeys give path of the file it will select itself
public class How_we_can_Upload_inselenuim {
   public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
      driver.findElement(By.xpath("//div[@id=\"user-signup-actions\"]/child::div/child::div/child::h2/following-sibling::a[2]")).click();
	 driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\janki\\Pictures\\Screenshot 2022-03-22 180416.png.");
	
	}

}
