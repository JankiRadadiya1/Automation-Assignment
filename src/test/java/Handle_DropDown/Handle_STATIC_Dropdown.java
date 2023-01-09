package Handle_DropDown;
//use select class methods when only there is select tagname to the drpdown
//Find the dropdown using findElement
//Create an object for Select class passing dropdown element as a parameter
//Select the value from the dropdown values
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_STATIC_Dropdown {
 //Drop down is a WebElement and it have options that is also called webelement:->
	 public static WebDriver driver;
	public static Select select;	   
			public static void main(String[] args) {
				//selected dropDown(input-country)and pass elements into contructor as drpCountryEle and drpCountry is select class instance variable which use to access this three methods:->

				//IMP->what are 3 methods in select class to handle drop down?				
				//1)selectByVisibleText()  (preffered)
				//2)selectByValue             (no preffered because it can change anytime )
				//3)selectByIndex			 (no preffered because it can change anytime )
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();				
				driver.get("https://www.opencart.com/index.php?route=account/register");
		
//1.with the Select class object we can access three different methods -->Select class is provided by selenuim Webdriver
					 
			select = new Select(driver.findElement(By.id("input-country")));  //Select-> class,drpCountry->select class instance var,select() select class contain default constructor which accept the elements(drpCountryEle)						     
						select.selectByVisibleText("Denmark");
		
//2 second way :-> 
						
						   WebElement drpCountryEle = driver.findElement(By.id("input-country")); //first selected dropdown   
							Select drpCountry = new Select(drpCountryEle);
			                    
				                             drpCountry.selectByVisibleText("Denmark");
				                             drpCountry.selectByValue("38"); //Canada				
				                             drpCountry.selectByIndex(13);  //Australia
				
				
	//3.without using Select Methods also we can select drop down:->
				
				
				List<WebElement> alloptions = drpCountry.getOptions();  //we have to capture all the elements in the variable
				
				   for(WebElement option:alloptions)                    //reading alloptions with alloptions  var to option webelement 
				{
					if(option.getText().equals("Cuba")) {               //from webElement (option)-->capturing getValue which equals to Cuba
						option.click();                                 //option webElement clicking on that element 
					     break;
					}
				}
			}	                    
		
	}
