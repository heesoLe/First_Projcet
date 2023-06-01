package com.student.controller.Login_SignUp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import com.student.dao.StudentDAO;
import com.student.vo.MemberVO;

// 아이디 찾기 UI 

public class FindIDUI extends JDialog implements ActionListener {

	private JLabel TitleIDLabel = new JLabel("아이디 찾기");
	private JLabel NameLabel = new JLabel("이름 : ");
	private final JTextField NametextField = new JTextField();
	private final JLabel PhoneLabel = new JLabel("연락처 : ");
	private final JButton Findbtn = new JButton("찾기");
	private final JButton Cancelbtn = new JButton("취소");
	private final JTextField PhonetextField = new JTextField();
	private final JPanel panel = new JPanel();
	private final JLabel PhonenotieLabel = new JLabel(" ' ex)010-1234-56789 → 010123456789 '");
	private final JLabel NamenotieLabel = new JLabel(" ' 한글 2~4자 이내로 입력해 주세요. '");
	
	StudentDAO dao = new StudentDAO();
	MemberVO vo = new MemberVO();

	public FindIDUI() {

		//프레임 생성
		setSize(new Dimension(470, 600));
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);

		setTitle("KGITbank 아이디 찾기 페이지");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);

		//타이틀 위치 및 생성
		TitleIDLabel.setBounds(14, 12, 436, 123);
		TitleIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleIDLabel.setFont(new Font("HY견고딕", Font.PLAIN, 30));
		TitleIDLabel.setBackground(Color.WHITE);

		//아이디 생성
		getContentPane().add(TitleIDLabel);
		NameLabel.setBounds(46, 158, 100, 30);
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NameLabel.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		NameLabel.setBackground(Color.WHITE);
		getContentPane().add(NameLabel);
		NametextField.setHorizontalAlignment(SwingConstants.LEFT);

		//아이디 텍스트 생성
		NametextField.setBounds(46, 215, 362, 40);
		NametextField.setMargin(new Insets(0, 0, 0, 0));
		NametextField.setBackground(Color.WHITE);
		NametextField.setFont(new Font("HY견고딕", Font.PLAIN, 25));
		getContentPane().add(NametextField);
		NametextField.setColumns(10);

		// 비밀번호 생성
		PhoneLabel.setBounds(46, 271, 116, 30);
		PhoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PhoneLabel.setFont(new Font("HY견고딕", Font.PLAIN, 20));
		PhoneLabel.setBackground(Color.WHITE);
		getContentPane().add(PhoneLabel);

		// 찾기 버튼 생성
		Findbtn.setFont(new Font("HY견고딕", Font.PLAIN, 18));
		Findbtn.setBackground(Color.WHITE);
		Findbtn.setBounds(74, 468, 135, 50);
		Findbtn.setBorder(new MatteBorder(1,1,1,1, (Color) new Color(0, 0, 0)));
		Findbtn.setBorderPainted(true);
		Findbtn.setContentAreaFilled(true);
		Findbtn.setFocusPainted(true);
		getContentPane().add(Findbtn);

		// 찾기 버튼 클릭시 이름과 연락처에 해당하는 본인 아이디와 초기화된 비밀번호 '0000' 으로 알림창 띄우기 
		Findbtn.addActionListener(this);
		//버튼에 마우스 올렸을때 손가락모양으로 변경
		Findbtn.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

		// 취소 버튼 생성
		Cancelbtn.setFont(new Font("HY견고딕", Font.PLAIN, 18));
		Cancelbtn.setBorder(new MatteBorder(1,1,1,1, (Color) new Color(0, 0, 0)));
		Cancelbtn.setBackground(Color.WHITE);
		Cancelbtn.setBounds(250, 468, 135, 50);
		Cancelbtn.setBorderPainted(true);
		Cancelbtn.setContentAreaFilled(true);
		Cancelbtn.setFocusPainted(true);
		getContentPane().add(Cancelbtn);

		// 취소 버튼 클릭 시 메인 화면 창으로 이동 및 로그인 창 닫기.
		Cancelbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		//버튼에 마우스 올렸을때 손가락모양으로 변경
		Cancelbtn.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

		PhonetextField.setHorizontalAlignment(SwingConstants.LEFT);
		PhonetextField.setMargin(new Insets(0, 0, 0, 0));
		PhonetextField.setFont(new Font("HY견고딕", Font.PLAIN, 25));
		PhonetextField.setColumns(10);
		PhonetextField.setBackground(Color.WHITE);
		PhonetextField.setBounds(46, 332, 362, 40);		
		getContentPane().add(PhonetextField);

		PhonenotieLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PhonenotieLabel.setForeground(new Color(0, 128, 128));
		PhonenotieLabel.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		PhonenotieLabel.setBackground(Color.WHITE);
		PhonenotieLabel.setBounds(56, 302, 342, 23);
		getContentPane().add(PhonenotieLabel);

		NamenotieLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NamenotieLabel.setForeground(new Color(0, 128, 128));
		NamenotieLabel.setFont(new Font("HY견고딕", Font.PLAIN, 13));
		NamenotieLabel.setBackground(Color.WHITE);
		NamenotieLabel.setBounds(86, 186, 237, 18);
		getContentPane().add(NamenotieLabel);

	}
	public static void main(String[] args) {
		new FindIDUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) { //아이디 찾기 버튼
		String user_name = NametextField.getText();
		String user_phone = PhonetextField.getText();
		
		try {
			
			if(user_name.length()==0) {
				JOptionPane.showMessageDialog(null, "이름을 입력하세요", "오류", JOptionPane.ERROR_MESSAGE);
				NametextField.requestFocus();
				return;
			}else if(user_phone.length() ==0) {
				JOptionPane.showMessageDialog(null, "연락처를 입력하세요","오류",JOptionPane.ERROR_MESSAGE);
				PhonetextField.requestFocus();
				return;
			} //end if else if
			
		}catch(Exception ec){
			ec.printStackTrace();
		} // end try catch
		
		
		boolean result;		
		try {
			result = dao.findId(user_name, user_phone);
			String user_id = dao.findId1(user_name, user_phone); 
			
			if(result) { // true라면 
				messageBox(null, user_name + " 님의 계정은 " + user_id + " 입니다.");
				dispose();
				new LoginUI();
				// true -> user_name에 해당하는 아이디 메시지 띄우기
			}else {
				messageBox(null, NametextField.getText()+"님의 계정이 확인 되지 않았습니다.");
				NametextField.setText(""); NametextField.requestFocus(); // 필드박스 리셋 
				PhonetextField.setText(""); PhonetextField.requestFocus();
			} //end if else if
			
		}catch(Exception e1) {
			e1.printStackTrace();
		} // end try catch
		
	} // end actionPerformed()

	//메시지 박스를 띄워주는 메서드 작성
		public static void messageBox(Object obj, String message) {
			JOptionPane.showMessageDialog((Component)obj, message);
		}
}
