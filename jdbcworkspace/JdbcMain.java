package com.vasanth.jdbcworkspace;
import java.sql.*;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
public class JdbcMain {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_workshop";
			String uname="hbstudent";
			String pass="hbstudent";
			con=DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection successful!");
			st=con.createStatement();
			rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3));
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
			st.close();
			rs.close();
		}
		
	}

}
