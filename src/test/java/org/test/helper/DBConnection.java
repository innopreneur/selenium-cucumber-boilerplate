package org.test.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/** connects with the RepoNTP database
 * @author 537670
 *
 */
public class DBConnection {
	public Connection getConnection()
	{
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	
		Connection conn=null;
		
		 	String url=prop.getProperty("url");
	        String dbName = prop.getProperty("dbName");
	        String driver = prop.getProperty("driver");
	        String userName =prop.getProperty("userName");
	        String password = prop.getProperty("password");

	        try {
				Class.forName(driver).newInstance();
				 conn = DriverManager.getConnection(url + dbName, userName,password);
			} catch (InstantiationException e) {
				
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

	        return conn;
		
		
		}

	/*public Connection getConnection()
	{
		Connection conn=null;
		 	String url="jdbc:postgresql://SAP165:5432/";
	        String dbName = "RepoNTP";
	        String driver = "org.postgresql.Driver";
	        String userName = "dev";
	        String password = "ntp_dev";

	        try {
				Class.forName(driver).newInstance();
				 conn = DriverManager.getConnection(url + dbName, userName,password);
			} catch (InstantiationException e) {
				
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

	        return conn;
		
		
		}*/
	
	
	public void closeConnection(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void closeStatement(Statement stmt){
		try {
			stmt.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	
	
	public void closeResultSet(ResultSet rs){
		try {
			rs.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public Connection getConnectionForResults()
	{
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}

		Connection conn=null;

		 	String url=prop.getProperty("urlForResults");
	        String dbName = prop.getProperty("dbNameForResults");
	        String driver = prop.getProperty("driver");
	        String userName =prop.getProperty("userName");
	        String password = prop.getProperty("password");

	        try {
				Class.forName(driver).newInstance();
				 conn = DriverManager.getConnection(url + dbName, userName,password);
			} catch (InstantiationException e) {
				
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

	        return conn;


		}
	
	
}








