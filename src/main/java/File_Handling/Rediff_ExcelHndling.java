package File_Handling;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_ExcelHndling {
	public static WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "getData")
	public void loginTest(String Username, String Password) {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
	}

	@DataProvider()
	public String[][] getData() {
		String path = System.getProperty("user.dir")
				+ "\\src\\main\\java\\File_Handling\\RediffLoginData.xlsx";

		Xls_Reader xls = new Xls_Reader(path);
		// counting rows
		int rows = xls.getRowCount("RediffLogin");
		System.out.println(rows);

		// counting cols
		int cols = xls.getColumnCount("RediffLogin");
		System.out.println(cols);

		String[][] rediffLoginData = new String[rows][cols];

		for (int i = 1; i <= rows; i++) {

			for (int j = 0; j < cols; j++) {
				rediffLoginData[i - 1][j] = xls.getCellData("RediffLogin", i, j);
			}
		}

		return rediffLoginData;

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
