package WebTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Webtable {
          public static WebDriver driver;
	public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.fieldglass.net/time_sheet_list.do?cf=1");
       
//1. finds total row in the table:->
       
     int rows  = driver.findElements(By.xpath("/table[@class='bx--data-table']/child::thead/following-sibling::tbody/child::tr")).size();
     System.out.println("Total number of rows is : " + rows);
  
//2.Find total number of colounm in the table:->
  
         int cols = driver.findElements(By.xpath("//table[@class='bx--data-table']/child::thead/child::tr/th[1]")).size();
         System.out.println("Total number of column in table : "+ cols);
  
//3. retrieve the specific row/column data:->
        
         for(int r=1;r<=rows;r++) {           //1
	         for(int c=1;c<=cols;c++) {       //1		  
	  }
     } 
       String value = driver.findElement(By.xpath("table[]@class='data-list']//tr[2]/td[1]")).getText();
       System.out.println("the value is "+value);
 
       driver.close();
  

	}

}
