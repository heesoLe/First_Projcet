package com.student.controller.MainPage;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;

import com.student.controller.Login_SignUp.LoginUI;
import com.student.controller.Login_SignUp.SignUpUI;


public class MainPageUI  {

	public JFrame jf = new JFrame();
	JPanel MainPanel = new JPanel();
	JPanel MainInnerpanel = new JPanel();
	private JButton EduInfoBtn = new JButton("학원소개");
	private JButton TeachInfoBtn = new JButton("강사소개");
	private JButton SugangBtn = new JButton("수강신청");
	private JButton consultBtn = new JButton("상담신청");
	private JButton MapBtn = new JButton("오시는길");
	private JPanel MenuPanel = new JPanel();

	private JButton Loginbtn = new JButton("로그인");
	private JButton SignUpbtn = new JButton("회원가입");
	private JPanel MainTopPanel = new JPanel();
	private JPanel MapPanel = new JPanel();
	

	//생성자
	public MainPageUI() {
		//프레임 설정
		jf.getContentPane().setBackground(new Color(255, 255, 255));
		jf.setBackground(new Color(255, 255, 255));
		jf.setTitle("KGITbank 메인 페이지");
		jf.getContentPane().setLayout(null);
		

		jf.setSize(1280,1024);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

		//메인 탑 패널
		MainTopPanel.setBounds(0, 0, 1274, 131);
		MainTopPanel.setLayout(null);
		
		
		//메인 탑 패널 로고 이미지
		JButton HomeBtn = new JButton("");
		HomeBtn.setBorder(null);
		HomeBtn.setBackground(Color.WHITE);
		HomeBtn.setBounds(485, 8, 328, 116);
		HomeBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		HomeBtn.setBorderPainted(false);
		HomeBtn.setContentAreaFilled(false);
		HomeBtn.setFocusPainted(false);
		HomeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		HomeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
				new MainPageUI();
			}
		});
			
		ImageIcon KGeduIcon = new ImageIcon("D:\\20221205_JAVA\\Project_workspace\\Student\\images\\1차프로젝트\\KG_IT_HOME.png");
		Image KGeduImg = KGeduIcon.getImage();
		Image KGImgChange = KGeduImg.getScaledInstance(290, 100, Image.SCALE_SMOOTH);
		ImageIcon KGIconChange = new ImageIcon(KGImgChange);
		JLabel KGeduLabel = new JLabel(KGIconChange);
		HomeBtn.add(KGeduLabel);
		//KGeduLabel.setBounds(198, 43, 129, 29);
		MainTopPanel.add(HomeBtn);
		
		//메인 탑 패널 로그인/회원가입 버튼
		Loginbtn.setBounds(883, 51, 174, 52);
		Loginbtn.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		Loginbtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		Loginbtn.setContentAreaFilled(false);
		Loginbtn.setFocusPainted(false);
		Loginbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		Loginbtn.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 jf.dispose();
	        	 new LoginUI();

	         }
	      });
		SignUpbtn.setBounds(1073, 52, 161, 50);
		SignUpbtn.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		SignUpbtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		SignUpbtn.setBorderPainted(false);
		SignUpbtn.setContentAreaFilled(false);
		SignUpbtn.setFocusPainted(false);
		SignUpbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		SignUpbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == SignUpbtn) {
					new SignUpUI();
				}
			}
		});
		
		MainTopPanel.add(Loginbtn);
		MainTopPanel.add(SignUpbtn);

		//메뉴패널
		MenuPanel.setBounds(50, 142, 1164, 53);
		
		MenuPanel.setBorder(new MatteBorder(0, 0, 6, 0, (Color) new Color(0, 0, 0)));
		MenuPanel.setBackground(new Color(255, 255, 255));
		MenuPanel.setLayout(null);

		//메뉴 버튼
		EduInfoBtn.setBorder(null);
		EduInfoBtn.setBackground(Color.WHITE);
		EduInfoBtn.setBounds(39, 11, 120, 30);
		EduInfoBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		EduInfoBtn.setBorderPainted(false);
		EduInfoBtn.setContentAreaFilled(false);
		EduInfoBtn.setFocusPainted(false);
		EduInfoBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		MenuPanel.add(EduInfoBtn);

		TeachInfoBtn.setBorder(null);
		TeachInfoBtn.setBackground(Color.WHITE);
		TeachInfoBtn.setBounds(277, 11, 120, 30);
		TeachInfoBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		TeachInfoBtn.setBorderPainted(false);
		TeachInfoBtn.setContentAreaFilled(false);
		TeachInfoBtn.setFocusPainted(false);
		TeachInfoBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		MenuPanel.add(TeachInfoBtn);

		SugangBtn.setBorder(null);
		SugangBtn.setBackground(Color.WHITE);
		SugangBtn.setBounds(521, 11, 120, 30);
		SugangBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		SugangBtn.setBorderPainted(false);
		SugangBtn.setContentAreaFilled(false);
		SugangBtn.setFocusPainted(false);
		SugangBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		MenuPanel.add(SugangBtn);

		consultBtn.setBorder(null);
		consultBtn.setBackground(Color.WHITE);
		consultBtn.setBounds(774, 11, 120, 30);
		consultBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		consultBtn.setBorderPainted(false);
		consultBtn.setContentAreaFilled(false);
		consultBtn.setFocusPainted(false);
		consultBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		MenuPanel.add(consultBtn);
		
		MapBtn.setBorder(null);
		MapBtn.setBackground(Color.WHITE);
		MapBtn.setBounds(1008, 11, 120, 30);
		MapBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		MapBtn.setBorderPainted(false);
		MapBtn.setContentAreaFilled(false);
		MapBtn.setFocusPainted(false);
		MapBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		MapBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainInnerpanel.setVisible(false);
				MainPanel.setVisible(false);
				MapPanel.setVisible(true);
			}
		});
		
		MenuPanel.add(MapBtn);

		
		//메인패널 설정
		MainPanel = new JPanel();
		MainPanel.setBackground(new Color(255, 255, 255));
		MainPanel.setBounds(8, 193, 1248, 784);
		MainPanel.setLayout(null);
		MainPanel.setPreferredSize(new Dimension(1249,774));
		MainInnerpanel.setBounds(7, 15, 1230, 763);
		MainInnerpanel.setLayout(null);
		//MainInnerpanel.setPreferredSize(new Dimension(300,300));
				
		//메인 이미지
		ImageIcon MainIcon_1 = new ImageIcon("D:\\20221205_JAVA\\Project_workspace\\Student\\images\\1차프로젝트\\메인사진.png");
		Image MainImg_1 = MainIcon_1.getImage();
		Image MainImgChange_1 = MainImg_1.getScaledInstance(700, 700, Image.SCALE_SMOOTH);
		ImageIcon MainIconChange_1 = new ImageIcon(MainImgChange_1);
		JLabel MainIMG = new JLabel(MainIconChange_1);
		MainIMG.setBounds(239, 19, 752, 709);
		MainInnerpanel.add(MainIMG);

		JScrollPane js = new JScrollPane(MainInnerpanel,
				                         JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				                         JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		js.setPreferredSize(new Dimension(1200,700));
		js.setBounds(7, 15, 1230, 763);
		
		//오시는길
		MapPanel.setBackground(new Color(255, 255, 255));
		MapPanel.setBounds(17, 210, 1197, 731);
		ImageIcon MapIcon = new ImageIcon("D:\\20221205_JAVA\\Project_workspace\\Student\\images\\1차프로젝트\\KGMAP.png");
		Image MapImg = MapIcon.getImage();
		Image MapImgChange = MapImg.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
		ImageIcon MapIconChange = new ImageIcon(MapImgChange);
		JLabel MapIMG = new JLabel(MapIconChange);
		MapIMG.setBounds(7, 15, 1230, 763);
		MapPanel.add(MapIMG);
		MapPanel.setVisible(false);
		
		jf.getContentPane().add(MainTopPanel);
		MainPanel.add(js);
		jf.getContentPane().add(MenuPanel);
		jf.getContentPane().add(MainPanel);
		jf.getContentPane().add(MapPanel);
		jf.setVisible(true);
	}//생성자
}
