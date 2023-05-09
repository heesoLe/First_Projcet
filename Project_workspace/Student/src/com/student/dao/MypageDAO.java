package com.student.dao;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.student.vo.MemberVO;

public class MypageDAO {

	public MemberVO vo = new MemberVO();

	// 모든 DAO 공통 설정 사항
	// DB관련 필수 멤버변수 선언
	Connection con; // DB연결 con
	Statement st; // 쿼리문 수행 st
	PreparedStatement pt; // 쿼리문 수행 ps
	ResultSet rs; // 검색 결과 레코드를 저장할 rs

	// 생성자에서 DB연결
	public MypageDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "STUDENT", "1234");
		} catch(ClassNotFoundException e) {
			System.out.println(e + "=> 로드 fail");
		} catch(SQLException e) {
			System.out.println(e + "=> 연결 fail");
		} // end try catch
	} // end MypageDAO()


	// MypageDAO 기능 구현(selectAll, update, select, delete, dbClose)
	// 1. DB에 저장된 모든 회원 정보 모두 조회 / ArrayList
	//	public List<MemberVO> getMemberList() {
	//		List<MemberVO> list = new ArrayList<MemberVO>();
	//
	//		try {
	//			pt = con.prepareStatement("select * from student where user_no = 1"); // student테이블의 모든 자료를 리스트에 넣어서 출력
	//			rs = pt.executeQuery(); // 검색 쿼리문 수행 후 결과 레코드를 rs에 저장
	//			while(rs.next()) {
	//				MemberVO vo = new MemberVO();
	//				vo.setUser_no(rs.getInt(1)); // user_no 컬럼 레코드를 숫자형으로 가져와서 저장
	//				vo.setUser_name(rs.getString(2)); // user_name 컬럼 레코드를 문자열로 가져와서 저장
	//				vo.setUser_id(rs.getString(3)); // user_id 컬럼 레코드를 문자열로 가져와서 저장
	//				vo.setUser_pwd(rs.getString(4)); // user_pwd 컬럼 레코드를 문자열로 가져와서 저장
	//				vo.setUser_email(rs.getString(5)); // user_email 컬럼 레코드를 문자열로 가져와서 저장
	//				vo.setUser_phone(rs.getString(6)); // user_phone 컬럼 레코드를 문자열로 가져와서 저장
	//				vo.setUser_status(rs.getString(7)); // user_phone 컬럼 레코드를 문자열로 가져와서 저장
	//
	//				list.add(vo); // 컬렉션에 추가 / 컬렉션 = ArrayList<>()
	//			} // end while
	//
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		} finally {
	//			try {
	//				if(rs != null) {
	//					rs.close();
	//				}
	//				if(pt != null) {
	//					pt.close();
	//				}
	//				if(con != null) {
	//					con.close();
	//				}
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			} // end inner try catch
	//		} // end outer try catch finally
	//		return list;
	//	} // end getMemberList()

	public void userSelectAll(int user_no) {
		int re1;
		String re2, re3, re4, re5, re6, re7;
		try {
			pt = con.prepareStatement("select user_no, user_name, user_id, user_pwd, user_email, user_phone, user_status from STUDENT where user_no=?");
			pt.setInt(1, user_no);
			rs = pt.executeQuery(); // select문은 executeQuery()메서드로 실행

			if(rs.next()) {
				re1 = rs.getInt(1);
				re2 = rs.getString(2);
				re3 = rs.getString(3);
				re4 = rs.getString(4);
				re5 = rs.getString(5);
				re6 = rs.getString(6);
				re7 = rs.getString(7);

				vo.setUser_no(re1); vo.setUser_name(re2);
				vo.setUser_id(re3); vo.setUser_pwd(re4);
				vo.setUser_email(re5); vo.setUser_phone(re6);
				vo.setUser_status(re7);

			} // end if

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		} // end try catch finally 

		System.out.println(vo.getUser_no() + vo.getUser_name() + vo.getUser_id() + vo.getUser_pwd() + vo.getUser_email() + vo.getUser_phone() + vo.getUser_status());
	}

	public void userSelectAll() {
		int re1;
		String re2, re3, re4, re5, re6, re7;
		try {
			pt = con.prepareStatement("select * from STUDENT");
			rs = pt.executeQuery(); // select문은 executeQuery()메서드로 실행

			if(rs.next()) {
				re1 = rs.getInt(1);
				re2 = rs.getString(2);
				re3 = rs.getString(3);
				re4 = rs.getString(4);
				re5 = rs.getString(5);
				re6 = rs.getString(6);
				re7 = rs.getString(7);

				vo.setUser_no(re1); vo.setUser_name(re2);
				vo.setUser_id(re3); vo.setUser_pwd(re4);
				vo.setUser_email(re5); vo.setUser_phone(re6);
				vo.setUser_status(re7);

			} // end if

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		} // end try catch finally 

		System.out.println(vo.getUser_no() + vo.getUser_name() + vo.getUser_id() + vo.getUser_pwd() + vo.getUser_email() + vo.getUser_phone() + vo.getUser_status());
	}


	// 1. 해당하는 회원 정보 조회(내 정보가 존재하는지 확인 존재하면 true 반환)	
	public boolean selectUserInfo() {
		boolean result = true;

		try {
			pt = con.prepareStatement("select user_id, user_pwd, user_name, user_email, user_phone, user_status from student where user_id = 'student'"); // student테이블의 모든 자료를 리스트에 넣어서 출력
			rs = pt.executeQuery(); // 검색 쿼리문 수행 후 결과 레코드를 rs에 저장
			while(rs.next()) { // 해당하는 값이 모두 담겨 있다면 true를 반환, 아닐시 false를 반환
				// vo.setUser_no(rs.getInt("user_no")); // user_no 컬럼 레코드를 숫자형으로 가져와서 저장
				vo.setUser_id(rs.getString("user_id")); // user_id 컬럼 레코드를 문자열로 가져와서 저장
				vo.setUser_pwd(rs.getString("user_pwd")); // user_pwd 컬럼 레코드를 문자열로 가져와서 저장
				vo.setUser_name(rs.getString("user_name")); // user_name 컬럼 레코드를 문자열로 가져와서 저장
				vo.setUser_email(rs.getString("user_email")); // user_email 컬럼 레코드를 문자열로 가져와서 저장
				vo.setUser_phone(rs.getString("user_phone")); // user_phone 컬럼 레코드를 문자열로 가져와서 저장
				vo.setUser_status(rs.getString("user_status")); // user_status 컬럼 레코드를 문자열로 가져와서 저장

			} // end while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		} // end outer try catch finally

		return result; // true or false값으로 받음. 참고하여 Mypage의 ActionListener 구현
	} // end selectUserInfo()

	// 2. 회원 정보 수정(내 정보 수정시 DB에 변경 내용 저장) / Update
	public int modifyUser(String user_id, String user_pwd, String user_name, String user_email, String user_phone) {
		int re = -1;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "STUDENT", "1234");

			pt = con.prepareStatement("update student set user_name=?, user_pwd=?, user_email=?, user_phone=? where user_id=?"); // 아이디를 기준으로 비밀번호, 이름, 연락처 수정 쿼리문
			pt.setString(1, user_name); // 이름
			pt.setString(2, user_pwd); // 비밀번호
			pt.setString(3, user_email); // 이메일
			pt.setString(4, user_phone); // 연락처
			pt.setString(5, user_id); // 아이디

			re = pt.executeUpdate(); // 수정 쿼리문 성공후 성공한 레코드 행의 개수를 반환

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		} // end try catch finally

		return re;

	} // end modifyUser()

	//
	//	// 3. 아이디, 비밀번호 조회(회원 탈퇴 창에서 아이디, 비밀번호를 조회) / select
	//	public int selectIdPwd(String user_id, String user_pwd) {
	//		int re = -1;
	//
	//		try {
	//			pt = con.prepareStatement("select * from student where user_id=? and user_pwd=?"); // student테이블의 모든 자료를 리스트에 넣어서 출력
	//			pt.setString(1, user_id);
	//			pt.setString(2, user_pwd);
	//			rs = pt.executeQuery(); // 검색 쿼리문 수행 후 결과 레코드를 rs에 저장
	//			while(rs.next()) {
	//				rs.getString("user_id");
	//				rs.getString("user_pwd");            
	//			} // end while
	//			
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		} finally {
	//			try {
	//				if(rs != null) {
	//					rs.close();
	//				}
	//				if(pt != null) {
	//					pt.close();
	//				}
	//				if(con != null) {
	//					con.close();
	//				}
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			} // end inner try catch
	//		} // end outer try catch finally
	//
	//		return re;
	//	} // end selectUser()


	public void selectIdPwd(String user_id, String user_pwd) {
		String re1 = "", re2="";

		try {
			pt = con.prepareStatement("select user_id, user_pwd from student where user_id=? and user_pwd=?"); // student테이블의 모든 자료를 리스트에 넣어서 출력
			pt.setString(1, user_id);//id
			pt.setString(2, user_pwd);
			rs = pt.executeQuery(); // 검색 쿼리문 수행 후 결과 레코드를 rs에 저장

			while(rs.next()) {
				re1 = rs.getString("user_id");
				re2 = rs.getString("user_pwd");     

				vo.setUser_id(re1); vo.setUser_pwd(re2);
			} // end while

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		} // end outer try catch finally

	} // end selectUser()


	//	// 회원탈퇴시 delete를 위를 위한 아이디값 추출
	//	public void selectUser(String user_id, String user_pwd) {
	//		String re;
	//	      try {
	//	         pt = con.prepareStatement("select user_id from STUDENT where user_id=? and user_pwd=?");
	//	         pt.setString(1, user_id);
	//	         pt.setString(2, user_pwd);
	//	         rs = pt.executeQuery(); // select문은 executeQuery()메서드로 실행
	//	         	
	//	            if(rs.next()) {
	//	                re = rs.getString(1);
	//	                
	//	                vo.setUser_id(re);
	//	                
	//	             } // end if
	//	            
	//	          } catch(Exception e) {
	//	             e.printStackTrace();
	//	          } finally {
	//	             dbClose();
	//	          } // end try catch finally 
	//	      
	////	      System.out.println(vo.getUser_id());
	//	   }

	// 4. 회원 탈퇴(회원 탈퇴 창에서 아이디, 비밀번호 일치 시 회원 탈퇴) / delete
	public int delete(String user_id, String user_pwd) {
		int re = -1;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "STUDENT", "1234");
			pt = con.prepareStatement("delete from student where user_id=? and user_pwd=?");
			pt.setString(1, user_id); // <= delete(String user_id) 여기에서 위에 user_id라서 user_id 넣음
			pt.setString(2, user_pwd); // <= delete(String user_pwd) 여기에서 위에 user_pwd라서 user_pwd 넣음
			re = pt.executeUpdate(); // 수정 쿼리문 성공후 성공한 레코드 행의 개수를 반환

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(); // DB 닫기
		} // end try catch finally

		return re; // return타입을 -1로 받음. 참고하여 Mypage의 ActionListener 구현
	} // end delete()

	// 5. DB 닫기 기능 메서드(중복 코드를 줄이는 효과)
	public void dbClose() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(st != null) {
				st.close();
			}
			if(pt != null) {
				pt.close();
			}
		} catch(Exception e) {
			System.out.println(e + "=> dbClose Failed");
		} // end try catch
	} // end dbClose()   

	/* 모든 레코드 조회(mypagemain시간표)
	 */
	public void subjectSelectAll(DefaultTableModel dt) {
		String sql = "select subject_name, subject_teacher, subject_room, subject_date, subject_time, subject_status\r\n" + 
				"from subject where subject_status like '완료'";
		try {
			st = con.createStatement();//쿼리문 수행할 st생성
			rs = st.executeQuery(sql);

			//DefaultTableModel에 있는 기존 데이터 지우기
			for(int i = 0; i < dt.getRowCount();) {
				dt.removeRow(0);
			}
			while(rs.next()) {//다음 레코드 행이 있다면 참
				Object[] data = {
						rs.getNString("subject_name"),	
						rs.getNString("subject_teacher"),	
						rs.getNString("subject_room"),	
						rs.getNString("subject_date"),	
						rs.getNString("subject_time"),	
						rs.getNString("subject_status")	
				};
				dt.addRow(data);//디폴트 테이블 모델에 레코드 추가
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public static void messageBox(Object obj, String message) {
		JOptionPane.showMessageDialog((Component)obj, message);
	}

} // end MypageDAO