package File_Handling;

public class ExcelFILE_Handling {
public static void main(String args[]) {
//1.create excelfile(all data is stored)
//2. you need to update your pom.xml file with lot of apachePOI maven dependencies
//3. you need utilize a utility file to do excel operations(xls.reader)
//4. you need to know what operation are required
	
	String path= System.getProperty("user.dir") + "\\src\\main\\java\\File_Handling\\data.xlsx.xlsx";
	 Xls_Reader xls = new Xls_Reader(path);
	
	//1.get row count
        int rows =  xls.getRowCount("RediffMail");            //RediffMail is Excel sheet name 
	    System.out.println(rows);    
	//2.get cell count  
	    int cols = xls.getColumnCount("RediffMail");
	    System.out.println(cols);
	 //3.Read data from excel sheet
	    String data = xls.getCellData("RediffMail", "Password", 3);
	    System.out.println(data);
	//4.Write into data file
	   boolean dataentry =  xls.setCellData("RediffMail","Password", 10 , "janki@3110");
       System.out.println(dataentry);
	 
}
}