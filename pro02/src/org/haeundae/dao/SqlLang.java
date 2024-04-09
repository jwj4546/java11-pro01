package org.haeundae.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//วฅมุ SQL
public interface SqlLang {
	String SELECT_ALL_MEMBER = "select * from member order by id";
	String SELECT_ONE_MEMBER = "select * from member where id=?";
	String INS_MEMBER = "Insert int member values(?, ?, ?, ?, ?)";
	String UPD_MEMBER = "update member set pw=?, birth=?, email=?, tel=? where id=?";
	String DEL_MEMBER = "delete from member where id=?";
	
	String SELECT_ALL_NOTICE = "select * from notice order by no desc";
	String SELECT_NOTICE_BYNO = "select * from notice where no=?";
	String UPD_NOTICE = "update notice set title=?, content=? where no=?";
	String VISITED_UPD_NOTICE = "update notice set visited=visited+1 where no=?";
	String DEL_NOTICE = "delete from notice where no=?";
	
	
	
	
	Connection connect();
	void close(Connection con, PreparedStatement pstmt);
	void close(Connection con, PreparedStatement pstmt, ResultSet rs);
}
