package SwingProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class NuriDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "";
	
	NuriManageVO mVo = null;
	NuriBooksVO bVo = null;
	
	// 처음 DAO생성시에 Database를 연결한다.
	public NuriDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javagreen10";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패.");
		}
	}
	
	//Database Close
	public void dbClose() {
		try {
			conn.close();
		} catch (SQLException e) {}
	}
	
	//PreparedStatement 객체 Close
	public void pstmtClose() {
		try {
			if(pstmt != null) pstmt.close();
		} catch (Exception e) {}
	}
	
	//resultset 객체 Close
	public void rsClose() {
		try {
			if(rs != null) {
				rs.close();
				pstmtClose();
			}
		} catch (Exception e) {}
	}
	
	// 아이디 중복확인을 위한 DB 검색..
	public NuriManageVO overLap(String mMid) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where mMid = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mMid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
				vo.setmMid(rs.getString("mMid"));
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		
		return vo;
	}
	
	// 휴대폰 번호 중복확인
	public NuriManageVO numCheck(String mNum) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where mNumber = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mNum);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
				vo.setmNumber(rs.getString("mNumber"));
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	
	//관리자 계정 생성하기
	public NuriManageVO create(String mName, String mMid, String mPwd, String mNum, String mHint, String mHintAns) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "insert into manage values (default, ?, ?, password(?), ?, ?, password(?))";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mName);
			pstmt.setString(2, mMid);
			pstmt.setString(3, mPwd);
			pstmt.setString(4, mNum);
			pstmt.setString(5, mHint);
			pstmt.setString(6, mHintAns);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			pstmtClose();
		}
		return vo;
	}
	
	// 계정생성 여부 확인
	public NuriManageVO createCheak(String mName) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where mName = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mName);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setmName(mName);
			}
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		
		return vo;
	}
	
	// 로그인 정보가 일치하는지 확인하는 메소드
	public NuriManageVO mLogin(String mMid, String mPwd) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where mMid = ? and mPwd = password(?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mMid);
			pstmt.setString(2, mPwd);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
				vo.setmMid(rs.getString("mMid"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	
	//아이디찾기
	public NuriManageVO idFind(String mNum, String mHint, String mHintAns) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where mNumber = ? and mHint = ? and mHintAns = password(?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mNum);
			pstmt.setString(2, mHint);
			pstmt.setString(3, mHintAns);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
				vo.setmMid(rs.getString("mMid"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
		
	}
	
	//비밀번호 찾기
	public NuriManageVO pwdFind(String mMid, String mNum, String mHint, String mHintAns) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where mMid = ? and mNumber = ? and mHint = ? and mHintAns = password(?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mMid);
			pstmt.setString(2, mNum);
			pstmt.setString(3, mHint);
			pstmt.setString(4, mHintAns);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
				vo.setmMid(rs.getString("mMid"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	
	//비밀번호 재설정
	public void newPassword(String mMid, String mPwd) {
		try {
			sql = "update manage set mPwd = password(?) where mMid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mPwd);
			pstmt.setString(2, mMid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
	}
	
	//비밀번호 재설정 여부 확인
	public NuriManageVO newPasswordCheck(String mMid, String mPwd) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where mMid = ? and mPwd = password(?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mMid);
			pstmt.setString(2, mPwd);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	
	//계정 삭제 버튼 실행으로 인한 데이터베이스 데이터 삭제
	public void deleteAccount(String strmIdx) {
		try {
			int mIdx = Integer.parseInt(strmIdx);
			sql = "delete from manage where mIdx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mIdx);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			pstmtClose();
		}
	}
	
	//계정삭제 확인 메소드
	public NuriManageVO deleteAccountCheck(String strmIdx) {
		NuriManageVO vo = new NuriManageVO();
		try {
			int mIdx = Integer.parseInt(strmIdx);
			sql = "select * from manage where mIdx = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mIdx);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	
	//계정 수정 전 필요한 값 검색 메소드
	public NuriManageVO valueFind(String name,String value) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where "+name+" = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, value);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
				vo.setmMid(rs.getString("mMid"));
				vo.setmNumber(rs.getString("mNumber"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	
	//계정 수정 메소드
	public void updateAccount(String fieldName, String input, int mIdx) {
		try {
			sql = "update manage set "+fieldName+" = ? where mIdx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, input);
			pstmt.setInt(2, mIdx);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			pstmtClose();
		}
	}
	
	//계정 수정 확인 메소드
	public NuriManageVO updateAccountCheck(String name, String input) {
		NuriManageVO vo = new NuriManageVO();
		try {
			sql = "select * from manage where "+name+" = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, input);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setmIdx(rs.getInt("mIdx"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vo;
	}
	
	//관리자 데이터베이스 전체자료 조회
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Vector getList() {
		Vector vData = new Vector();
		try {
			sql = "select * from manage";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Vector vo = new Vector();
				vo.add(rs.getInt("mIdx"));
				vo.add(rs.getString("mName"));
				vo.add(rs.getString("mMid"));
				vo.add(rs.getString("mPwd"));
				vo.add(rs.getString("mNumber"));
				vo.add(rs.getString("mHint"));
				vo.add(rs.getString("mHintAns"));
				
				vData.add(vo);
			}
		}catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vData;
	}
	
	// 도서목록 전체조회
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Vector getBooksList() {
		Vector vData = new Vector();
		try {
			sql = "select * from books";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Vector vo = new Vector();
				vo.add(rs.getInt("Bidx"));
				vo.add(rs.getString("isbn"));
				vo.add(rs.getString("bookName"));
				vo.add(rs.getString("author"));
				vo.add(rs.getString("publish"));
				vo.add(rs.getString("category"));
				vo.add(rs.getString("bookPosition"));
				vo.add(rs.getString("rentalCheck"));
				
				vData.add(vo);
			}
		}catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			rsClose();
		}
		return vData;
		
	}
	
	//도서추가하기
	public void inputBook(String isbn, String bookName, String author, String publish, String category,String bookPosition) {
		try {
			sql = "insert into books values(default, ?, ?, ?, ?, ?, ?, default)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, isbn);
			pstmt.setString(2, bookName);
			pstmt.setString(3, author);
			pstmt.setString(4, publish);
			pstmt.setString(5, category);
			pstmt.setString(6, bookPosition);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 에러 : " + e.getMessage());
		}finally {
			pstmtClose();
		}
	}
	//도서 삭제 버튼 실행으로 인한 데이터베이스 데이터 삭제
		public void deleteBook(String strbIdx) {
			try {
				int bIdx = Integer.parseInt(strbIdx);
				sql = "delete from books where bIdx = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bIdx);
				pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("SQL 에러 : " + e.getMessage());
			}finally {
				pstmtClose();
			}
		}
		
		//도서삭제 확인 메소드
		public NuriBooksVO deleteBookCheck(String strbIdx) {
			NuriBooksVO vo = new NuriBooksVO();
			try {
				int bIdx = Integer.parseInt(strbIdx);
				sql = "select * from books where bIdx = ? ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bIdx);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					vo.setbIdx(rs.getInt("bIdx"));
				}
			} catch (SQLException e) {
				System.out.println("SQL 에러 : " + e.getMessage());
			}finally {
				rsClose();
			}
			return vo;
		}
		//도서 수정 전 필요한 값 검색 메소드
		public NuriBooksVO valueFindBooks(String name,String value) {
			NuriBooksVO vo = new NuriBooksVO();
			try {
				sql = "select * from books where "+name+" = ? ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, value);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					vo.setbIdx(rs.getInt("bIdx"));
					vo.setBookName(rs.getString("bookName"));
				}
			} catch (SQLException e) {
				System.out.println("SQL 에러 : " + e.getMessage());
			}finally {
				rsClose();
			}
			return vo;
		}

		//도서 수정 메소드
		public void updateBooks(String fieldName, String input, int bIdx) {
			try {
				sql = "update books set "+fieldName+" = ? where bIdx = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, input);
				pstmt.setInt(2, bIdx);
				pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("SQL 에러 : " + e.getMessage());
			}finally {
				pstmtClose();
			}
		}
		
		//도서 수정 확인 메소드
		public NuriBooksVO updateBooksCheck(String name, String input) {
			NuriBooksVO vo = new NuriBooksVO();
			try {
				sql = "select * from books where "+name+" = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, input);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					vo.setbIdx(rs.getInt("bIdx"));
				}
			} catch (SQLException e) {
				System.out.println("SQL 에러 : " + e.getMessage());
			}finally {
				rsClose();
			}
			return vo;
		}











	
	
	
}
