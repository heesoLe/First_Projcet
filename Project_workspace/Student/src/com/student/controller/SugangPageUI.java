package com.student.controller;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.student.controller.MainPage.MainPageUI;

import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;


public class SugangPageUI {

	JFrame jf = new JFrame();
	private final JButton btn1 = new JButton("학원소개");
	private final JButton btn2 = new JButton("강사소개");
	private final JButton btn3 = new JButton("수강신청");
	private final JButton btn4 = new JButton("상담신청");
	private final JButton btn5 = new JButton("오시는길");
	private final JPanel panel = new JPanel();
	private LineBorder bb = new LineBorder(Color.white,1,true);
	private final JLabel lblNewLabel_1 = new JLabel("");
	JPanel MainPanel = new JPanel();
	private final JButton Loginbtn = new JButton("로그인");
	private final JPanel panel_1 = new JPanel();
	private final JButton SignUpbtn = new JButton("회원가입");
	private final JLabel lblNewLabel_2 = new JLabel("");

	String[] name = {"아이디", "name", "age", "addr"};	

	DefaultTableModel dt = new DefaultTableModel(name, 0);
	/* name은 테이블의 열이름, 0은 테이블이 보관 유지하는 행 수
	 */

	JTable jt = new JTable(dt);
	JScrollPane jsp = new JScrollPane(jt);
	/* 남쪽에 검색기능 추가될 것
	 */
	JPanel p = new JPanel();
	private JTextField textField;
	private JTable table;



	public SugangPageUI() {
		jf.getContentPane().setBackground(new Color(255, 255, 255));
		jf.getContentPane().setFont(new Font("바탕", Font.PLAIN, 12));
		jf.setBackground(new Color(255, 255, 255));
		jf.setTitle("수강신청");
		jf.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 47, 724, 201);
		jf.getContentPane().add(panel_2);
		
		DefaultTableModel dt = new DefaultTableModel(name, 0);

		JTable jt = new JTable(dt);
		JScrollPane jsp = new JScrollPane(jt);

		panel_2.add(jt);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(UIManager.getBorder("ComboBox.editorBorder"));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("HY중고딕", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"강사", "과목"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(185, 16, 72, 21);
		jf.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(269, 16, 177, 21);
		jf.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton Searchbtn = new JButton("검색");
		Searchbtn.setBorder(new CompoundBorder(new CompoundBorder(), null));
		Searchbtn.setBounds(453, 15, 72, 23);
		jf.getContentPane().add(Searchbtn);

		jf.setSize(730,680);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		jf.setVisible(true);
	}//생성자

}
