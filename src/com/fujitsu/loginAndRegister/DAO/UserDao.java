package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

public ResultSet getDetails() {
		
		String url="jdbc:mysql://localhost:3306/usecase";
		String db_username="root";
		String db_password="root";
		
		
		Connection con;
		PreparedStatement pstmt;
		
		String sql="select*from user1 ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,db_username,db_password);
			 pstmt=con.prepareStatement(sql);
		
		
		ResultSet rs=pstmt.executeQuery();
		return rs;
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
}



















}
