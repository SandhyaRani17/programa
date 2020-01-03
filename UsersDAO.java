package com.del.first.dao;
import java.sql.*;
import com.del.first.entity.Users;
public class UsersDAO 
{
	public boolean validateUser(Users u)
	{
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			pst=con.prepareStatement("select * from users where username=? and password=?");
			pst.setString(1,u.getUsername()); pst.setString(2,u.getPassword());
			rs=pst.executeQuery();
			if(rs.next()) count = 1;
		}
	catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null) rs.close();
				if(pst!=null) pst.close();
				if(con!=null) con.close();
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return count==1;
	}
}