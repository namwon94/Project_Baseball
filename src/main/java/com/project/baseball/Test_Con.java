package com.project.baseball;

import java.sql.Connection;
import java.sql.DriverManager;


public class Test_Con {
	
	public static void main(String[] args) {
		Connection conn;
	
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","manager","1234");
			
			System.out.println("연결성공"+conn);
			conn.close();
		}
		catch(Exception e) {
			System.out.println("오류"+ e);
		}
	}


}
