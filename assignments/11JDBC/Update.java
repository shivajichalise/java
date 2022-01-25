import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Read();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose the user you want to edit: ");
		int id = scan.nextInt();  
		
		System.out.println("Enter user's name:");
		String name = scan.next();
		
		System.out.println("Enter user's age:");
		Integer age = scan.nextInt();
		
		System.out.println("Enter user's address:");
		String address = scan.next();
		
		scan.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java", "alphajr", "SIKEBRO");
		
		String query = "UPDATE `users` SET `name` = ?, `age` = ?, `address` = ? WHERE `users`.`id` = ?";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, name);
		stmt.setInt(2, age);
		stmt.setString(3, address);
		stmt.setInt(4, id);
        
		int res = stmt.executeUpdate();
		System.out.println("Number of rows affected = " + res);
		conn.close();
		
	}

}
