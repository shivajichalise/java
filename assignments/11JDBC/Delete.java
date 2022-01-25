import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Read();
		
		System.out.println("Choose the user you want to delete: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();  
		scan.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java", "alphajr", "SIKEBRO");
		
		String query = "DELETE FROM `users` WHERE `users`.`id` = ?";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setInt(1, id);
        
		int res = stmt.executeUpdate();
		System.out.println("Number of rows affected = " + res);
		conn.close();
	}
}
