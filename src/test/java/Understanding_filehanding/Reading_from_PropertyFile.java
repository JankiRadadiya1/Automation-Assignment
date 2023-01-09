package Understanding_filehanding;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_from_PropertyFile {

	public static void main(String[] args) throws IOException {

     String path = System.getProperty("user.dir") +"\\src\\test\\java\\Understanding_filehanding\\config.properties";
 
      Properties prop = new Properties();   
      FileInputStream ip = new FileInputStream(path);   
         prop.load(ip);
		System.out.println(prop.getProperty("url"));
		
		
		    /*1. create file input stream object for the properties file
			FileInputStream fis = new FileInputStream("C:pathlogin.properties");
			FileInputStream fis2 = new FileInputStream("C:pathconfig.txt");
			// 2.create Properties class object to access properties file
			Properties prop = new Properties();
			// 3.load the properties file
			prop.load(fis);
			//4.load all the files
			prop.load(fis2);
			//5. get the property of "url" using getProperty()
			System.out.println(prop.getProperty("url"));
	}*/

}}
