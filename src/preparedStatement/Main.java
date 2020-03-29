package preparedStatement;

//import java.util.*;
//import java.io.*;
import java.sql.*;

public class Main {
	
	public static void update(){
		String sql = "update candidates"+"\n"+"set last_name = ? "+"\n"+"Where id = ?";
		
		try(Connection conn = DB_Connection.getConnection();PreparedStatement pstmt = conn.prepareStatement(sql);)
		{
			String last_name ="Aswin";
			int id =101;
			pstmt.setString(1,last_name);
			pstmt.setInt(2, id);
			int rowaff = pstmt.executeUpdate();
			System.out.format("\nUpdate succesfull %d row Affected",rowaff);
		}
		catch(SQLException e)
		{
			System.out.print(e.getMessage());
		}
	}
	/*public static void select(){
		String sql = "Select first_name,last_name "+"from candidates "+"Where id = ? ";
		
		try(Connection conn = DB_Connection.getConnection();PreparedStatement pstmt = conn.prepareStatement(sql);)
		{
			int id =101;
			pstmt.setInt(1, id);
			int row = pstmt.executeUpdate(sql);
			ResultSet rs =pstmt.getResultSet();
			System.out.println(rs.getString("first_name")+rs.getString("last_name"));
		}
		catch(SQLException e)
		{
			System.out.print(e.getMessage());
		}
	}*/


	public static void main(String[] args) {
		//select();
		update();
		//select();

	}

}
