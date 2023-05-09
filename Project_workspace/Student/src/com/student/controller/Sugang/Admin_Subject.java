package com.student.controller.Sugang;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.student.dao.Admin_Subject_DAO;

public class Admin_Subject extends JFrame implements ActionListener {

	
	JMenuBar mb = new JMenuBar(); //메뉴바 객체 생성
	JMenu m = new JMenu("과목관리"); //메뉴 아이템 객체 생성
	JMenuItem insert = new JMenuItem("등록"); //메뉴아이템 객체 생성
	JMenuItem update=new JMenuItem("수정");
	JMenuItem delete=new JMenuItem("삭제");
	JMenuItem quit=new JMenuItem("종료");
	
	 String[] name = { "과목번호", "과목이름", "선생님", "강의실" ,"요일" , "시간"  };
	 String[] name2 = { "과목번호" ,"과목이름", "선생님", "강의실" ,"요일" , "시간","상태" };
	 
	    DefaultTableModel dt = new DefaultTableModel(name, 0);
	    DefaultTableModel dt2 = new DefaultTableModel(name2, 0);
	    /* name은 테이블의 열이름, 0은 테이블의 보관 유지하는 행수
	     * 
	     */
	    JTable jt = new JTable(dt);
	    JTable jt2 = new JTable(dt2);
	    JScrollPane jsp = new JScrollPane(jt);
	    JScrollPane jsp2 = new JScrollPane(jt2);
	    
	    /*
	     * South 영역에 추가할 Componet들
	     */
	    JPanel p = new JPanel();
	    JPanel p2 = new JPanel();
	    JPanel p3 = new JPanel();
	    JPanel p4 = new JPanel();
	    
	    String[] comboName = { "ALL", "과목이름 ", "선생님", "강의실" };
	    
	 
	    JComboBox combo = new JComboBox(comboName);
	    JTextField jtf = new JTextField(14);
	    JButton request = new JButton("승인");
	    JButton cancle = new JButton("거절");
	    JButton search = new JButton("검색");
	 
	    Admin_Subject_DAO dao = new Admin_Subject_DAO();

	    
	    
	    /**
	     * 화면구성 및 이벤트등록
	     */

	    public Admin_Subject() {
	    	 super("수강관리(관리자용)");
	    	//윈도우에 메뉴바 세팅
	         setJMenuBar(mb);
	         //setLayout(new GridLayout(2, 1));
	         //메뉴아이템을 메뉴에 추가
	         m.add(insert);
	         m.add(update);
	         m.add(delete);
	         m.add(quit);
	         //메뉴를 메뉴바에 추가
	         mb.add(m);
	         
	         p.setBackground(new Color(255,255,255));
	         p2.setBackground(new Color(255,255,255));
	         mb.setBackground(new Color(255,255,255));
	         m.setBackground(new Color(255,255,255));
	         
	         //add(p4,"Center");
	         add(p,"North");
	        add(p2,"Center");
	         //add(p3,"South");
	         
	        

	       
	         
	         
	      // South영역
	        
	        // add(p2, "Center");
	       // add(p, "Center" );
	        // add (p3, "South");
      
	         //p.setBackground(Color.yellow);
	         p2.add(request);
	         p2.add(cancle);
	         p2.add(combo);
	         p2.add(jtf);
	         p2.add(search);
	         
	         p.add(jsp);

	         
	         
	         p.add(jsp2);
	  
	         m.setEnabled(true);
	         
	         setSize(950,535);
	 		 setResizable(false);
			 setLocationRelativeTo(null);
	         dispose();
//	         super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	         setVisible(true);
	         
	         
	         // 이벤트등록
	         insert.addActionListener(this);
	         update.addActionListener(this);
	         delete.addActionListener(this);
	        quit.addActionListener(this);
	        request.addActionListener(this);
	        search.addActionListener(this);
	        cancle.addActionListener(this);

	         // 모든레코드를 검색하여 DefaultTableModle에 올리기
	         dao.userSelectAll(dt);
	         dao.userSelect(dt2);
	         
	        
	         //첫번행 선택.
	       // if (dt.getRowCount() > 0) { //레코드 값이 있는 경우
	       // 	// jt.setRowSelectionInterval(0, 0);
	       //  }
	       //  if(dt2.getRowCount() > 0) { 
			//		jt2.setRowSelectionInterval(0, 0);}


	    }
	    
	    
	public static void main(String[] args) {
		
		new Admin_Subject(); //생성자 호출

	} //main
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource() == insert) { //getSource() 메서드는 이벤트 발생 소스 객체를 반환  -> 가입버튼을 클릭하면 실행
			new Admin_Subject_GUI(this, "등록");
		} else if(e.getSource() == update) {
			new Admin_Subject_GUI(this, "수정");
		} else if(e.getSource() == delete ) { //삭제일때 실행
			int row = jt.getSelectedRow(); //JTable에서 선택된 행번호
			Object obj=jt.getValueAt(row, 0); //선택된 행의 첫번째 열값을 구함 => 회원아이디
			
			if(dao.userDel(obj.toString()) > 0) {
				 Admin_Subject_GUI.messageBox(this, "과목 삭제되었습니다!");
				 
				 dao.userSelectAll(dt);
				 if(dt.getRowCount()>0) {
					 jt.setRowSelectionInterval(0, 0);
				 }
			} else {
				Admin_Subject_GUI.messageBox(this, "과목이 삭제되지 않았습니다.");
			} //if else
		} else if(e.getSource() == quit) { //종료 메뉴 아이템일때 실행
			System.exit(0);
		} else if(e.getSource() == search) { //검색 버튼 클릭시 실행
			String fieldName = combo.getSelectedItem().toString().trim(); //콤보박스 선택목록 아이템을 구함
			
			if(fieldName.equals("ALL")) { //전체 검색일때
				dao.userSelectAll(dt);
				dao.userSelect(dt2);
				//if(dt.getRowCount() > 0) {
					//jt.setRowSelectionInterval(0, 0);}
				//if(dt2.getRowCount() > 0) { 
				//	jt2.setRowSelectionInterval(0, 0);
				//	}
				 //if
			} else {
	            
	            //if(jtf.getText().trim().equals("")) {//전체 검색이 아닐 때
	               //UserJDialogGUI.messageBox(this, "검색어를 입력하세요");
	               
	               //jtf.requestFocus();
	             {
	               //dao.getUserSearch(dt, fieldName, jtf.getText());
	            	//String fieldName = combo.getSelectedItem().toString().trim();
	    			//List<String> sqlName = new ArrayList<>(Arrays.asList("subject_name", "subject_teacher", "subject_room"));
	    			
	    			if(fieldName.equals("과목이름")) {
	    				dao.getUserSearch(dt, "subject_name", jtf.getText().trim());
	    				dao.getUserSearch2(dt2, "subject_name", jtf.getText().trim());
	    				
	    				//if(dt.getRowCount() > 0) {
	    					//jt.setRowSelectionInterval(0, 0);
	    					//jt2.setRowSelectionInterval(0, 0);
	    				//}
	    				//if
	    			} else if(fieldName.equals("선생님")) {
	    				dao.getUserSearch(dt, "subject_teacher", jtf.getText().trim());
	    				dao.getUserSearch2(dt2, "subject_teacher", jtf.getText().trim());
	    				//if(dt.getRowCount() > 0) {
	    					//jt.setRowSelectionInterval(0, 0);}
	    				
	    			} else if(fieldName.equals("강의실")) {
	    				dao.getUserSearch(dt, "subject_room", jtf.getText().trim());
	    				dao.getUserSearch2(dt2, "subject_room", jtf.getText().trim());
	    				//if(dt.getRowCount() > 0) {
	    				//	jt.setRowSelectionInterval(0, 0);}
	    				
	    			} 
	               if(dt.getRowCount() > 0) {
	                  jt.setRowSelectionInterval(0, 0);}
	               if(dt2.getRowCount() > 0) {
		                  jt2.setRowSelectionInterval(0, 0);}
	               
	            }
	            
	         }
	      } else if(e.getSource() == request) {
	    	  int row = jt2.getSelectedRow(); //JTable에서 선택된 행번호
				Object obj=jt2.getValueAt(row, 0); //선택된 행의 첫번째 열값을 구함 => 회원아이디
				
				if(dao.userRequest(obj.toString()) > 0) {
					 Admin_Subject_GUI.messageBox(this, "승인 완료 되었습니다.");
					 dao.userSelect(dt2);
					 dao.userSelectAll(dt);
					 
					 
				} //if else
	      } else if(e.getSource() == cancle) {
	    	  int row = jt2.getSelectedRow(); //JTable에서 선택된 행번호
				Object obj=jt2.getValueAt(row, 0); //선택된 행의 첫번째 열값을 구함 => 회원아이디
				
				if(dao.userCancle(obj.toString()) > 0) {
					 Admin_Subject_GUI.messageBox(this, "승인 거절 되었습니다.");
					 dao.userSelectAll(dt);
					 dao.userSelect(dt2);
				}
	} // 이벤트 발생시 호출
}
}