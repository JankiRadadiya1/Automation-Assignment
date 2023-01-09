package File_Handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ApachePOI {
	public static void main(String[] args) throws IOException {
 // what you have used to fetech data from excel sheet -> i have used Apache POI 
	// to connect java and excel we have libraray that is POI API 1.we have to add dependency in POM 

	//FileInputStream arguments:->
	FileInputStream fis = new FileInputStream("C:\\Users\\janki\\Desktop\\Janki IT\\demodata.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	int sheets = workbook.getNumberOfSheets();
	for(int i=0; i<sheets; i++) {
	if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))	
	{
	XSSFSheet sheet =	workbook.getSheetAt(i);  //0 th index of sheet 
	//sheet.
	}
	
	}
	}
	
	}
	
	

