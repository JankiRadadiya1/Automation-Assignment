package Navigate_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatinalcommands {

	 public static WebDriver driver;
		public static void main(String[] args) {
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\janki\\Automation Learning\\ChromeDriver\\chromedriver.exe\\");
	WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize(); //maximize browser
    driver.get("https://www.google.com");//open any application
	driver.get("https://www.fb.com");	
	driver.navigate().back();
	driver.navigate().forward();
	  

	}

}
