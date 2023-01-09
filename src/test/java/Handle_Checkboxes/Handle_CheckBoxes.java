package Handle_Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_CheckBoxes {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");

    //1)How to select specific checkbox:->
		
              //driver.findElement(By.xpath("//input[@id='monday']")).click(); //Selected Monday
		
	//2)how to select all the checkboxes:->
		
	        List<WebElement> checkboxes	= driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'day')]"));
		    System.out.println("total number  of checkboxes: "+ checkboxes.size());
	
   //using for loop:->	
	/*	for(int i=0;i<=checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
	//also we can do with for each loop:-> easy way to do
		for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
  //3)how to select last two checkboxes from all chckboxes:-> //count total no of checkboxes
		
		int totalcheckboxes = checkboxes.size();
		
		for(int i = totalcheckboxes-2;i<totalcheckboxes;i++) //to select last checkboxes 3 or 2 
		{
			checkboxes.get(i).click();
		}
	//4)Select First 2 check boxes:->
		
		for(int i=0; i<totalcheckboxes; i++)
		{
			if(i<2)
		{
			checkboxes.get(i).click();
		}
		}
	 }

	}


