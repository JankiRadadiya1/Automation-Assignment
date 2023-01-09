package InputBox_GetText_GetAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBox_GetText_GetAttrib {
    public static WebDriver driver;
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		//to clear the text input from the Textbox:->
		
		WebElement emailinputbox = driver.findElement(By.id("Email"));
	
		emailinputbox.clear();  //clear value from the textbox
		emailinputbox.sendKeys("adm123@gmail.com"); //input value in textbox
		
		
		//Capturing text from input box:->
    	System.out.println("Resultfrom getAttribute method :->" +emailinputbox.getAttribute("value"));		
    	
     	System.out.println("Resultfrom gettext method :->" +emailinputbox.getText());  //getText()
     	
//	gettext()-> method returns the innerText of an element.
//  getAttribute()->method fetches the text contained by an attribute in an HTML document.
		
	}

	}

