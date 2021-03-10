package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.fujitsu.loginAndRegister.model.User;

public class UserRegistrationDao {

	public boolean registerUser(User user) {
		System.out.println("Start of UserRegistrationDAO::registerUser");

		String url="jdbc:mysql://localhost:3306/usecase";
		String db_username="root";
		String db_password="root";

		Connection con;
		PreparedStatement pstmt;//for dynamic we use

		String sql="insert into user1 values(?,?,?,?,?)";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,db_username,db_password);
			pstmt=con.prepareStatement(sql);

			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getPassword());
			pstmt.setInt(4, user.getPhone());
			pstmt.setString(5, user.getAddress());


			int result=pstmt.executeUpdate();

			if(result>0)
				return true;

		}
		catch(Exception e)
		{
			e.printStackTrace();

		}

		System.out.println("S");
		return false;






	}
}