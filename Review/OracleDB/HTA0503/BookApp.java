import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookApp {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		String driverClassName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:Oracle:thin:@localhost:1521:xe";
		String username = "hr";
		String password = "zxcv1234";
		
		Class.forName(driverClassName);
		
		Connection connection = DriverManager.getConnection(url, username, password);
		String sql = "insert into sample_books values(?,?,?,?,?,?,sysdate)";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		System.out.println("책 번호를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("책 제목을 입력하세요 : ");
		String title = sc.next();
		System.out.println("책 저자를 입력하세요 : ");
		String writer = sc.next();
		System.out.println("책 가격를 입력하세요 : ");
		int price = sc.nextInt();
		System.out.println("책 할인가격를 입력하세요 : ");
		int discount_price = sc.nextInt();
		System.out.println("책 재고를 입력하세요 : ");
		int stock = sc.nextInt();
		
		pstmt.setInt(1, num);
		pstmt.setString(2, title);
		pstmt.setString(3, writer);
		pstmt.setInt(4, price);
		pstmt.setInt(5, discount_price);
		pstmt.setInt(6, stock);
		
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + " 개의 행이 추가되었습니다.");
		sc.close();
		pstmt.clearBatch();
		connection.close();
		
	}
}
