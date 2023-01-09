package FindElements_Findelement;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DB_FindElement_elements {

		  public static WebDriver driver;
			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();		
				driver.get("https://demo.nopcommerce.com/");
			
		/*FindElement:->Single WebElement present ---->Returns Single Element DEF->method returns the first matching element on the current page. and if element is not found then throw nosuchelementFoundException
				        Multiple WebElements present-->Return Single element
				        Element not present--->Throws NOSuchElementException
				                   Return Type-->WebElemnt
				                   Access--->Directly
		FindElements:->Single WebElement present----->Return Single Element
				      Multiple WebElements present-->Return all element  DEF->Method return all the matching element on the current page and it doen't throw any exception if the element is not found instead it will return zero
				       Element not present--->Does not Throws Exception return Zero Elements
				                Return Type-->List<WebElement>
				               Access--->Iterate the list of Elements
		*///	---------------------------------------------------------------------------------------------------------------------------------------------	
				//Findelements()---->Return Multiple web elements  //Return type--->List -->collection type which hold mutiple objects like WebElements.
		//Creating-->variable->links and type of variable is List<Webelement> which is return type of WebElements 

			     List<WebElement>links= driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
				  System.out.println("number of elemts captured " +links.size());  //22
				
				  for(WebElement ele:links) {// to print all List of WebElements we use For loop always
				
				   System.out.println(ele.getText());       //-->In this loop ele is variable and links capture all links one by one in loop
				}
				
			}
	}

