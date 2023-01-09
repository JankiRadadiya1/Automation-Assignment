package IMP_JavaScriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//why even we need to use this ? ->Ans->when the all locator fail not execute than we use JavaScriptExecutor
//In eclipse we write code and --> all convert in JavaScript--> that JavaScript is understand by browser 
// Javascriptexecutor- > language of the browser (Interface) which helps to execute JavaScript via Selenium WebDriver  
//2 types of Methods JavaScript ->1. ExecuteScript   ,2. executeAsyncScript
public class JavaScriptExecutor {
      public static WebDriver driver;
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
//Basic Syntax->We have to cast the driver object into the JavascriptExecutor type to use the methods present in the JavascriptExecutor interface.
JavascriptExecutor js = (JavascriptExecutor) driver; //-->casting driver to javascript executor       

		js.executeScript("javascript command");
		js.executeAsyncScript("javascript command");	
		
	//1.when we have to click on element using javascriptExecutor:->	
		driver.get("https://google.com");
		js.executeScript("document.getElementsByName('btnI')[0].click()");

		/* (same as above) click i am lucky button in selenium
		driver.findElement(By.name("btnI")).click();*/
		
//2.senkeys with JavaScript executor:->		

		driver.get("https://google.com");
		js.executeScript("document.getElementById('lst-ib').value='chercher tech'");

		/* (same as above) send keys to search bar in selenium
		driver.findElement(By.id("lst-ib")).sendKeys("chercher tech");*/
		
//3.scrolling with javasriptexec->
		js.executeScript("window.scrollBy(0,300)", args);
		
//Scroll Into View in JavascriptExecutor:->
		// open webpage
		driver.get("https://chercher.tech/java/javascript-executor-selenium-webdriver");
		// scroll to particular element
		js.executeScript("document.getElementById('default').scrollIntoView(true)");
		
//Title of the page with JavascriptExecutor :
			// return the title of the page
			js.executeScript("return document.title");
			/* //(same as above) get title
			driver.getTitle();*/
			
//URL with JavascriptExecutor :
//We can retrieve the URL of the current page with JavascriptExecutor using the document.URL javascript command.
			// return the url of the page
			js.executeScript("return document.title");
			/* //(same as above) get url
			driver.getCurrentUrl();*/
		
//Zoom Levels with JavascriptExecutor :-
//				Use document.body.style.zoom helps to set the zoom level on the webpage.
//				The below code sets the zoom level to 90%.
				// set zoom level to 90%
				js.executeScript("document.body.style.zoom='90");
				
//Highlight an Element in JavascriptExecutor :-
//We can highlight the element using JavascriptExecutor; to highlight an element first, we have to find the element uniquely. style.backgroundColor changes the background of the element to 'custom color'.
				// highlight the search bar on google.
				js.executeScript("document.getElementById('lst-ib').style.backgroundColor='red'");		
		
	//13. To find hidden element:
  // identify element and set value
			      js.executeScript
			      ("document.getElementById('displayed-text').value='Selenium';");
			   String s = (String) js.executeScript("return document.getElementById('displayed-text').value");
			      System.out.print("Value entered in hidden field: " +s);
			      driver.close();
	
		
		
		
		
	}


		
	
	}


