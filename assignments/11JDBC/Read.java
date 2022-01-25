import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Read {
	public Read() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java", "alphajr", "SIKEBRO");
		
		String query = "SELECT * from users";
		Statement stmt = conn.createStatement();
        
		ResultSet res = stmt.executeQuery(query);
		
		while(res.next()){
			System.out.println("###################################");
			System.out.println("\t ID 	   = " + res.getInt(1));
			System.out.println("\t Name    = " + res.getString(2));
			System.out.println("\t Age     = " + res.getInt(3));
			System.out.println("\t Address = " + res.getString(4));
			System.out.println("###################################");
		}
		
		conn.close();
	}
	
	public static void main(String[] args) throws Exception{
		new Read();
	}
	
}
