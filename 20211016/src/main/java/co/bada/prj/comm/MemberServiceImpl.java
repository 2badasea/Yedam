package co.bada.prj.comm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService {
	// 밑의 4개 객체는 db와 연동하기 위한 필수 객체들.
	private DataSource dao = DataSource.getInstance();
	private Connection conn; // 연결할 수 있는 커넥션 객체.
	private PreparedStatement psmt; // sql문을 전을 전달, 실행, 결과받기 등의 역할수행 객체.
	private ResultSet rs; // select문을 통해 결과를 담는 그릇에 해당하는 객체.

	@Override
	public List<MemberVO> memberList() { // 멤버 모두의 정보를 조회하는 메소드.
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql = "select * from member"; // 전달할 sql문 정의. 이다음은 항상trycatch
		try {
			conn = dao.getConnection();
			// 생성된 커넥션 객체를 통해 preparedstatement객체생성(이때 db에 sql구문전달)
			psmt = conn.prepareStatement(sql);
			// 전달된 sql구문을 실행시키는 executequery().
			rs = psmt.executeQuery();
			// 전달되면 레코드셋 형태의 결과를 resultSet객체를 생성하여 받는다.
			while (rs.next()) {
				// 레코드셋 결과의 다음 행을 읽는 게 next(). 존재하면 그 값을 리턴해준다.
				// 더이상 리턴해줄 값이 없으면 eof를 리턴한다. eof는 false값을 가진다.
				vo = new MemberVO(); // 다시 초기화한 건, 반복문이기 때문에 한명한명 담기 위하여
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setTel(rs.getString("tel"));
				vo.setAddress(rs.getString("address"));
				vo.setAuthor(rs.getString("author"));
				list.add(vo);
			}
		} catch (SQLException e) { // db랑 연동하므로, sqlexception이 발생할 수 있음.
			e.printStackTrace();
		} finally {
			close(); // close()메소드는 따로 밑에서 정의. 사용한 객체를 반환시켜 메모리를 클리어 시키는 용도
		}
		return list; // 받는 타입도 List<MemeberVO> 타입이어야 함. 'list'는 그 타입의 객체.
	}

	@Override
	public MemberVO selectMember(MemberVO vo) { // 한 명 조회하기.
		// 위의 MemberList와 달리 단일행의 결과를 호출하므로 List컬렉션을 사용 안 해도 됨.

		String sql = "select * from member where id = ? ";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			// 전달인자를 sql문에 넘겨주는 것. ?가 1개니깐 인덱스값으로 1이다.
			rs = psmt.executeQuery();
			// 위랑 달리 하나만 출력하면 되므로 while이 아닌 if를 사용.
			if (rs.next()) { // "읽읅 게 있다면~"
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setTel(rs.getString("tel"));
				vo.setAddress(rs.getString("address"));
				vo.setAuthor(rs.getString("author"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo; // 리턴타입은 MemberVO여야 한다.
	}

	@Override
	public int insertMember(MemberVO vo) {
		String sql = "insert into member values(?,?,?,?,?,?)";
		int n = 0;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getPassword());
			psmt.setString(4, vo.getTel());
			psmt.setString(5, vo.getAddress());
			psmt.setString(6, vo.getAuthor());
			n = psmt.executeUpdate(); // 성공하면 1, 실패하면 0
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override
	public int updateMember(MemberVO vo) {
		// id는 업데이트 하지 못 한다. 기본키로 설정된 컬럼은 변경하지 못 하기 때문.
		// id 제외하고 다 업데이트 가능하도록 구성.

		String sql = "update member set name = ?, password =?, tel = ?, address = ?, author = ? ";
		// 물음표 5개.
		int n = 0;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getTel());
			psmt.setString(4, vo.getAddress());
			psmt.setString(5, vo.getAuthor());
			n = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override
	public int deleteMember(MemberVO vo) {
		String sql = "delete from member where id = ?";
		int n = 0;
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	private void close() { // 사용한 객체를 반환시키는 용도. 메모리에서 클리어
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
