package co.bada.prj.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.bada.prj.dao.DataSource;
import co.bada.prj.service.MemberService;
import co.bada.prj.service.MemberVO;

public class MemberServiceImpl implements MemberService {    
	//밑의 4개 객체는 db와 연동하기 위한 필수 객체들. 
	private DataSource dao = DataSource.getInstance();    //db에 연결하기 위해 dao를 만든다.  
	private Connection conn;	//연결할 수 있는 커넥션 객체. connection은 상위클래스. 
	private PreparedStatement psmt;  //sql문을 전달. 실행, 결과받기. 커넥션을 통해 결과를 받을수 있는 객체. 상위클래스. 
	private ResultSet rs;
	//select문을 통해 결과를 받을 수 있는
	
	@Override
	public List<MemberVO> selectMemberList() {		//2. 다음 행을 읽는 게 next(). 읽늘 내용이 존해마녀 그 값을 리턴해준다. 	
		List<MemberVO> list = new ArrayList<MemberVO>(); //더이상 리턴해줄 게 없으면 eof을 리턴해준다. eof는 false값을 가진다. 
		MemberVO vo;
		String sql = "select * from member";  //sql구문 전달. 
		try {
			conn = dao.getConnection();		//생성된 커넥션 객체를 통해 preparedstatement객체생성(이 때 db에 매개값으로 sql전달), 
											//sql을 실행시켜달라는 executequery(). 전달이 되면 
											//레코드셋 형태로 돌려주는데, 자바에선 이것을 1.resultset객체를 생성해서 받는다.
			psmt = conn.prepareStatement(sql);																		
			rs = psmt.executeQuery(); // sql문 실행 후 결과를 받음. select는 executeQuery이다. 레코드셋 모양의 결과를 받게됨 rs가. 
			while(rs.next()) {			
				vo = new MemberVO(); //여기서 값을 읽고 담아서 전달해준다. 일단 초기화. 밑을 차례대로 담아준다. 
				vo.setId(rs.getString("id"));  
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setTel(rs.getString("tel"));
				vo.setAddress(rs.getString("address"));
				vo.setAuthor(rs.getString("author"));
				list.add(vo);
						
			}
		} catch(SQLException e){     //db랑 연동하니, sqlexception이 발생할 수 있음. 
			e.printStackTrace();
		}finally {
			close();
		}
		return list;  //받는 곳에도 List<MemberVO) 타입이 있어야 한다. 이 list는 MemberVO 타입이란 걸 위에서 확인하기. 
	}

	@Override
	public MemberVO selectMember(MemberVO vo) {  //한 명 조회하기.
		// TODO Auto-generated method stub
		String sql = "select * from member where id = ? ";   //전달 받은 인자로 검색하기 위해선 ? 
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());  //전달인자를 sql문에 넘겨주는 것. ?가 1개니깐 1. (만약 위에 "and passowrd =?"이 더 붙는다면 2.로 해서 추가.)
											//값을 담는 역할이니깐 set. 
			rs = psmt.executeQuery();   //결과는 담는다. rs에. 
			//"읽을 게 있다면~" 
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setTel(rs.getString("tel"));
				vo.setAddress(rs.getString("address"));
				vo.setAuthor(rs.getString("author"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;   // 받는 쪽에도 MemberVO객체가 필요하다. 전달객체와 받는 객체의 타입이 동일해야 하기 때문. 
	}

	@Override
	public int insertMember(MemberVO vo) {
		//조회하기 위해서 일단 sql설정. 
		String sql = "insert into member values(?,?,?,?,?,?)";
		int n = 0;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());  //set이아니라 get 읽어야하니깐. 
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getPassword());
			psmt.setString(4, vo.getTel());
			psmt.setString(5, vo.getAddress());
			psmt.setString(6, vo.getAuthor());
			n = psmt.executeUpdate();  //성공하면 1, 실패하면 0
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override
	public int updateMember(MemberVO vo) {   //아이디는 업데이트 못 한다. 프라이머리키는 변경하지 못 하기 때문. 
												//id제외하고 다 업데이트 가능하도록. 
		int n = 0;
		String sql = "update member set name = ?, password = ?, tel = ?, address = ?, author = ? "
				+ "where id = ?"; //물음표 5개. 
		//sql작성하면 무조건 trycatch작성한다.
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getTel());
			psmt.setString(4, vo.getAddress());
			psmt.setString(5, vo.getAuthor());
			psmt.setString(6, vo.getId());
			n = psmt.executeUpdate();   
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;    
	}

	@Override
	public int deleteMember(MemberVO vo) {
		// TODO Auto-generated method stub
		int n =0;
		String sql = "delete from member where id = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return n;
	}
	
	private void close() {
		try {
			if(rs != null) rs.close();    //사용한 객체를 반환한다. 메모리에서 클리어 시키는 것.
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e ) {
			e.printStackTrace();
		}
	}
}  
