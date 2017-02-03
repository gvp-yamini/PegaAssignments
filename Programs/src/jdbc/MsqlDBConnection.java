package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MsqlDBConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/hiringportal","root","root");
		PreparedStatement pst = conn.prepareStatement("Select username,password from login where username=? and password=?");
	    pst.setString(1,"user");
	    pst.setString(2, "pass");
	    ResultSet rs=pst.executeQuery();
	    while(rs.next()){
	    	System.out.println(rs.getString(1));
	    }
	    conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
