package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import com.student.controller.Sugang.Admin_Subject_GUI;

public class Admin_Subject_DAO {
	
	//필요한 멤버변수 선언
	
	Connection con; //db 연결 con
	Statement st; //쿼리문 수행 st
	PreparedStatement ps; //쿼리문 수행 ps
	ResultSet rs; //검색결과 레코드를 저장할 rs
	
	//생성자에서 DB연결 => qksqhrwjr zhemfmf whrma wnfduwnsek.
	
	public Admin_Subject_DAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","1234");
		} catch (ClassNotFoundException e) {
			System.out.println(e+"=>로드 fail");
		} catch (SQLException e) {
			System.out.println(e+"=>연결 fail");
		}
	} //생성자

	/*
	 * DB 닫기 기능 메서드 => 중복코드를 줄이는 효과가 발생
	 */
	
	public void dbClose() {
		
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(st != null) st.close();
		} catch(Exception e) {
			System.out.println(e+"=>dbClose failed");
		}
	}

	
	//모든 레코드 조회
	public void userSelectAll(DefaultTableModel dt) {
		try {
			st=con.createStatement(); // 쿼리문 수행할 st 생성
			rs=st.executeQuery("select * from subject order by subject_no asc");
			
			//DefaultTableModel에 있는 기존 데이터 지우기
			for(int i=0; i<dt.getRowCount();) {
				dt.removeRow(0);
			}
			while(rs.next()) { //다음 레코드 행이 있다면 참
				Object[] data = {rs.getString("subject_no"), rs.getString("subject_name"), rs.getString("subject_teacher"), rs.getString("subject_room"),rs.getString("subject_date"),rs.getString("subject_time"),rs.getString("subject_status")};
				dt.addRow(data); //디폴트 테이블 모델에 레코드 추가
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
	} //userSelectAll
	
	//수강신청한 레코드 조회
	public void userSelect(DefaultTableModel dt2) {
		// 화면에서 테이블 행 클릭시 전체 데이터 가져와서 객체에 담기 student VO에 담기
		// Student student = 가져온값 여기다 넣어
		
		// 학생 아이디를 변수에 담기 => get뭐시기로 가져오면 됨
		// String studentID = student.get
		
		// 쿼리문 작성하기
		// String sql = "select * from " + tableName + "where request_student_id = " + student_id;
		try {
			st=con.createStatement(); // 쿼리문 수행할 st 생성			
			rs=st.executeQuery("select * from subject where subject_status = '승인 대기중' order by subject_no asc");
			
			//DefaultTableModel에 있는 기존 데이터 지우기
			for(int i=0; i<dt2.getRowCount();) {
				dt2.removeRow(0);
			}
			while(rs.next()) { //다음 레코드 행이 있다면 참
				Object[] data = {rs.getString("subject_no"), rs.getString("subject_name"), rs.getString("subject_teacher"), rs.getString("subject_room"),rs.getString("subject_date"),rs.getString("subject_time"),rs.getString("subject_status")};
				dt2.addRow(data); //디폴트 테이블 모델에 레코드 추가
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
	} //userSelectAll
	
	//회원 저장
	public int userListInsert(Admin_Subject_GUI user) {
		
		int re=-1; //저장 실패시 반환값
		
		try {
			ps=con.prepareStatement("insert into subject values(?,?,?,?,?,?,'')");
			ps.setString(1,user.no.getText()); //쿼리문 첫번째 물음표에 문자열로 아이디 저장
			ps.setString(2,user.name.getText());
			ps.setString(3,user.teacher.getText());
			ps.setString(4,user.room.getText());
			ps.setString(5,user.date.getText());
			ps.setString(6,user.time.getText());
			
			//ps.setString(5,user.status.getText());
			
			re=ps.executeUpdate(); //저장 쿼리문 수행후 성공한 레코드 행의 개수를 반환
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return re;
	} //userListInsert

	
	
	//아이디 중복 체크
	public boolean getIdByCheck(String id) {
		
		boolean result=true;
		
		try { 
			ps = con.prepareStatement("select * from subject where subject_no=?");
			ps.setNString(1, id);
			rs=ps.executeQuery(); //select 문은 executeQuery() 메서드로 실행
			if(rs.next()) {
				result=false;
			}
		} catch(Exception e ) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		
		return result;
	} //getIdByCheck()

	public int userUpdate(Admin_Subject_GUI user) {
		
		int result = 0; //수정 실패시 반환값
		String sql="update subject set subject_no=?, subject_name=?, subject_teacher=?, subject_room=?, subject_date, subject_time  where subject_no=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.no.getText());
			ps.setString(2, user.name.getText());
			ps.setString(3, user.teacher.getText());
			ps.setString(4, user.room.getText());
			//ps.setString(5, user.status.getText());
			ps.setString(5, user.no.getText());
			
			result=ps.executeUpdate(); //수정 쿼리문 성공후 성공한 레코드 행의 개수를 반환
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return result;
	}
	
	//승인
		public int userRequest(String id) {
			
			int re=0;
			
			try {
				ps = con.prepareStatement("update subject set subject_status='완료' where subject_no=?");
				ps.setString(1, id);
				re=ps.executeUpdate(); //삭제 성공후 성공한 레코드 행의 개수를 반환
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				dbClose();
			}
			return re;
		}
		//거절
				public int userCancle(String id) {
					
					int re=0;
					
					try {
						ps = con.prepareStatement("update subject set subject_status='' where subject_no=?");
						ps.setString(1, id);
						re=ps.executeUpdate(); //삭제 성공후 성공한 레코드 행의 개수를 반환
						
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						dbClose();
					}
					return re;
				}
	//삭제
	public int userDel(String id) {
		
		int re=0;
		
		try {
			ps = con.prepareStatement("delete from subject where subject_no=?");
			ps.setString(1, id);
			re=ps.executeUpdate(); //삭제 성공후 성공한 레코드 행의 개수를 반환
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return re;
	}
	//+fieldName.trim()+" like '%"+word.trim()+"%'
	public void getUserSearch(DefaultTableModel dt, String m, String word) {
		String sql = "select * from subject where " +m+" like '%"+word.trim()+"%' AND subject_status is null";
		//like는 ~와 비슷한 문자를 찾아주는 검색연산자 키워드 %는 하나이상의 임의의 모르는 문자와 매핑 대응
		
		try {
			st= con.createStatement();
			rs=st.executeQuery(sql); 
			
			//디폴트테이블 모델에 있는 기존 데이터 지우기
			for(int i=0; i<dt.getRowCount();) { 
				dt.removeRow(0);
			}
			
			while (rs.next()) {
				Object[] data = {
						rs.getString("subject_no"),
						rs.getString("subject_name"),
						rs.getString("subject_teacher"),
						rs.getString("subject_room"),
						rs.getString("subject_date"),
						rs.getString("subject_time"),
						rs.getString("subject_status")
						
						
				};
				dt.addRow(data);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
			
		}
	}
	
	public void getUserSearch2(DefaultTableModel dt2, String m, String word) {
		String sql = "select * from subject where " +m+" like '%"+word.trim()+"%' AND subject_status = '승인 대기중'";
		//like는 ~와 비슷한 문자를 찾아주는 검색연산자 키워드 %는 하나이상의 임의의 모르는 문자와 매핑 대응
		
		try {
			st= con.createStatement();
			rs=st.executeQuery(sql); 
			
			//디폴트테이블 모델에 있는 기존 데이터 지우기
			for(int i=0; i<dt2.getRowCount();) { 
				dt2.removeRow(0);
			}
			
			while (rs.next()) {
				Object[] data = {
						rs.getString("subject_no"),
						rs.getString("subject_name"),
						rs.getString("subject_teacher"),
						rs.getString("subject_room"),
						rs.getString("subject_status")
						
						
				};
				dt2.addRow(data);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
			
		}
	}
}










