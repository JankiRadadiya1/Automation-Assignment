package Practice;

import File_Handling.Xls_Reader;

public class XLS_Filehandlings {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "\\src\\main\\java\\Practice\\data.xlsx.xlsx";
		Xls_Reader xs = new Xls_Reader(path);
		
		//1-row count of excel sheet:->
		
	     int rwo = xs.getRowCount("RediffMail");
		System.out.println(rwo);
		//2-coloumn count:->
		
		int col = xs.getColumnCount("RediffMail");
		System.out.println(col);
		
		  String data = xs.getCellData("RediffMail", "Password", 3);
		 System.out.println(data);
	  
       boolean  dataup =  xs.setCellData( "RediffMail","Username", 7,"Janki#211");
         System.out.println(dataup);
	}
	

}
