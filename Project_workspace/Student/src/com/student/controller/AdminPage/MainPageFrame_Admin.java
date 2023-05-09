package com.student.controller.AdminPage;

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

import com.student.controller.MainPage.MainPageUI;
import com.student.controller.MyPage.MyPageMainUI_Admin;
import com.student.controller.Sugang.Admin_Subject;


public class MainPageFrame_Admin {

	JFrame jf = new JFrame();
	JPanel MainPanel = new JPanel();
	JPanel MainInnerpanel = new JPanel();
	private JButton EduInfoBtn = new JButton("학원소개");
	private JButton TeachInfoBtn = new JButton("강사소개");
	private JButton SugangBtn = new JButton("수강신청");
	private JButton consultBtn = new JButton("상담신청");
	private JButton MapBtn = new JButton("오시는길");
	private JPanel MenuPanel = new JPanel();

	private JButton MyPageBtn = new JButton("관리자페이지");
	private JButton LogOutBtn = new JButton("로그아웃");
	private JPanel MainTopPanel = new JPanel();
	private JPanel MapPanel = new JPanel();
	

	//생성자
	public MainPageFrame_Admin() {
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
		HomeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		HomeBtn.setFocusPainted(false);
		HomeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
				new MainPageFrame_Admin();
			}
		});
		
		
		ImageIcon KGeduIcon = new ImageIcon("D:\\20221205_JAVA\\Project_workspace\\Student\\images\\1차프로젝트\\KG_IT_HOME.png");
		Image KGeduImg = KGeduIcon.getImage();
		Image KGImgChange = KGeduImg.getScaledInstance(290, 100, Image.SCALE_SMOOTH);
		ImageIcon KGIconChange = new ImageIcon(KGImgChange);
		JLabel KGeduLabel = new JLabel(KGIconChange);
		HomeBtn.add(KGeduLabel);
		MainTopPanel.add(HomeBtn);
		//KGeduLabel.setBounds(198, 43, 129, 29);
		
		//메인 탑 패널 로그인/회원가입 버튼
		MyPageBtn.setBounds(910, 51, 174, 52);
		MyPageBtn.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		MyPageBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		MyPageBtn.setContentAreaFilled(false);
		MyPageBtn.setFocusPainted(false);
		MyPageBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		MyPageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
				new MyPageMainUI_Admin();
			}
		});
		
		LogOutBtn.setBounds(1065, 52, 161, 50);
		LogOutBtn.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		LogOutBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
		LogOutBtn.setBorderPainted(false);
		LogOutBtn.setContentAreaFilled(false);
		LogOutBtn.setFocusPainted(false);
		LogOutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		LogOutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
				new MainPageUI();
			}
		});
		
		MainTopPanel.add(MyPageBtn);
		MainTopPanel.add(LogOutBtn);

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
	public static void main(String[] args) {
		 new MainPageFrame_Admin();
	}
	
}


