package com.bridgelabz.simplecrudoperation;

import java.sql.*;

import com.mysql.jdbc.Connection;

public class DemoConnectivity {

	public static void main(String[] args) throws Exception 
	{
		String url = "";
		String username = "root";
		String password = "";
		Class.forName("com.mysql.jdbc.Driver");// class forname telusko
		java.sql.Connection con = DriverManager.getConnection(url,username,password);
	}
}
