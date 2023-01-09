package Dropdown;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Steps to find Option present in the dropdown or not in webdriver:->
/*Find the dropdown using findElement() Method
Create an object for Select class passing above found element
use getOptions() method present in Select class object and store values(it returns webelement in list) in List
iterate the list to get the text from the Options one by one
compare the result text with the expected result*/
public class Dropdowns {
	 public static void selectDate(WebElement calendar, String year, String monthName, String day, WebDriver driver) throws ParseException, Exception
	   {
		 WebDriverManager.chromedriver().setup();
	          driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("http://www.redbus.in/");
		      driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click();
		      Thread.sleep(5000);
		      List<WebElement> li=driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		      int size1=li.size();
		      for(int i=0;i<size1;i++)
		      {
		         String date=li.get(i).getText();
		         System.out.println(date);
		         if(date.equals("21"))
		         {
		            li.get(i).click();
		         }
		      }
		      driver.close();
		   }

}
