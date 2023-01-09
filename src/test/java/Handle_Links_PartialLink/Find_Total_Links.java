package Handle_Links_PartialLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Find_Total_Links {
     public static WebDriver driver;
	public static void main(String[] args) {
		// to find total number of links present in webpage:->
		
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://www.lifelabs.com");
         
       //Tagname ->
          List<WebElement> Links = driver.findElements(By.tagName("a"));  // or -> "//a"
        
       //Total number of links present :->
          System.out.println("The total number of links : "+ Links.size());
        
       //if you want to pick any link from webpage - >
          WebElement AnylLink = Links.get(50);
        
       //to determine text or name of the link:->
          System.out.println("The name of the 50th link from webpage is : " + AnylLink.getText());
        
        
        // IMP:-> To all print all links :-> using for loop print all links 
          for(int i =0 ; i<Links.size(); i++) {
         WebElement TotalLinks =  Links.get(i);
      	  System.out.println("All links are :->" + TotalLinks.getText()+"---------------"+TotalLinks.isDisplayed());   //blanks are Hidden links on webpage ->isDisplayed to print hidden links
      
          
        }
 	
	    }
	}

