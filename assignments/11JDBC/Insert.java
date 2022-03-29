import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java", "alphajr", "SIKEBRO");

		String query = "INSERT INTO users (`name`, `age`, `address`) VALUES (?, ?, ?)";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, "Shivaji");
		stmt.setInt(2, 22);
		stmt.setString(3, "Srijana Chowk");

		int res = stmt.executeUpdate();

		System.out.println("Number of rows affected = " + res);

		conn.close();

	}

}
