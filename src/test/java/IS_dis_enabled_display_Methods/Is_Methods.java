package IS_dis_enabled_display_Methods;
//Q->how you determine the presence of webelement in webpage-->is done by isdisplay() and isEnabled()  (no method such method as IS)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Methods {
            public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	  	driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		// how to check webelement is Displayed, Enabled and Selected:-> isDisplayed(),isEnabled(),isSelected.	--->return Boolean Value
		   
		   WebElement  searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//		   System.out.println("Display Staus:-> "+ searchStore.isDisplayed());    
//		   System.out.println("Display Staus:-> "+ searchStore.isEnabled());  
		        
		//isSelected-->for dropdown,Radio buttton,
		       WebElement Male = driver.findElement(By.id("gender-male"));
		       WebElement Female = driver.findElement(By.id("gender-female"));
		       System.out.println(Male.isSelected()); //False
		       System.out.println(Female.isSelected()); //False
		       Male.click();                     //now Male will be True
		       System.out.println(Male.isSelected()); //True
		       System.out.println(Female.isSelected());//False
		       
		

	}

	}

