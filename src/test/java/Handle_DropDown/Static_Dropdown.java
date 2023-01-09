package Handle_DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_Dropdown {

	 public static WebDriver driver;
		public static Select select;	   
				public static void main(String[] args) {
	
	 //select class only used when there is select tagname 
					
					 WebDriverManager.chromedriver().setup();
					 driver = new ChromeDriver();
					 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	      //static dropdown -> when there is tagname as select , and the dropdown value is fixed not moving scrolling
					 
					 WebElement drpdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
					 Select sele = new Select(drpdown);               //we have to pass parameter of value(address of drpdown)
					 
//SELECT CLASS METHODS(only when there is static dropdown with select tag in DOM)			 
	                          sele.selectByIndex(3);
	                          System.out.println(sele.getFirstSelectedOption().getText());
	                          
                             sele.selectByValue("AED");
                             System.out.println(sele.getFirstSelectedOption().getText());
                             
	                         sele.selectByVisibleText("USD");  
	                         System.out.println(sele.getFirstSelectedOption().getText());
	
	
	
}
}