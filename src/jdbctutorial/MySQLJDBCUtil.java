package jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLJDBCUtil {
public static Connection getConnection() throws SQLException {
		
		Connection conn = null;
		
			try {
			String url =  "jdbc:mysql://localhost:3306/mysqljdbc";			//pros.getProperty("url");
			String user = "root";											//pros.getProperty("user");
			String password ="Nagaaswin";									//pros.getProperty("password");
			
			conn = DriverManager.getConnection(url,user,password);
		}
		catch (SQLException e){
			System.out.print(e.getMessage());
		}
			return conn;

}
}
