package FindElements_Findelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FristTestClass {

	@SuppressWarnings("deprecation")
	public static <Webelement> void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.google.com");
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait:->
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://signin.ebay.ca/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.ca%2F");
		
		driver.findElement(By.id("signin_ggl_btn")).click();	
		
//	WebElement textbox = driver.findElement(By.name("userid"));	  //same steps by.name
//	textbox.sendKeys("jankiradadiya1410@gmail.com");              //filling field with text
//	driver.findElement(By.id("signin-continue-btn")).click();     //click to login button

		
	   ///xpath//
		
//	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Jankiradadiya1410@gmail.com");  //XPATH
		//	driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).click();
		
	 ///findelements
	//1) if we want to count links or text of link on page we use findelements
		
//	   List<WebElement>  elements = driver.findElements(By.tagName("a")); 
	   //size of linklist:-
//	 int count = elements.size();
//	 System.out.println("count of elements : "+count);
		
		
		

	}

}
