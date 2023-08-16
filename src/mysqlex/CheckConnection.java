package mysqlex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class CheckConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement stmt = null;
		String url="jdbc:mysql://localhost:3306/db";
		Connection con=DriverManager.getConnection(url,"root","root");
		System.out.println(con);
		System.out.println("Database db connection suceesfully establish");
		//stmt=con.createStatement();
		//stmt= (Statement) con.createStatement();
		String query1="INSERT INTO emp VALUES('5','deepika','testing')";
		stmt.execute();
		System.out.println("Record insert suceesfully");
	}

}
