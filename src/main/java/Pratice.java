import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Pratice {
	
public static WebDriver driver;

	@Test
	public void setup() throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.loblaws.ca/");
		driver.manage().window().maximize();
  Thread.sleep(2000);
  
    String Expected = driver.getTitle();
    String actual = "Loblaws Supermarket | Grocery shop online or instore";
    Assert.assertEquals(actual ,Expected);
    
 
  List<WebElement> links = driver.findElements(By.tagName("a"));
  
  System.out.println(links.size());
 for(int i=0; i<=links.size(); i++) {
	 
         System.out.println(links.get(i).getText());  
	 String alllinks = links.get(i).getAttribute("href");
	 System.out.println(alllinks);
	 
	 
	     File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(sc, new File("C:"));
	 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("document.getEelementById('drgvd').value='Janki'");
	js.executeScript("windows.scrollBy(0,300)");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(200));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("nsdjn"))).click();
	
	Select select = new Select(driver.findElement(By.id("dgfd")));
	
	select.selectByIndex(1);
	 
 }
 
		
		
		
		}
			
	
		}
	 
	 

	   
	   
		

	
	
	
	
	
	

	
	
	


