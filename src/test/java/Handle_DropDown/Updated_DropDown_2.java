package Handle_DropDown;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Updated_DropDown_2 {
	public static WebDriver driver;
	 public static Select select;
	
@Test
public void DropDown() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://easemytrip.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	String PreSelection = driver.findElement(By.xpath("//div[@id = 'myDropdown_n']/preceding::span[1]")).getText();
	System.out.println("Total passengers before booking EMT : " + PreSelection);

	driver.findElement(By.xpath("//div[@id = 'myDropdown_n']/preceding::span[1]")).click();

	int Adult = 1;
	while (Adult < 3) {
	driver.findElement(By.xpath("//*[@id='myDropdown_n']/div/div[1]/div[2]/div/div[3]/input")).click();
	Adult = Adult + 1;
	}


	int Child = 1;
	while (Child < 3) {
	driver.findElement(By.xpath("//*[@id='myDropdown_n']/div/div[2]/div[2]/div/div[3]/input")).click();
	Child = Child + 1;
	}


	int Infant = 1;
	while (Infant < 3) {
	driver.findElement(By.xpath("//*[@id='myDropdown_n']/div/div[3]/div[2]/div/div[3]/input")).click();
	Infant = Infant + 1;
	}


	String PostSelection = driver.findElement(By.xpath("//div[@id = 'myDropdown_n']/preceding::span[1]")).getText();
	System.out.println("Total passengers after booking EMT : " + PostSelection);

	driver.findElement(By.xpath("//a[@id = 'traveLer']")).click();

	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.spicejet.com/");

	String PreSelectionSpiceJet = driver.findElement(By.xpath("//div[contains(text(), '1 Adult')]")).getText();
	System.out.println("Total passengers before booking SJ : " + PreSelectionSpiceJet);
	driver.findElement(By.xpath("//div[contains(text(), '1 Adult')]")).click();


	int AdultSpiceJet = 1;
	while (AdultSpiceJet < 3) {
	driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
	AdultSpiceJet = AdultSpiceJet + 1;
	}


	int ChildSpiceJet = 1;
	while (ChildSpiceJet < 3) {
	driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
	ChildSpiceJet = ChildSpiceJet + 1;
	}


	int InfantSpiceJet = 1;
	while (InfantSpiceJet < 3) {
	driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]")).click();
	InfantSpiceJet = InfantSpiceJet + 1;
	}

	String PostSelectionSpiceJet = driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]/div[1]")).getText();
	System.out.println("Total passengers after booking SJ : " + PostSelectionSpiceJet);



}

	

}
