package com.vasanth.jdbcworkspace;
import java.sql.*;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
public class JdbcExecuteUpdate {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_workshop";
			String uname="hbstudent";
			String pass="hbstudent";
			con=DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection successful!");
			st=con.createStatement();
			
			int n=st.executeUpdate("delete from student where id=8");
			System.out.println(n+" rows affected!");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
			st.close();
		}
		
	}

}
