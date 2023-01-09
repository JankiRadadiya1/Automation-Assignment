package Handle_Checkboxes;
//syntax->//input[contains(@id,'er-messa')]
//click-->checkboxes,links,radiobutton,buttons.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckboxandRadiobutton {

	 public static WebDriver driver;
		public static void main(String[] args) {
			
				WebDriverManager.chromedriver().setup();
				
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize(); 
         driver.get("https://www.spicejet.com");
      
       //click on checkboxes   
         driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
      //counting radiobutton&clicking:->
         driver.findElement(By.xpath("//input[contains(@id,'rbtnl_Trip_1')]")).click();      
     
         List<WebElement>radiobuttons = driver.findElements(By.xpath("//input[contains(@id,'rbtnl_Trip')]"));
         System.out.println("total number of radiobuttons:" + radiobuttons.size());    
        
         //count total num of checkbox:->
    
         List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
	       System.out.println("total number of checkboxs:"+checkboxs.size());
	}
	

}
