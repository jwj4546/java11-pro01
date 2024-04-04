package org.haeundae.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NoticeDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<Notice> getNoticeList() {
		List<Notice> notiList = new ArrayList<>();
		
		MySQLDB mysql = new MySQLDB();
	}
}
