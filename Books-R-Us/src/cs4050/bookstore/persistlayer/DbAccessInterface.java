package cs4050.bookstore.persistlayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbAccessInterface {
	static final String DB_DRIVE_NAME = DbAccessConfiguration.DB_DRIVE_NAME;
	
	static final String DB_CONNECTION_URL = DbAccessConfiguration.DB_CONNECTION_URL;
	
	static final String DB_CONNECTION_USERNAME = DbAccessConfiguration.DB_CONNECTION_USERNAME;
	
	static final String DB_CONNECTION_PASSWORD = DbAccessConfiguration.DB_CONNECTION_PASSWORD;
	
	public static Connection connect(){
		Connection con = null;
		try {
			Class.forName(DB_DRIVE_NAME);
			con = DriverManager.getConnection(DB_CONNECTION_URL, DB_CONNECTION_USERNAME, DB_CONNECTION_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	

	//Method used to get data from sql database as specified by query
	public static ResultSet retrieve (Connection con, String query){
		ResultSet rset = null;
		try {
			Statement stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			return rset;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rset;
	}
	
	//
	public static int create (Connection con, String query){
		int rowcount = 0;
		try{
			Statement stmt = con.createStatement();
			rowcount = stmt.executeUpdate(query);
		} catch (SQLException e){
			e.printStackTrace();
		}
		return rowcount;
	}
	
	//
	public static int update (Connection con, String query){
		int rowcount = 0;
		try{
			Statement stmt = con.createStatement();
			rowcount = stmt.executeUpdate(query);
		} catch (SQLException e){
			e.printStackTrace();
		}
		return rowcount;
	}
	
	//
	public static int delete (Connection con, String query){
		int rowcount = 0;
		try{
			Statement stmt = con.createStatement();
			rowcount = stmt.executeUpdate(query);
		} catch (SQLException e){
			e.printStackTrace();
		}
		return rowcount;
	}
	
	//Method to close the connection to the sql database
	public static void disconnect(Connection con){
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
