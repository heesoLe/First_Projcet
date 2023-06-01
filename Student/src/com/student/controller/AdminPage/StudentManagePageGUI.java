package com.student.controller.AdminPage;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.student.dao.StudentManagePageDAO;

public class StudentManagePageGUI extends JDialog implements ActionListener{
	JPanel pw = new JPanel(new GridLayout(5, 1)); //4행 1열의 그리드 레이아웃
	JPanel pc = new JPanel(new GridLayout(5, 1));
	JPanel ps = new JPanel();

	JLabel label_Name = new JLabel("이름");
	JLabel label_Id = new JLabel("아이디");
	JLabel label_Pwd = new JLabel("비밀번호");
	JLabel label_eMail = new JLabel("메일");
	JLabel label_Phone = new JLabel("연락처");

	public JTextField name = new JTextField();
	public JTextField id = new JTextField();
	public JTextField pwd = new JTextField();
	public JTextField email = new JTextField();
	public JTextField phone = new JTextField();

	JButton confirm;
	JButton reset = new JButton("취소");

	StudentManagePage me;

	//JPanel idChp = new JPanel(new BorderLayout());

	StudentManagePageDAO dao = new StudentManagePageDAO();

	public StudentManagePageGUI(StudentManagePage me, String name2) {
		super(me,"수정 창");
		this.me = me;

		if(name2.equals("조회")) {
			confirm = new JButton("조회");
		} else if(name2.equals("수정")){//회원 수정일 때 실행
			confirm = new JButton("수정");

			int row = me.jt.getSelectedRow(); //선택된 행번호 구함
			id.setText(me.jt.getValueAt(row, 0).toString()); //아이디 입력박스에 선택행 첫번째 열 아이디 값을 문자열로 표시
			name.setText(me.jt.getValueAt(row, 1).toString());
			pwd.setText(me.jt.getValueAt(row, 2).toString());
			email.setText(me.jt.getValueAt(row, 3).toString());
			phone.setText(me.jt.getValueAt(row, 4).toString());

			//아이디 입력박스 비활성화
			id.setEditable(false);
		}//if else

		//라벨 pw패널 레이아웃에 추가
		pw.add(label_Id);
		pw.add(label_Name);
		pw.add(label_Pwd);
		pw.add(label_eMail);
		pw.add(label_Phone);

		//아이디 입력박스와 아이디 중복 검색 버튼을 패널에 추가
		//idChp.add(id,"Center");
		//		idChp.add(idchkBtn,"East");

		//텍스트 필드 패널에 추가
		pc.add(id);
		pc.add(name);
		pc.add(pwd);
		pc.add(email);
		pc.add(phone);

		//가입(수정), 취소 버튼 패널에 추가
		ps.add(confirm);
		ps.add(reset);

		add(pw,"West"); //프레임 왼쪽에 배치
		add(pc, "Center");
		add(ps, "South");
		
		setSize(300,250);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		//각 버튼 이벤트 등록
		confirm.addActionListener(this);
		reset.addActionListener(this);

	}//생성자 오버로딩

	@Override
	public void actionPerformed(ActionEvent e) {
		String btnLabel = e.getActionCommand(); //버튼위의 캡션 문자열을 구함
		if(btnLabel.equals("취소")) {
			dispose(); //현재 열려진 다이얼로그 창만 닫는다.
			//SYstem.exit(0); ==> 전체 프로그램 종료
		} else if(btnLabel.equals("수정")) {
			if(dao.userUpdate(this) > 0) {
				messageBox(this, "회원정보가 수정되었습니다.");
				dispose();

				dao.userSelectAll(me.dt);
				if(me.dt.getRowCount() > 0) {
					me.jt.setRowSelectionInterval(0, 0);
				} //inner if
			} else {
				messageBox(this, "회원정보가 수정되지 않았습니다.");
			}//if else
		}
	}//이벤트 발생 후 호출

	/* 메시지 박스를 띄워주는 메서드 작성 */
	public static void messageBox(Object obj, String message) {
		JOptionPane.showMessageDialog((Component)obj, message);
	}
}
