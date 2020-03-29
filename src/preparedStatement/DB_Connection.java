package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
public static Connection getConnection() throws SQLException {
	
		Connection conn = null;
		
			try {
			String url =  "jdbc:mysql://localhost:3306/mysqljdbc";			
			String user = "root";											
			String password ="Nagaaswin";									
			
			conn = DriverManager.getConnection(url,user,password);
		}
			
		catch (SQLException e)
			{
			System.out.print(e.getMessage());
		}
			
			return conn;

}


}
