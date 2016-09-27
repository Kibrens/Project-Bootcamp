import java.sql.*;

public class Pronóstico {
	public static void main(String args[]) 
    {  
    try  
    { 
         // Load the SQLServerDriver class, build the 
         // connection string, and get a connection 
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
         String connectionUrl = "jdbc:sqlserver://CABRA-PC\\SQLEXPRESS;" + 
                                 "database=weatherAPI;" + 
                                 "user=weather;" + 
                                 "password=weather"; 
         Connection connection = DriverManager.getConnection(connectionUrl); 
         System.out.println("Connected.");

         // Create and execute an SQL statement that returns some data.  
         String SQL = "CREATE TABLE table_name(uno char(5), column2 varchar(20), column3 int, PRIMARY KEY (uno))";
         Statement stmt = connection.createStatement();  
         ResultSet rs = stmt.executeQuery(SQL);
         
         // Iterate through the data in the result set and display it.  
         while (rs.next())  
         {  
            System.out.println(rs.getString(1) + " " + rs.getString(2));  
         }

    }  
    catch(Exception e)  
    { 
         System.out.println(e.getMessage()); 
         System.exit(0);  
    } 
 } 
}
