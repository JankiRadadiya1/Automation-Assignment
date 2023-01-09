package Mouse_Operations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
//right click ->CONTEXTCLICK METHOD
public class Rightclick_Operations {
//IMP->By using Actions class methods we can perform all the mouse operations:-> 	
	 public static WebDriver driver;
	public static void main(String[] args) {
		
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	 
	 //RIGHT CLICK performing ->bycontextClick
WebElement button = driver.findElement(By.xpath("//h2[@id=\"example-code-simple-context-menu\"]/preceding::p/child::span[1]"));			
	 Actions act = new Actions(driver);
                  act.contextClick(button).perform();    //IMP->build method create an action and perform method perform the action (no need to write bulid bith are done by perform method)
		

		
		
		
		

	}

}
