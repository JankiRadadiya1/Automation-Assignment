package Handle_Frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//when elements present inside frame       Browser-->Page-->Frame(webelement->button,links,etc) we have to switch from page to frame
//Frame has index start from(0) and name 

public class Handle_Frames {
 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.id("password")).sendKeys("Selenium@123");
			driver.findElement(By.className("signinbtn")).click();
			Thread.sleep(3000);
     		driver.findElement(By.xpath("//a[text() = 'SeleniumPanda']")).click(); //sometimes xpath right but not working showing exception element not found
	//so we have first go inside that frame :->
     		driver.switchTo().frame("mainpanel"); //to find go in the view page source you will find frame name there
		
	
	}

}
