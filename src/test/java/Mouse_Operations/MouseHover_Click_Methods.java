package Mouse_Operations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Mouse hover ->MOVETOELEMENT METHOD
public class MouseHover_Click_Methods {

	 public static WebDriver driver;
		public static void main(String[] args) {
			
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.opencart.com/");
		 driver.manage().window().maximize();
		 
	WebElement desktopsMenu = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));   
	 WebElement SubMenu = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

	 Actions act = new Actions(driver);     //driver is a instance in this line and creating object of action class 
     act.moveToElement(desktopsMenu).moveToElement(SubMenu).click().perform();
	 
	
	 
	}

}
