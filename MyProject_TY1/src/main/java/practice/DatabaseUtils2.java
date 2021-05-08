package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtils2
{
   @Test
   public void getExecuteProperty() throws SQLException
   {
	   Driver driverref=new Driver();
	   DriverManager.registerDriver(driverref);
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
	   Statement stat=con.createStatement();
	   ResultSet result=stat.executeQuery("select * from Customer;");
	   String S="mani";
	   while(result.next())
	   {
		   String name=result.getString(1);
		   if (name.equalsIgnoreCase(S))
		   {
			
			   System.out.println("Name is Present");
		   }
		   else
		   {
			   System.out.println("Name is not present");
		   }
		   }
	  
		 	   con.close();
   }
}
