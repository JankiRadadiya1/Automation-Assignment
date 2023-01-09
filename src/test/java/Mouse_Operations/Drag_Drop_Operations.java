package Mouse_Operations;
//drag-drop ->DragAnddrop Method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//IMP- >to perform drag and drop we need to know SOURCE AND TARGET elements source(from where to pick)target(where to drop)
import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop_Operations {

	public static WebDriver driver;
	public static void main(String[] args) {
		
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
	WebElement source = 	driver.findElement(By.id("box6"));		//source
        WebElement target = driver.findElement(By.id("box106"));   //target
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();  //direct drag and drop method

	}

}
