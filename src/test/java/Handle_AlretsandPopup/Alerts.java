package Handle_AlretsandPopup;
//Alert is not a class return alert interface 
//Selenium up-cast the object to Alert Interface in the above line of code With this API, we can perform the below operations on the pop-up.
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
     public static WebDriver driver;
	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\janki\\Automation Learning\\ChromeDriver\\chromedriver.exe\\");
			WebDriverManager.chromedriver().setup();
	    	WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();                       //maximize browser
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //open any application
		//clicking on go button:->
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		  //1st to capture a alerts(enter into alert):-> interface
		  Alert alert =driver.switchTo().alert(); //same in frames,windows,alerts  c //not a class alert it only return alert interface
		 System.out.println("text inside alert is:"+alert.getText());	  
		 
		 //click on alert ok button:->for ok -> accept
         alert.accept();
         //dismiss->for cancel -> dismiss
 //        alert.dismiss();

          driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
          driver.findElement(By.id("password")).sendKeys("Selenium@123");
          driver.findElement(By.name("proceed")).click();
	}
	

}
