package org.haeundae.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLDB implements SqlLang {
	final static String DRIVER = "com.mysql.cj.jdbc.Driver"; 
	final static String URL = "jdbc:mysql://localhost:3306/cho_pro";
	final static String USERID = "root";
	final static String USERPW = "1234";
	final static String INS_NOTICE = "insert into notice values (default, ?, ?, default, 0)";
	final static String INS_MEMBER = "insert into member values(?, ?, ?, ?, ?, ?, ?)";
	final static String LATEST_NOTICE = "select * from notice order by no desc limit 5";
	final static String LATEST_QNA = "select * from qna order by parno desc, plevel asc limit 5";
	final static String INS_ANSWER = "insert into qna values(default, 2, ?, ?, ?, default, 0, ?)";
	final static String INS_QUESTION = "insert into qna values (default, 1, null, ?, ?, default, 0, ?)";
	final static String UPD_PARNO_QUESTION = "update qna as outer_qna join(select no from qna order by no desc limit 1) as sub_query set outer_qna.parno=sub_query.no where outer_qna.no=sub_query.no ";
	final static String INS_TRAFFIC = "";
	
	Connection con = null;
	
	public Connection connect() {
		try {
			Class.forName(DRIVER);
			try {
				con = DriverManager.getConnection(URL, USERID, USERPW);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void close(Connection con, PreparedStatement pstmt) {
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}