package Navigate_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Methods {
     public static WebDriver driver;
	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(4000);
		driver.get("https://www.Google.com");//we can also open Website with  :-> driver.navigate.to
		
	//To Navigate Back to same Page:->
		driver.navigate().back();	 
	//To Navigate Forward to other page:->
		driver.navigate().forward();
    //to refresh/reload the page:->
		driver.navigate().refresh();
	    
	}

	}

