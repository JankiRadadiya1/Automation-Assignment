package Handle_Links_PartialLink;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

//Broken link ->means it not run it shows error when you click on that link ->Broken URL
//there is 100 links so which is broken is here:->
public class Broken_Links {
       public static WebDriver driver;
	public static void main(String[] args) throws IOException, IOException {
		
//Step 1->Is to get all the URL's tied up to the links using selenuim ->getattribute of href
//2->//there is Java methods will call URL and get you the status code of broken links
//3-.>if status code is greater than 400 than url is not working ->link which tied to url is broken		
//method of class url ->openConnection()	so create obj of URL ->new URL(url).openConnection();  
// this methos return type is HttpURLConnection
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/AutomationPractice/");

     List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
     SoftAssert a =new SoftAssert();
     for(WebElement link : links)
     {
         String url= link.getAttribute("href");

         HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
         conn.setRequestMethod("HEAD");
         conn.connect();
         int respCode = conn.getResponseCode();
         System.out.println(respCode);
        a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
     }
     a.assertAll();

	}

}
