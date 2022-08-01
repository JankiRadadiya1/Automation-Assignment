package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_CSSselector {
           public static WebDriver driver;
	public static void main(String[] args) {
		
                 WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
                 driver.get("https://www.rediff.com/"); 
                 driver.findElement(By.cssSelector("div.cell.topicons>a.mailicon:nth-child(1)")).click();
                 driver.navigate().back();
                 driver.findElement(By.cssSelector("a.moneyicon.relative")).click();
                 driver.navigate().back();
                 driver.findElement(By.cssSelector("a.moneyicon.relative+a.bmailicon.relative")).click();
                 driver.navigate().back();
                 driver.findElement(By.cssSelector("span.username+p>a:nth-child(1)")).click();
                 driver.findElement(By.cssSelector("div#div_login_error+div.table>div.row>div.cell:nth-child(1)+div>input:nth-child(1)")).sendKeys("seleniumpanda@rediffmail.com");
                 driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
                 driver.findElement(By.cssSelector("input#password+input.signinbtn")).click();
                 driver.findElement(By.cssSelector("div.setting_rd>span+i+a.rd_setting_panel")).click();
                 driver.findElement(By.cssSelector("cite.arrow_box+li+li>a:nth-child(1)")).click();
                 driver.findElement(By.cssSelector("cite.arrow_box+li+li+li>a:nth-child(1)")).click();
                 driver.findElement(By.cssSelector("a.rd_logout")).click();
	}

}
