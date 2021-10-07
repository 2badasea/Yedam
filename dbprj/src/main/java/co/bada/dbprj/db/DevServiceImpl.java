package co.bada.dbprj.db;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import co.bada.dbprj.DataSource;

public class DevServiceImpl extends DataSource {
	private PreparedStatement psmt;
	private ResultSet rs;    
	
//	public List<DevVO> selectList(){ 시관관계상 주석으로 달고, 바로 출력하는 메소드를 밑에서 정의.
//		DevVO vo;
//		List<DevVO> list = new ArrayList<DevVO>();
//		
//		return list;
//	}                
		
	public void selectList() {
		String sql = "select * from dev";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("address"));
				System.out.println(rs.getInt("age"));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
//		finally {
//			if(rs != null) rs.close();
//			if(psmt != null) psmt.close();
//		}
	}

}



	
