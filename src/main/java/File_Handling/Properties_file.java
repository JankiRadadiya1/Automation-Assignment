package File_Handling;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Properties_file {
  public static WebDriver driver;
  public static Properties prop;
	public static void main(String[] args) throws IOException { 
		
//1step -  Create object of peroperties file->  create file			
        prop = new Properties();
 String path = System.getProperty("user.dir") +"\\src\\main\\java\\File_Handling\\Rediff.properties";
 //2.Create object of FileInputStream(to read mostly in form of sequence of bytes) -> Read File
 FileInputStream ip = new FileInputStream(path);     
 //3. this will load the file ->Load file
 prop.load(ip);
 
     System.out.println(prop.getProperty("url"));
     System.out.println("username");
     System.out.println("password");

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login1")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.className("signinbtn")).click();
	}
	
}