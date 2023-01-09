package Broken_Links;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
 public static WebDriver driver;
	 
	 @Test
	 public void mains() throws Exception { 
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.hyrtutorials.com");
	
	
              List<WebElement> alllinks =   driver.findElements(By.tagName("a"));	
              
              for(int i=0; i<alllinks.size(); i++) {
            	  
          	    WebElement element =  alllinks.get(i);
    	        String href = element.getAttribute("href"); 	 
          
          URL url = new URL(href);
          
          HttpURLConnection hs = (HttpURLConnection)  url.openConnection();
     	 Thread.sleep(2000);
 		
          hs.connect();
          
           if(hs.getResponseCode() ==200) {
        	   System.out.println(url +"Links is valid"+ hs.getResponseCode()+ "" +hs.getResponseMessage());
           }else {
        	  System.err.println(url +"Links is valid"+ hs.getResponseCode()+ "" +hs.getResponseMessage());
           }

              }}}
    	   

