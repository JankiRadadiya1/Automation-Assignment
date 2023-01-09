package Handle_Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingframes {

	 public static WebDriver driver;
		public static void main(String[] args) {
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\janki\\Automation Learning\\ChromeDriver\\chromedriver.exe\\");
				WebDriverManager.chromedriver().setup();
	    	 driver= new ChromeDriver();
		 driver.manage().window().maximize(); //maximize browser
      driver.get("https://jqueryui.com/droppable/");//open any application
   
      // total num of  frames:->
      List<WebElement> frames = driver.findElements(By.tagName("iframe"));
      System.out.println("total num of frames:"+frames.size());
      
     driver.switchTo().frame(0);   //more than one frames is 0
    
     // capture drag to my target text of frame:->
    System.out.println(driver.findElement(By.id("draggable")).getText());
    
    
    //operations by mouse eg->drag&drop ->Actions is use (class)
    Actions action = new Actions(driver);
    WebElement source= driver.findElement(By.id("draggable"));
    WebElement target = driver.findElement(By.id("droppable"));
    action.dragAndDrop(source,target).build().perform();
    
     // how do you bring position outside of frame:-> selecting out of frame
     driver.switchTo().defaultContent();
     driver.findElement(By.linkText("Selectable")).click();
        

	}

}
