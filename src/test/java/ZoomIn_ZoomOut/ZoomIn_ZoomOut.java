package ZoomIn_ZoomOut;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomIn_ZoomOut {
       public static WebDriver driver;
	public static void main(String[] args) throws Exception {
 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://rediff.com");
			//using JavaScript executor :->		 
		 
//Zoom In (higher magnification):->
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom = '250%'");
		Thread.sleep(2000);

//Zoom Out (Lower Magnification):->
		js.executeScript("document.body.style.zoom = '50%'");
		Thread.sleep(2000);
//Normal by Default :->
		js.executeScript("document.body.style.zoom = '100%'");
         Thread.sleep(2000);
	
		
		
		

	}

}
