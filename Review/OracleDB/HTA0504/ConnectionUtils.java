package HTA0504;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
	private static final String DRIVER_CLASS_NAME = "oracle:jdbc:OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "hr";
	private static final String PASSWORD = "zxcv1234";
	
	static{
		try {
			Class.forName(DRIVER_CLASS_NAME);
		}catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	}

}
