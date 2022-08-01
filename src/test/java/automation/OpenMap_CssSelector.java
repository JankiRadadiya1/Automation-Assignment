package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMap_CssSelector {

	public static void main(String[] args) {
		
      	WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
		 driver.get("https://openweathermap.org/");
         
		 driver.findElement(By.cssSelector("ul#first-level-nav>li:nth-child(1)>a>img")).click();
		 driver.findElement(By.cssSelector("div#desktop-menu>form>input")).click();
		 driver.findElement(By.cssSelector("div#desktop-menu>form+ul>li:nth-child(1)>a:nth-child(1)")).click();
		 driver.navigate().back();
		 driver.findElement(By.cssSelector("div#desktop-menu>form+ul>li:nth-child(1)+li>a:nth-child(1)")).click();
		 driver.findElement(By.cssSelector("div.search-container>input:nth-child(1)")).sendKeys("monday");
		 driver.findElement(By.cssSelector("div.search-container+button.button-round.dark")).click();
		 driver.navigate().back();
		 driver.findElement(By.cssSelector("div.page-container>div>div.controls>div.control-el+span")).click();
		 driver.findElement(By.cssSelector("a.ow-btn.round.btn-black")).click();
		 driver.findElement(By.cssSelector("div.mobile-padding>h1>span.orange-text")).click();
		 driver.findElement(By.cssSelector("a.white-text+b+br+b+a.white-text")).click();
		 driver.navigate().back();
		 driver.findElement(By.cssSelector("div.footer-section>div.section-content>ul>li>a:nth-child(1)")).click();
		 driver.findElement(By.cssSelector("li.user-li>a:nth-child(1)")).click();
		 driver.findElement(By.cssSelector("div#support-dropdown")).click();
		 driver.findElement(By.cssSelector("ul#support-dropdown-menu>li:nth-child(1)>a")).click();
		 driver.findElement(By.cssSelector("ul#support-dropdown-menu>li:nth-child(1)+li>a")).click();
		 driver.findElement(By.cssSelector("ul#support-dropdown-menu>li:nth-child(1)+li+li>a")).click();
		 driver.findElement(By.cssSelector("div.section>div.section-content.grid-container.mobile-padding:nth-child(1)")).click();
		 driver.findElement(By.cssSelector("div.section-content>div.section-content.grid-container")).click();
		 
		 
		 
	}

}
