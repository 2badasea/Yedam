package co.bada.prj.board.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.bada.prj.board.service.BoardService;
import co.bada.prj.board.service.BoardVO;
import co.bada.prj.comm.DataSource;

public class BoardServiceImpl implements BoardService {
	private DataSource dataSource = DataSource.getInstance();  
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	

	@Override
	public List<BoardVO> boardSelectList() {  //전체목록을 가져오는 메소드.
		List<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO board;
		String sql = "select * from board";
		try {
			conn = dataSource.getConnection(); 
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				board = new BoardVO(); 
				board.setBId(rs.getInt("bid"));
				board.setBWriter(rs.getString("bwriter"));
				board.setBWriteDate(rs.getDate("bwritedate"));
				board.setBTitle(rs.getString("btitle"));
				board.setBHit(rs.getInt("bhit"));
				list.add(board);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}

	@Override
	public BoardVO boardSelect(BoardVO board) {  //선택된 하나의 글 읽기. 
		String sql = "select * from board where bid = ?";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, board.getBId()); //1인건 sql문에서 물음표가 하나니깐. 
			rs = psmt.executeQuery();
			//존재하면~
			if(rs.next()) {
				board.setBWriter(rs.getString("bwriter"));
				board.setBWriteDate(rs.getDate("bwritedate"));
				board.setBTitle(rs.getString("btitle"));
				board.setBContents(rs.getString("bcontents"));
				board.setBHit(rs.getInt("bhit"));
				//다 읽었으면 hit수를 업데이트해야하므로
				hitUpdate(board.getBId());  //조회수 증가. 
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return board;
	}

	@Override
	public int boardInsert(BoardVO board) {  //글 추가. 
		int n = 0; 
		String sql = "insert into board values(b_squ.nextval,?,sysdate,?,?,0)";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getBWriter());
			psmt.setString(2, board.getBTitle());
			psmt.setString(3, board.getBContents());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return n;
	}

	@Override
	public int boardUpdate(BoardVO board) {	//글 수정 
		//내용만 업데이트 할 수 있다고 가정. 
		int n = 0;
		String sql = "update board set bcontents = ? where bid = ?";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getBContents());
			psmt.setInt(2, board.getBId());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

	@Override
	public int boardDelete(BoardVO board) {	//글 삭제
		int n = 0;
		String sql = "delete from board where bid = ?";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, board.getBId());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}
	
	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt !=null) psmt.close();
			if(conn !=null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void hitUpdate(int bId) {   //조회수 증가 메소드 정의. 
		String sql = "update board set bhit = bhit + 1 where bid = ?";
		try {
			//커넥션 객체를 얻어야 한다. 
//			conn = dataSource.getConnection(); 커넥션 객체가 위에 있으니깐 안 적어도 된다.
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bId);
			psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
