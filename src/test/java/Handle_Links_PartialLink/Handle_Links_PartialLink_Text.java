package Handle_Links_PartialLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Links_PartialLink_Text {
      public static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.findElement(By.linkText("Features")).click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Logi")).click(); //if write half text of link it will find and click on link using partial link 
	}

}
