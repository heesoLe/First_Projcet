package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import com.student.controller.AdminPage.StudentManagePageGUI;

public class StudentManagePageDAO {//JDBC
	/* 필요한 멤버변수 선엉 */
	Connection con; //db연결
	Statement st; //쿼리문 수행 st
	PreparedStatement ps; //쿼리문 수행 ps
	String sql;
	ResultSet rs; //검색결과 레코드를 저장할 rs
	
	//생성자에서 DB연결 => 반복적 코드를 조금 줄여준다
	public StudentManagePageDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "STUDENT", "1234");
			//sql = ""
			//ps = con.prepareStatement(sql);
			//rs = ps.executeQuery();
		} catch (ClassNotFoundException e) {
			System.out.println(e + "=>로드 fail");
		} catch(SQLException e) {
			System.out.println(e+ "=>연결 fail");
		}
	}//생성자
	
	/* DB닫기 기능 메서드 => 중복코드를 줄이는 효과가 발생
	 */
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(st != null) st.close();
			if(ps != null) ps.close();
		} catch (Exception e) {
			System.out.println(e + "=>dbClose Failed");
		}
	}//dbClose()
	
	/* 모든 레코드 조회 
	 */
	public void userSelectAll(DefaultTableModel dt) {
		 try {
			st=con.createStatement();//쿼리문 수행할 st생성
			rs = st.executeQuery("select * from student order by user_id asc");
			
			//DefaultTableModel에 있는 기존 데이터 지우기
			for(int i=0; i<dt.getRowCount();) {
				dt.removeRow(0);
			}//for
			while(rs.next()) {//다음 레코드 행이 있다면 참
				Object[] data = {
						rs.getString("user_id"),
						rs.getString("user_name"),
						rs.getString("user_pwd"),
						rs.getString("user_email"),
						rs.getString("user_phone")
				};
				dt.addRow(data); //디폴트 테이블 모델에 레코드 추가
			}//while
			
		} catch (Exception e) {e.printStackTrace();}
		 finally {
			 dbClose();
		 }
	}//userSelectAll()

	public void userSelectAll1(DefaultTableModel dt) {
		 try {
			st=con.createStatement();//쿼리문 수행할 st생성
			rs = st.executeQuery("select * from studentwait order by wuser_id asc");
			
			//DefaultTableModel에 있는 기존 데이터 지우기
			for(int i=0; i<dt.getRowCount();) {
				dt.removeRow(0);
			}//for
			while(rs.next()) {//다음 레코드 행이 있다면 참
				Object[] data = {
						rs.getString("wuser_id"),
						rs.getString("wuser_name"),
						rs.getString("wuser_pwd"),
						rs.getString("wuser_email"),
						rs.getString("wuser_phone"),
						rs.getString("wuser_status")
				};
				dt.addRow(data); //디폴트 테이블 모델에 레코드 추가
			}//while
			
		} catch (Exception e) {e.printStackTrace();}
		 finally {
			 dbClose();
		 }
	}//userSelectAll()
	
	
	
	//회원 저장
	public int userListInsert(StudentManagePageGUI user) {
		int re = -1; //저장 실패시 반환값
		
		try {
			ps=con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setNString(1, user.name.getText());
			ps.setString(2, user.id.getText()); //쿼리문 첫번째 물음표에 문자열로 아이디 저장
			ps.setNString(3, user.pwd.getText());
			ps.setNString(4, user.email.getText());
			ps.setString(5, user.phone.getText());

			re = ps.executeUpdate(); //저장 쿼리문 수행 후 성공한 레코드 행의 개수를 반환
			
		} catch (Exception e) {e.printStackTrace();}
		finally {
			dbClose();
		}
		return re;
	}//userListInsert()
	
	//아이디 중복검색
	public boolean getIdByCheck(String id) {
		boolean result = true;
		try {
			ps = con.prepareStatement("select * from student where user_id = ?");
			ps.setString(1, id);
			rs = ps.executeQuery(); //select문은 excuteQuery() 메서드로 실행
			if(rs.next()) {
				result = false;
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {
			dbClose();
		}
		return result;
	}//getIdByCheck()
	
	//회원정보 수정
	public int userUpdate(StudentManagePageGUI user) {
		int re = -1;
		String sql = "update student set user_name = ?, user_pwd = ?, user_email = ?, user_phone = ? where user_id= ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.name.getText());
			ps.setString(2, user.pwd.getText());
			ps.setString(3, user.email.getText());
			ps.setString(4, user.phone.getText());
			ps.setString(5, user.id.getText());
			
			re = ps.executeUpdate();
		} catch (Exception e) {e.printStackTrace();}
		finally {
			dbClose();
		}
		return re;
	}//userUpdate()
	
	//회원삭제
	public int userDel(String id) {
		int re=0;
		try {
			String sql = "delete from student where user_id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			re = ps.executeUpdate(); //삭제 성공후 성공한 레코드 행의 개수를 반환
			
		} catch (Exception e) {e.printStackTrace();}
		finally {
			dbClose();
		}
		return re;
	}
	/* 과제물) 코드 마무리 한 것 각자 스스로 디버깅을 포함한 개발자 테스트를 해본다. */
	
	//회원 검색
	public void getUserSearch(DefaultTableModel dt, String m, String word) {
		String sql = "select * from student where " + m + " like '%" + word.trim() + "%'";
		//like는 ~와 비슷한 문자을 찾아주는 검색연산자 키워드, %는 하나 이상의 임의의 모르는 문자와 매핑 대응
		
		try {
			st = con.createStatement(); //쿼리문 수행 st 생성
			rs = st.executeQuery(sql); 
			
			for(int i=0; i<dt.getRowCount();) {
				dt.removeRow(0);
			}
			
			while(rs.next()) {
				Object[] data = {
						rs.getString("user_id"),
						rs.getString("user_name"),
						rs.getString("user_pwd"),
						rs.getString("user_email"),
						rs.getString("user_phone")				
						//rs.getString(4)											
				};
				dt.addRow(data); //디폴트 테이블 모델에 레코드 추가
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {
			dbClose();
		}
	}
	
	/* status 모든 레코드 조회 
	 */
	public void userSelectAll_1(DefaultTableModel dt) {
		 try {
			st=con.createStatement();//쿼리문 수행할 st생성
			rs = st.executeQuery("select * from student order by user_id asc");
			
			//DefaultTableModel에 있는 기존 데이터 지우기
			for(int i=0; i<dt.getRowCount();) {
				dt.removeRow(0);
			}//for
			while(rs.next()) {//다음 레코드 행이 있다면 참
				Object[] data = {
						rs.getString("user_name"),
						rs.getString("user_id"),
						rs.getString("user_pwd"),
						rs.getString("user_email"),
						rs.getString("user_phone"),
						rs.getString("user_status")
				};
				dt.addRow(data); //디폴트 테이블 모델에 레코드 추가
			}//while
			
		} catch (Exception e) {e.printStackTrace();}
		 finally {
			 dbClose();
		 }
	}//userSelectAll()

	//대기중 회원 승인
	public int userListInsert_1(String id) {
		int re = -1; //저장 실패시 반환값
		
		try {
			ps=con.prepareStatement("insert into student select * from studentwait where wuser_id = ?");
			ps.setNString(1, id);

			re = ps.executeUpdate(); //저장 쿼리문 수행 후 성공한 레코드 행의 개수를 반환
			
		} catch (Exception e) {e.printStackTrace();}
		finally {
			dbClose();
		}
		return re;
	}//userListInsert()	
	
}//UserDefaultJTableDAO class
