import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//1. Import JDBC packages :
//2. Load and register the JDBC driver :Class.forName("com.mysql.jdbc.Driver");
//3. Open a connection to the database :  To connect with the database we should call getConnection() static method present in DriverManager Class.-->Connection conn = DriverManager.getConnection("jdbc:mysql://host:port/dbName","username","password");
//4. Create a statement object to perform a query :   // Object of Statement. It is used to create a Statement to execute the query   -->Statement stmt = conn.createStatement();
//5. Execute the statement object and return a query resultset :->Now we have to form our SQL queries to execute them on the database, Queries like Select, Create, Insert, Update, Delete.
//6.DataBase_Testing:->Once we receive our result set we can manipulate the data,
//7.Close the resultset and statement objects :After execution, we must close the connection to the resultset and statement irrespective of whether the execution passes or fails
//resultSet.close();     //stmt.close();
//8.Close the connection :conn.close();
public class DataBase_Testing {

	public static Connection conn;
	public static Statement stmt;
	public static ResultSet resultSet;
		
		@BeforeMethod
		public void setupDatabaseConnection()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");                   // Class.forName("com.mysql.jdbc.Driver");
// Object of Connection from the Database
conn = DriverManager.getConnection("jdbc:mysql://sql132.main-hosting.eu/u3130_db", "u310_karthiQ", "yyy@123");	//Connection con = DriverManager.getConnection(dbUrl,username,password);

			} catch (ClassNotFoundException e) {
				System.out.println("Exception occured while loading the driver of JDBC");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Test
		public static void dbTest() throws SQLException{
			try{

				// Object of Statement. It is used to create a Statement to execute the query
				stmt = conn.createStatement();

				//Object of ResultSet => 'It maintains a cursor that points to the current row in the result set'
				resultSet = stmt.executeQuery("SELECT * from testuser");
				while (resultSet .next()) {
					System.out.println(resultSet .getString(1) + " | " + resultSet .getString(2) +" | "+ resultSet .getString(3));
				}
			}catch(Exception e){
				System.out.println("Exeception occured in db testing");
				e.printStackTrace();
			}finally {
				// close the connection if not already closed
				if (resultSet != null) {
					resultSet.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		}
	}


