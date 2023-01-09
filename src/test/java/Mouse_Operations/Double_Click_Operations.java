package Mouse_Operations;
//Double click ->Double Click Method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click_Operations {
  
	 public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:/api.jquery.com/dblclick");
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		  
		 Actions act = new Actions(driver);
	 act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();

	}

}
