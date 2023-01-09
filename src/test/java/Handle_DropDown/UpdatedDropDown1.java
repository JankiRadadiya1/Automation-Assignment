package Handle_DropDown;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class UpdatedDropDown1 {

		 public static WebDriver driver;
			public static Select select;	   
					public static void main(String[] args) throws Exception {

						 WebDriverManager.chromedriver().setup();
						 driver = new ChromeDriver();
					 
						driver.get("https://easemytrip.com");
						driver.manage().window().maximize();			
						driver.findElement(By.id("trvlr_colm")).click();
						driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
						System.out.println(driver.findElement(By.id("trvlr_colm")).getText());	
			  /*           int i=1;
						while(i<5)	{
					     i++;					 
				}*/
									for(int i=1; i<5; i++) {
						  driver.findElement(By.id("add")).click();      //2adults selected but what if we want to select 5 adults using LOOP like for and while
					}			
					driver.findElement(By.id("traveLer")).click();				
				System.out.println(driver.findElement(By.id("trvlr_colm")).getText());	  
			
				
				
//-------------------------------------------------------------------------------------------------------------------------------------------------	
				
/*				
			//done by udemy on spicejet website:->			 
						 
						 driver.findElement(By.id("divpaxinfo")).click();
						   Thread.sleep(2000L);
						   /*int i=1;
						while(i<5)
						{
						driver.findElement(By.id("hrefIncAdt")).click();//4 times
						i++;
						}
						   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
						for(int i=1;i<5;i++)
						{
						driver.findElement(By.id("hrefIncAdt")).click();
						}
						driver.findElement(By.id("btnclosepaxoption")).click();
						Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
						System.out.println(driver.findElement(By.id("divpaxinfo")).getText());	
*/	
	}

}
