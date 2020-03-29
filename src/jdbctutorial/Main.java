package jdbctutorial;

//import java.util.*;
//import java.io.*;
import java.sql.*;

public class Main {

	public static void main(String[] args) {
		
		String sql ="Select first_name,last_name,email"+"\n"+"From candidates";
		
	try (Connection conn = MySQLJDBCUtil.getConnection(); 
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)){
        System.out.println("First Name"+"\t"+"Last Name"+"\t"+"email");
        while(rs.next())
        {
        	System.out.println(rs.getString("first_name")+ "\t" + rs.getString("last_name")  + "\t" +rs.getString("email"));
        }
        }
     catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }

	}
}
