package basicwebapp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Allbrowser {
	public static WebDriver driver;
	@Test
	public void openallbrowser() {	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("www.rediff.com");
	}
	@Test
	public void firfoxdriver(){
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("www.facebok.com");
	}
	@Test
	public void edge(){
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("www.https://www.fieldglass.net/?logOut");
}
	@Test
	public void safari(){
		
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get("www.google.com");



	}
}
