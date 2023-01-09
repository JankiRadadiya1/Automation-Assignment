package Broken_Links;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//1.get all the hreaf attribute value for links 
//2. Check all the href URL values with HttpURLConnection

//broken -->404 error msg
import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Links {
	 public static WebDriver driver;	
	public static void main(String[] args) throws Exception {
//A broken links is dead link is a link on webpage that no longer works because the website is encounter one or more reasons:->
		//1. an improper URL entered for the link by the website owner
		//2.The destination website removed the linked web page(cause what is know as 404 error)
		//3.The destination website permanantly moved or no longer exsitis 
		
		/*Collect all the links in the web page based on <a> tag.
		Send HTTP request for the link and read HTTP response code.
		Find out whether the link is valid or broken based on HTTP response code.
		Repeat this for all the links captured*/
		
		WebDriverManager.chromedriver().setup();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	         driver = new ChromeDriver();
		     driver.get("http://freecrm.com");
		
		//capture links from webpage:-> with tag "a"
		     List <WebElement> links = driver.findElements(By.linkText("a"));
		//number of links on webpage:->
		     System.out.println(links.size());
		//start for loop to get all links:->
		     for(int  i=0; i<links.size(); i++) {
        //capture all links by using hreaf  attribute we can get URL of requires links
		    WebElement element =  links.get(i);
	        String url = element.getAttribute("href");   //this exclude all the links and images - doesn't have any href attribute
	    //URL is class we need to import 
		    URL link = new URL(url);    
		
      //creating connection using url object 'link' 
		  HttpURLConnection  httpconn = (HttpURLConnection)link.openConnection();      
		 Thread.sleep(2000);
		
    //method used to establish connection 
		httpconn.connect();
		
		int rescode = httpconn.getResponseCode(); //return response if res code is above 400 : broken links
		if(rescode>=400) {
			System.out.println(url + "this is broken link");
		}else {
			System.out.println( url +"this is valid link");
		}
		     }

	}

}
