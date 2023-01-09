import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

// once run than after refershing the project we will get hte extent reports folder with html file copy and paste in chrome we will get the report.
public class ExtendedReport {
	public ExtentReports extent;	
		@BeforeTest
		public static ExtentReports config() {
		 String Path = System.getProperty("user.dir")+"\\reports\\index.html";
		 ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
        reporter.config().setReportName("Web Automation report");
		reporter.config().setDocumentTitle("Test Results");
		ExtentReports	extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "janki radadiya");
		return extent;
		}
		
        @Test
         public void initialDemo() {
	        extent.createTest("Initial Demo");
	        WebDriverManager.chromedriver().setup();
        	WebDriver driver = new ChromeDriver();
        	driver.get("https://rahulshettyacademy.com");
        	System.out.println(driver.getTitle());
	         extent.flush();
	
}		
	}


