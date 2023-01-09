package colour_Handling;
//We can verify the color of a webelement in Selenium webdriver using the getCssValue method and then pass color as a parameter to it. This returnsthe color in rgba() format.
//Next, we have to use the class Color to convert the rgba() format to Hex.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*Syntax
WebElement t = driver.findElement(By.tagName("h1"));
String s = t.getCssValue("color");
String c = Color.fromString(s).asHex();*/


public class CSS_Value {
           public static WebDriver driver;
	public static void main(String[] args) {
		
		String color = driver.findElement(By.xpath("//a[@href='products/']")).getCssValue("color");
	
		String color1 = driver.findElement(By.xpath("//a[@href='products/']")).getCssValue("color");


	}

}
