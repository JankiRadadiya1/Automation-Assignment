package Tool_tip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {
        public static WebDriver driver;
	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.lifelabs.com/");
        driver.manage().window().maximize();
     WebElement link = driver.findElement(By.className("company"));
             String Tooltip = link.getAttribute("title");
		System.out.println("The tooltip value of company is : " +Tooltip);
		 
	}

}
