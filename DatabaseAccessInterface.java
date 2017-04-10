package project.website.band;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DatabaseAccessInterface {
	public static final String DRIVE_NAME = "com.mysql.jdbc.Driver";
	
	public static final String CONNECTION_URL = "jdbc:mysql://localhost/easygig";
	
	public static final String DB_CONNECTION_USERNAME = "root";
	
	public static final String DB_CONNECTION_PASSWORD = "Trogdor1";
	//connects to the database
	public static Connection connect() {
		Connection con = null;
		try {
			Class.forName(DRIVE_NAME);
			con = DriverManager.getConnection(CONNECTION_URL, DB_CONNECTION_USERNAME, DB_CONNECTION_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	} // end of connect
	
	//retrieves data from the database
	public static ResultSet retrieve (String query) {
		try {
			
			Connection con = connect();
		
			Statement stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			return rset;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}// end of retrieve
	
	public static int create (String query){
		try{
			
			Connection con = connect();
			
			Statement stmt = con.createStatement();
			int z = stmt.executeUpdate(query);
			return z;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
	}
	//updates a tuple in the database
	public static int update (String query){
		try{
			System.out.println("Connecting to database...");
			Connection con = connect();
			System.out.println("Connected to database successfully.");
			Statement stmt = con.createStatement();
			int z = stmt.executeUpdate(query);
			return z;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	//removes a tuple from the database
	public static int delete (String query){
		try{
			System.out.println("Connecting to database...");
			Connection con = connect();
			System.out.println("Connected to database successfully.");
			Statement stmt = con.createStatement();
			int z = stmt.executeUpdate(query);
			return z;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	//disconnects from the databsae
	public static void disconnect(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of closeConnection

}