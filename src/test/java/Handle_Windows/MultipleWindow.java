package Handle_Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {
	@Test
	public void mytest() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/browser-windows");
		        driver.manage().window().maximize();	         
		        driver.findElement(By.id("tabButton")).click();	     		        
		 
      Set<String> ids = driver.getWindowHandles();
	
       Iterator<String> ie = ids.iterator();
       
     String parent = ie.next();   
     String child = ie.next();
    
   System.out.println("Parent window id" + parent);
   System.out.println("Child window id "+ child);

   driver.switchTo().window(child);
   Thread.sleep(2000);
	String tets = driver.findElement(By.id("sampleHeading")).getText();
    System.out.println(tets);    
driver.switchTo().window(parent);



driver.findElement(By.id("windowButton")).click();
driver.findElement(By.id("windowButton")).click();
driver.findElement(By.id("messageWindowButton")).click();
String mainWindowHandle = driver.getWindowHandle();
Set<String> allWindowHandles = driver.getWindowHandles();
Iterator<String> it = ids.iterator();
  while(it.hasNext()) {
	  String ChildWind = it.next();
	  if (!mainWindowHandle.equalsIgnoreCase(ChildWind)) {
          driver.switchTo().window(ChildWind);
          WebElement text = driver.findElement(By.id("sampleHeading"));
          System.out.println("Heading of child window is " + text.getText());
          driver.close();
          System.out.println("Child window closed");
	  }	

	}}
}
