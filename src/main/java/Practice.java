
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
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
    public static WebDriver driver;	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
	//Validate all links of the webpage:->
		
	 List<WebElement> allinks = driver.findElements(By.tagName("a"));
        System.out.println(allinks.size());
	for(int i=0; i<allinks.size(); i++) {
	System.out.println(allinks.get(i).getText()+" -------------------"+allinks.get(i).isDisplayed());	
	String url = allinks.get(i).getAttribute("href");
	System.out.println(url);
	
	//Validate radio button ->
	System.out.println("----------------------------------------------------------------------------------------");
	Assert.assertFalse(driver.findElement(By.id("gender-female")).isSelected());//false	 
	System.out.println(driver.findElement(By.id("gender-female")).isSelected());	
	driver.findElement(By.id("gender-female")).click();

	
	//scrolling page:->
	JavascriptExecutor js =(JavascriptExecutor)driver;
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	js.executeScript("window.scrollBy(0,500)");
	
	
//screenshot->1.casting driver object to TakeScreenshot Interface  2.getScreenshotAs method 3.as paramneter ->OutputType.FILE so get output in file format
	//4.and Storing that screenshot in src 5.To get the screenshot on local machine from src object-> fileUtils
	
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try{
		FileUtils.copyFile(src, new File("C:\\Users\\janki\\Automation Learning\\homePageScreenshot.png"));
}catch(IOException e){
	System.out.println(e.getMessage());
	
	}
	
	}
	 
	}
}
		
	

	
		
	
	


