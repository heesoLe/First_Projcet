package com.student.controller.MyPage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import com.student.controller.SugangPageUI;
import com.student.controller.MainPage.MainPageUI;


public class MyPageTimeTableUI {

   JFrame jf = new JFrame();
   JPanel MainPanel = new JPanel();
   JPanel MainInnerpanel = new JPanel();
   private JButton EduInfoBtn = new JButton("학원소개");
   private JButton TeachInfoBtn = new JButton("강사소개");
   private JButton SugangBtn = new JButton("수강신청");
   private JButton consultBtn = new JButton("상담신청");
   private JButton MapBtn = new JButton("오시는길");
   private JPanel MenuPanel = new JPanel();

   private JButton MyPageBtn = new JButton("마이페이지");
   private JButton LogOutBtn = new JButton("로그아웃");
   private JPanel MainTopPanel = new JPanel();
   private JPanel MapPanel = new JPanel();
   private final JPanel MainInnerpanel_1 = new JPanel();
   private final JPanel basePanel = new JPanel();
   private final JButton btnNewButton = new JButton("기본정보");
   
   private final JPanel tablePanel = new JPanel();
   private final JButton tableBtn = new JButton("시간표");
   private final JPanel outPanel = new JPanel();
   private final JButton logoutBtn = new JButton("회원탈퇴");
   private final JPanel panel = new JPanel();
   private final JLabel lblNewLabel = new JLabel("New label");
   private final JLabel lblNewLabel_1 = new JLabel("토");
   private final JLabel lblNewLabel_2 = new JLabel("시간 / 요일");
   private final JLabel lblNewLabel_3 = new JLabel("월");
   private final JLabel lblNewLabel_4 = new JLabel("화");
   private final JLabel lblNewLabel_5 = new JLabel("수");
   private final JLabel lblNewLabel_5_1 = new JLabel("목");
   private final JLabel lblNewLabel_5_2 = new JLabel("금");
   private final JLabel lblNewLabel_5_3 = new JLabel("9:00 ~ 12:00");
   private final JLabel lblNewLabel_5_4 = new JLabel("일");
   private final JLabel lblNewLabel_5_5 = new JLabel("자바");
   private final JLabel lblNewLabel_5_6 = new JLabel("자바");
   private final JLabel lblNewLabel_5_7 = new JLabel("자바\r\n");
   private final JLabel lblNewLabel_5_8 = new JLabel("자바");
   private final JLabel lblNewLabel_5_9 = new JLabel("13:00 ~ 16:00");
   private final JLabel lblNewLabel_5_10 = new JLabel("Spring");
   private final JLabel lblNewLabel_5_11 = new JLabel("자바");
   private final JLabel lblNewLabel_5_12 = new JLabel("자바");
   private final JLabel lblNewLabel_5_13 = new JLabel("파이썬");
   private final JLabel lblNewLabel_5_14 = new JLabel("파이썬");
   private final JLabel lblNewLabel_5_15 = new JLabel("파이썬");
   private final JLabel lblNewLabel_5_16 = new JLabel("파이썬");
   private final JLabel lblNewLabel_5_17 = new JLabel("Spring");
   private final JLabel lblNewLabel_5_18 = new JLabel("파이썬");
   private final JLabel lblNewLabel_5_19 = new JLabel("파이썬");
   private final JLabel lblNewLabel_5_20 = new JLabel("JSP");
   private final JLabel lblNewLabel_5_21 = new JLabel("16:00 ~ 19:00");
   private final JLabel lblNewLabel_5_22 = new JLabel("JSP");
   private final JLabel lblNewLabel_5_23 = new JLabel("JSP");
   private final JLabel lblNewLabel_5_24 = new JLabel("JSP");
   private final JLabel lblNewLabel_5_25 = new JLabel("JSP");
   private final JLabel lblNewLabel_5_26 = new JLabel("JSP");
   private final JLabel lblNewLabel_5_27 = new JLabel("19:00 ~ 22:00");
   private final JLabel lblNewLabel_5_28 = new JLabel("C언어");
   private final JLabel lblNewLabel_5_29 = new JLabel("C언어");
   private final JLabel lblNewLabel_5_30 = new JLabel("C언어");
   private final JLabel lblNewLabel_5_31 = new JLabel("Spring");
   private final JLabel lblNewLabel_5_32 = new JLabel("C언어");
   private final JLabel lblNewLabel_5_33 = new JLabel("C언어");
   private final JLabel lblNewLabel_5_34 = new JLabel("C언어");
   private final JLabel lblNewLabel_5_35 = new JLabel("Spring");
   private final JPanel panel_2_1 = new JPanel();
   private final JPanel panel_2_2 = new JPanel();
   private final JPanel panel_2_3 = new JPanel();
   private final JPanel panel_2_4 = new JPanel();
   private final JPanel panel_2_5 = new JPanel();
   private final JPanel panel_2_6 = new JPanel();
   private final JPanel panel_2_7 = new JPanel();
   private final JPanel panel_2_8 = new JPanel();
   private final JPanel panel_2_9 = new JPanel();
   private final JPanel panel_2_10 = new JPanel();
   private final JPanel panel_2_11 = new JPanel();
   private final JPanel panel_2_12 = new JPanel();
   private final JPanel panel_2_13 = new JPanel();
   private final JPanel panel_2_14 = new JPanel();
   private final JPanel panel_2_14_1 = new JPanel();
   private final JPanel panel_2_14_2 = new JPanel();
   private final JPanel panel_2_14_3 = new JPanel();
   private final JPanel panel_2_14_4 = new JPanel();
   private final JPanel panel_2_14_4_1 = new JPanel();
   private final JPanel panel_2_14_4_2 = new JPanel();
   private final JPanel panel_2_14_4_3 = new JPanel();
   private final JPanel panel_2_14_4_4 = new JPanel();
   private final JPanel panel_2_14_4_5 = new JPanel();
   private final JPanel panel_2_14_4_6 = new JPanel();
   private final JPanel panel_2_14_4_6_1 = new JPanel();
   private final JPanel panel_2_14_4_6_2 = new JPanel();
   private final JPanel panel_2_14_4_6_3 = new JPanel();
   private final JPanel panel_2_14_4_6_4 = new JPanel();
   private final JPanel panel_2_14_4_6_5 = new JPanel();
   private final JPanel panel_2_14_4_6_6 = new JPanel();
   private final JPanel panel_2_14_4_6_6_1 = new JPanel();
   private final JPanel panel_2_14_4_6_6_2 = new JPanel();
   private final JPanel panel_2_14_4_6_6_4 = new JPanel();
   private final JPanel panel_2_14_4_6_6_5 = new JPanel();
   private final JPanel panel_2_14_4_6_6_6 = new JPanel();
   private final JPanel panel_2_14_4_6_6_3 = new JPanel();
   private final JPanel panel_2_14_4_6_6_7 = new JPanel();
   private final JPanel panel_2_14_4_6_6_7_1 = new JPanel();
   private final JPanel panel_2_14_4_6_6_7_2 = new JPanel();
   private final JLabel lblNewLabel_7 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_1 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_2 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_3 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_4 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_5 = new JLabel("1101호");
   private final JPanel panel_3 = new JPanel();
   private final JLabel lblNewLabel_7_6 = new JLabel("1103호");
   private final JLabel lblNewLabel_7_6_1 = new JLabel("1103호");
   private final JLabel lblNewLabel_7_6_2 = new JLabel("1103호");
   private final JLabel lblNewLabel_7_6_3 = new JLabel("1103호");
   private final JLabel lblNewLabel_7_6_4 = new JLabel("1103호");
   private final JLabel lblNewLabel_7_6_5 = new JLabel("1103호");
   private final JLabel lblNewLabel_7_7 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_8 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_9 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_10 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_11 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_12 = new JLabel("1101호");
   private final JLabel lblNewLabel_7_13 = new JLabel("1104호");
   private final JLabel lblNewLabel_7_13_1 = new JLabel("1104호");
   private final JLabel lblNewLabel_7_13_2 = new JLabel("1104호");
   private final JLabel lblNewLabel_7_13_3 = new JLabel("1104호");
   private final JLabel lblNewLabel_7_13_4 = new JLabel("1102호");
   private final JLabel lblNewLabel_7_13_4_1 = new JLabel("1102호");
   private final JLabel lblNewLabel_7_13_4_2 = new JLabel("1102호");
   private final JLabel lblNewLabel_7_13_4_3 = new JLabel("1102호");
   private final JLabel lblNewLabel_7_13_4_4 = new JLabel("1102호");
   private final JLabel lblNewLabel_7_13_4_5 = new JLabel("1102호");
   

   //생성자
   public MyPageTimeTableUI() {
      //프레임 설정
      jf.getContentPane().setBackground(new Color(255, 255, 255));
      jf.setBackground(new Color(255, 255, 255));
      jf.setTitle("KGITbank 입니다.");
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
            new MyPageTimeTableUI();
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
      //마이페이지 버튼
      MyPageBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      MyPageBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            jf.dispose();
            new MyPageMainUI_Student();
         }
      });
      
      //메인 탑 패널 로그인/회원가입 버튼
      MyPageBtn.setBounds(883, 51, 174, 52);
      MyPageBtn.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
      MyPageBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
      MyPageBtn.setContentAreaFilled(false);
      MyPageBtn.setFocusPainted(false);
      
      //로그아웃버튼
      LogOutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      LogOutBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            jf.dispose();
            new MainPageUI();
         }
      });
      
      
      LogOutBtn.setBounds(1073, 52, 161, 50);
      LogOutBtn.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
      LogOutBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
      LogOutBtn.setBorderPainted(false);
      LogOutBtn.setContentAreaFilled(false);
      LogOutBtn.setFocusPainted(false);
      
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
      MenuPanel.add(EduInfoBtn);

      TeachInfoBtn.setBorder(null);
      TeachInfoBtn.setBackground(Color.WHITE);
      TeachInfoBtn.setBounds(277, 11, 120, 30);
      TeachInfoBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
      TeachInfoBtn.setBorderPainted(false);
      TeachInfoBtn.setContentAreaFilled(false);
      TeachInfoBtn.setFocusPainted(false);
      MenuPanel.add(TeachInfoBtn);
      //수강신청 버튼
      SugangBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      SugangBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new SugangPageUI();
         }
      });

      SugangBtn.setBorder(null);
      SugangBtn.setBackground(Color.WHITE);
      SugangBtn.setBounds(521, 11, 120, 30);
      SugangBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
      SugangBtn.setBorderPainted(false);
      SugangBtn.setContentAreaFilled(false);
      SugangBtn.setFocusPainted(false);
      MenuPanel.add(SugangBtn);

      consultBtn.setBorder(null);
      consultBtn.setBackground(Color.WHITE);
      consultBtn.setBounds(774, 11, 120, 30);
      consultBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
      consultBtn.setBorderPainted(false);
      consultBtn.setContentAreaFilled(false);
      consultBtn.setFocusPainted(false);
      MenuPanel.add(consultBtn);
      MapBtn.setBorder(null);
      MapBtn.setBackground(Color.WHITE);
      MapBtn.setBounds(1008, 11, 120, 30);
      MapBtn.setFont(new Font("HY견고딕", Font.PLAIN, 24));
      MapBtn.setBorderPainted(false);
      MapBtn.setContentAreaFilled(false);
      MapBtn.setFocusPainted(false);
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

      JScrollPane js = new JScrollPane(MainInnerpanel,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      MainInnerpanel_1.setLayout(null);
      MainInnerpanel_1.setBackground(Color.WHITE);
      MainInnerpanel_1.setBounds(0, 0, 1230, 763);
      
      MainInnerpanel.add(MainInnerpanel_1);
      basePanel.setBackground(Color.WHITE);
      basePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
      basePanel.setLayout(null);
      basePanel.setBounds(50, 152, 236, 80);
      
      MainInnerpanel_1.add(basePanel);
      //기본정보버튼 클릭시 이벤트
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            new MyPageInfoUI();
            jf.dispose();

         }
      });
      btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//버튼 클릭시 손가락모양
      btnNewButton.setForeground(Color.BLACK);
      btnNewButton.setFont(new Font("HY견고딕", Font.PLAIN, 25));
      btnNewButton.setBackground(Color.WHITE);
      btnNewButton.setBounds(0, 0, 236, 80);
      
      basePanel.add(btnNewButton);
      tablePanel.setLayout(null);
      tablePanel.setBounds(50, 343, 236, 80);
      
      //시간표 버튼 클릭시 이벤트
      MainInnerpanel_1.add(tablePanel);
      tableBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            new MyPageTimeTableUI();
            jf.dispose();

         }
      });
      tableBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));//버튼 클릭시 손가락모양
      tableBtn.setBackground(Color.WHITE);
      tableBtn.setFont(new Font("HY견고딕", Font.PLAIN, 25));
      tableBtn.setBounds(0, 0, 236, 80);
      
      tablePanel.add(tableBtn);
      outPanel.setLayout(null);
      outPanel.setBounds(50, 533, 236, 80);
      
      MainInnerpanel_1.add(outPanel);
      //회원탈퇴 클릭시 이벤트
      logoutBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new MyPageDelete();
         }
      });
      logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));//버튼 클릭시 손가락모양
      logoutBtn.setBackground(Color.WHITE);
      logoutBtn.setFont(new Font("HY견고딕", Font.PLAIN, 25));
      logoutBtn.setBounds(0, 0, 236, 80);
      
      outPanel.add(logoutBtn);
      panel.setBackground(Color.WHITE);
      panel.setBounds(330, 140, 840, 540);
      
      MainInnerpanel_1.add(panel);
      panel.setLayout(new GridLayout(5, 8, 0, 0));
      
      JPanel panel_2 = new JPanel();
      panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2.setBackground(Color.WHITE);
      panel.add(panel_2);
      panel_2.setLayout(new BorderLayout(0, 0));
      lblNewLabel_2.setForeground(Color.BLACK);
      panel_2.add(lblNewLabel_2);
      lblNewLabel_2.setBackground(Color.PINK);
      lblNewLabel_2.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_1.setBackground(Color.WHITE);
      
      panel.add(panel_2_1);
      panel_2_1.setLayout(new BorderLayout(0, 0));
      lblNewLabel_3.setForeground(Color.BLACK);
      panel_2_1.add(lblNewLabel_3, BorderLayout.CENTER);
      lblNewLabel_3.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_3.setBackground(SystemColor.controlShadow);
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_2.setBackground(Color.WHITE);
      
      panel.add(panel_2_2);
      panel_2_2.setLayout(new BorderLayout(0, 0));
      lblNewLabel_4.setForeground(Color.BLACK);
      panel_2_2.add(lblNewLabel_4, BorderLayout.CENTER);
      lblNewLabel_4.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_4.setBackground(SystemColor.controlShadow);
      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_3.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_3.setBackground(Color.WHITE);
      
      panel.add(panel_2_3);
      panel_2_3.setLayout(new BorderLayout(0, 0));
      lblNewLabel_5.setForeground(Color.BLACK);
      panel_2_3.add(lblNewLabel_5, BorderLayout.CENTER);
      lblNewLabel_5.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5.setBackground(SystemColor.controlShadow);
      lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_4.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_4.setBackground(Color.WHITE);
      
      panel.add(panel_2_4);
      panel_2_4.setLayout(new BorderLayout(0, 0));
      lblNewLabel_5_1.setForeground(Color.BLACK);
      panel_2_4.add(lblNewLabel_5_1, BorderLayout.CENTER);
      lblNewLabel_5_1.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_1.setBackground(SystemColor.controlShadow);
      lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_5.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_5.setBackground(Color.WHITE);
      
      panel.add(panel_2_5);
      panel_2_5.setLayout(new BorderLayout(0, 0));
      lblNewLabel_5_2.setForeground(Color.BLACK);
      panel_2_5.add(lblNewLabel_5_2, BorderLayout.CENTER);
      lblNewLabel_5_2.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_2.setBackground(SystemColor.controlShadow);
      lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_6.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_6.setBackground(Color.WHITE);
      
      panel.add(panel_2_6);
      panel_2_6.setLayout(new BorderLayout(0, 0));
      lblNewLabel_1.setForeground(Color.BLACK);
      panel_2_6.add(lblNewLabel_1, BorderLayout.CENTER);
      lblNewLabel_1.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_1.setBackground(SystemColor.controlShadow);
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_7.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_7.setBackground(Color.WHITE);
      
      panel.add(panel_2_7);
      panel_2_7.setLayout(new BorderLayout(0, 0));
      lblNewLabel_5_4.setForeground(Color.BLACK);
      panel_2_7.add(lblNewLabel_5_4, BorderLayout.CENTER);
      lblNewLabel_5_4.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_4.setBackground(SystemColor.controlShadow);
      lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_11.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_11.setBackground(Color.WHITE);
      
      panel.add(panel_2_11);
      panel_2_11.setLayout(new BorderLayout(0, 0));
      panel_2_11.add(lblNewLabel_5_3, BorderLayout.CENTER);
      lblNewLabel_5_3.setFont(new Font("HY견고딕", Font.PLAIN, 14));
      lblNewLabel_5_3.setForeground(Color.BLACK);
      lblNewLabel_5_3.setBackground(Color.DARK_GRAY);
      lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_12.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_12.setBackground(Color.ORANGE);
      
      panel.add(panel_2_12);
      panel_2_12.setLayout(new BorderLayout(0, 0));
      panel_2_12.add(lblNewLabel_5_6, BorderLayout.CENTER);
      lblNewLabel_5_6.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_6.setBackground(new Color(255, 255, 0));
      lblNewLabel_5_6.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_12.add(lblNewLabel_7, BorderLayout.SOUTH);
      panel_2_13.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_13.setBackground(Color.ORANGE);
      
      panel.add(panel_2_13);
      panel_2_13.setLayout(new BorderLayout(0, 0));
      panel_2_13.add(lblNewLabel_5_8, BorderLayout.CENTER);
      lblNewLabel_5_8.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_8.setBackground(Color.YELLOW);
      lblNewLabel_5_8.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_1.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_13.add(lblNewLabel_7_1, BorderLayout.SOUTH);
      panel_2_14.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14.setBackground(Color.ORANGE);
      
      panel.add(panel_2_14);
      panel_2_14.setLayout(new BorderLayout(0, 0));
      panel_2_14.add(lblNewLabel_5_7, BorderLayout.CENTER);
      lblNewLabel_5_7.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_7.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_2.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14.add(lblNewLabel_7_2, BorderLayout.SOUTH);
      panel_2_14_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_1.setBackground(Color.ORANGE);
      
      panel.add(panel_2_14_1);
      panel_2_14_1.setLayout(new BorderLayout(0, 0));
      panel_2_14_1.add(lblNewLabel_5_5, BorderLayout.CENTER);
      lblNewLabel_5_5.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_5.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_3.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_1.add(lblNewLabel_7_3, BorderLayout.SOUTH);
      panel_2_14_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_2.setBackground(Color.ORANGE);
      
      panel.add(panel_2_14_2);
      panel_2_14_2.setLayout(new BorderLayout(0, 0));
      panel_2_14_2.add(lblNewLabel_5_11, BorderLayout.CENTER);
      lblNewLabel_5_11.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_11.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_4.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_2.add(lblNewLabel_7_4, BorderLayout.SOUTH);
      panel_2_14_3.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_3.setBackground(Color.ORANGE);
      
      panel.add(panel_2_14_3);
      panel_2_14_3.setLayout(new BorderLayout(0, 0));
      panel_2_14_3.add(lblNewLabel_5_12, BorderLayout.CENTER);
      lblNewLabel_5_12.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_12.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_5.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_3.add(lblNewLabel_7_5, BorderLayout.SOUTH);
      panel_2_14_4_6_6_3.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_3.setBackground(new Color(255, 204, 204));
      
      panel.add(panel_2_14_4_6_6_3);
      panel_2_14_4_6_6_3.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_3.add(lblNewLabel_5_10, BorderLayout.CENTER);
      lblNewLabel_5_10.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_10.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_3.add(lblNewLabel_7_13, BorderLayout.SOUTH);
      panel_2_8.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_8.setBackground(Color.WHITE);
      
      panel.add(panel_2_8);
      panel_2_8.setLayout(new BorderLayout(0, 0));
      panel_2_8.add(lblNewLabel_5_9, BorderLayout.CENTER);
      lblNewLabel_5_9.setFont(new Font("HY견고딕", Font.PLAIN, 14));
      lblNewLabel_5_9.setForeground(Color.BLACK);
      lblNewLabel_5_9.setBackground(Color.DARK_GRAY);
      lblNewLabel_5_9.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_14_4_6.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6.setBackground(new Color(255, 204, 153));
      
      panel.add(panel_2_14_4_6);
      panel_2_14_4_6.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6.add(lblNewLabel_5_16, BorderLayout.CENTER);
      lblNewLabel_5_16.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_16.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6.add(lblNewLabel_7_6, BorderLayout.SOUTH);
      panel_2_14_4_6_5.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_5.setBackground(new Color(255, 204, 153));
      
      panel.add(panel_2_14_4_6_5);
      panel_2_14_4_6_5.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_5.add(lblNewLabel_5_15, BorderLayout.CENTER);
      lblNewLabel_5_15.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_15.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_1.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_5.add(lblNewLabel_7_6_1, BorderLayout.SOUTH);
      panel_2_14_4_6_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_1.setBackground(new Color(255, 204, 153));
      
      panel.add(panel_2_14_4_6_1);
      panel_2_14_4_6_1.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_1.add(lblNewLabel_5_14, BorderLayout.CENTER);
      lblNewLabel_5_14.setBackground(Color.WHITE);
      lblNewLabel_5_14.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_14.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_2.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_1.add(lblNewLabel_7_6_2, BorderLayout.SOUTH);
      panel_2_14_4_6_4.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_4.setBackground(new Color(255, 204, 153));
      
      panel.add(panel_2_14_4_6_4);
      panel_2_14_4_6_4.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_4.add(lblNewLabel_5_18, BorderLayout.CENTER);
      lblNewLabel_5_18.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_18.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_3.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_4.add(lblNewLabel_7_6_3, BorderLayout.SOUTH);
      panel_2_14_4_6_3.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_3.setBackground(new Color(255, 204, 153));
      
      panel.add(panel_2_14_4_6_3);
      panel_2_14_4_6_3.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_3.add(lblNewLabel_5_19, BorderLayout.CENTER);
      lblNewLabel_5_19.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_19.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_4.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_4.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_3.add(lblNewLabel_7_6_4, BorderLayout.SOUTH);
      panel_2_14_4_6_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_2.setBackground(new Color(255, 204, 153));
      
      panel.add(panel_2_14_4_6_2);
      panel_2_14_4_6_2.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_2.add(lblNewLabel_5_13, BorderLayout.CENTER);
      lblNewLabel_5_13.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_13.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_5.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_6_5.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_2.add(lblNewLabel_7_6_5, BorderLayout.SOUTH);
      panel_2_14_4_6_6_7.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_7.setBackground(new Color(255, 204, 204));
      
      panel.add(panel_2_14_4_6_6_7);
      panel_2_14_4_6_6_7.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_7.add(lblNewLabel_5_17, BorderLayout.CENTER);
      lblNewLabel_5_17.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_17.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_1.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_7.add(lblNewLabel_7_13_1, BorderLayout.SOUTH);
      panel_2_9.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_9.setBackground(Color.WHITE);
      
      panel.add(panel_2_9);
      panel_2_9.setLayout(new BorderLayout(0, 0));
      panel_2_9.add(lblNewLabel_5_21, BorderLayout.CENTER);
      lblNewLabel_5_21.setFont(new Font("HY견고딕", Font.PLAIN, 14));
      lblNewLabel_5_21.setForeground(Color.BLACK);
      lblNewLabel_5_21.setBackground(Color.DARK_GRAY);
      lblNewLabel_5_21.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_14_4.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4.setBackground(Color.YELLOW);
      
      panel.add(panel_2_14_4);
      panel_2_14_4.setLayout(new BorderLayout(0, 0));
      panel_2_14_4.add(lblNewLabel_5_20, BorderLayout.CENTER);
      lblNewLabel_5_20.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_20.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_7.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_7.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4.add(lblNewLabel_7_7, BorderLayout.SOUTH);
      panel_2_14_4_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_1.setBackground(Color.YELLOW);
      
      panel.add(panel_2_14_4_1);
      panel_2_14_4_1.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_1.add(lblNewLabel_5_22, BorderLayout.CENTER);
      lblNewLabel_5_22.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_22.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_8.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_8.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_1.add(lblNewLabel_7_8, BorderLayout.SOUTH);
      panel_2_14_4_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_2.setBackground(Color.YELLOW);
      
      panel.add(panel_2_14_4_2);
      panel_2_14_4_2.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_2.add(lblNewLabel_5_26, BorderLayout.CENTER);
      lblNewLabel_5_26.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_26.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_9.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_9.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_2.add(lblNewLabel_7_9, BorderLayout.SOUTH);
      panel_2_14_4_3.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_3.setBackground(Color.YELLOW);
      
      panel.add(panel_2_14_4_3);
      panel_2_14_4_3.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_3.add(lblNewLabel_5_23, BorderLayout.CENTER);
      lblNewLabel_5_23.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_23.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_10.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_10.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_3.add(lblNewLabel_7_10, BorderLayout.SOUTH);
      panel_2_14_4_4.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_4.setBackground(Color.YELLOW);
      
      panel.add(panel_2_14_4_4);
      panel_2_14_4_4.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_4.add(lblNewLabel_5_25, BorderLayout.CENTER);
      lblNewLabel_5_25.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_25.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_11.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_11.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_4.add(lblNewLabel_7_11, BorderLayout.SOUTH);
      panel_2_14_4_5.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_5.setBackground(Color.YELLOW);
      
      panel.add(panel_2_14_4_5);
      panel_2_14_4_5.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_5.add(lblNewLabel_5_24, BorderLayout.CENTER);
      lblNewLabel_5_24.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_24.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_12.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_12.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_5.add(lblNewLabel_7_12, BorderLayout.SOUTH);
      panel_2_14_4_6_6_7_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_7_1.setBackground(new Color(255, 204, 204));
      
      panel.add(panel_2_14_4_6_6_7_1);
      panel_2_14_4_6_6_7_1.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_7_1.add(lblNewLabel_5_31, BorderLayout.CENTER);
      lblNewLabel_5_31.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_31.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_2.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_7_1.add(lblNewLabel_7_13_2, BorderLayout.SOUTH);
      panel_2_10.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_10.setBackground(Color.WHITE);
      
      panel.add(panel_2_10);
      panel_2_10.setLayout(new BorderLayout(0, 0));
      panel_2_10.add(lblNewLabel_5_27, BorderLayout.CENTER);
      lblNewLabel_5_27.setFont(new Font("HY견고딕", Font.PLAIN, 14));
      lblNewLabel_5_27.setForeground(Color.BLACK);
      lblNewLabel_5_27.setBackground(Color.MAGENTA);
      lblNewLabel_5_27.setHorizontalAlignment(SwingConstants.CENTER);
      panel_2_14_4_6_6.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6.setBackground(new Color(255, 255, 153));
      
      panel.add(panel_2_14_4_6_6);
      panel_2_14_4_6_6.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6.add(lblNewLabel_5_30, BorderLayout.CENTER);
      lblNewLabel_5_30.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_30.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6.add(lblNewLabel_7_13_4, BorderLayout.SOUTH);
      panel_2_14_4_6_6_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_1.setBackground(new Color(255, 255, 153));
      
      panel.add(panel_2_14_4_6_6_1);
      panel_2_14_4_6_6_1.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_1.add(lblNewLabel_5_29, BorderLayout.CENTER);
      lblNewLabel_5_29.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_29.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_1.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_1.add(lblNewLabel_7_13_4_1, BorderLayout.SOUTH);
      panel_2_14_4_6_6_4.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_4.setBackground(new Color(255, 255, 153));
      
      panel.add(panel_2_14_4_6_6_4);
      panel_2_14_4_6_6_4.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_4.add(lblNewLabel_5_32, BorderLayout.CENTER);
      lblNewLabel_5_32.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_32.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_2.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_4.add(lblNewLabel_7_13_4_2, BorderLayout.SOUTH);
      panel_2_14_4_6_6_5.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_5.setBackground(new Color(255, 255, 153));
      
      panel.add(panel_2_14_4_6_6_5);
      panel_2_14_4_6_6_5.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_5.add(lblNewLabel_5_28, BorderLayout.CENTER);
      lblNewLabel_5_28.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_28.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_3.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_5.add(lblNewLabel_7_13_4_3, BorderLayout.SOUTH);
      panel_2_14_4_6_6_6.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_6.setBackground(new Color(255, 255, 153));
      
      panel.add(panel_2_14_4_6_6_6);
      panel_2_14_4_6_6_6.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_6.add(lblNewLabel_5_34, BorderLayout.CENTER);
      lblNewLabel_5_34.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_34.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_4.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_4.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_6.add(lblNewLabel_7_13_4_4, BorderLayout.SOUTH);
      panel_2_14_4_6_6_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_2.setBackground(new Color(255, 255, 153));
      
      panel.add(panel_2_14_4_6_6_2);
      panel_2_14_4_6_6_2.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_2.add(lblNewLabel_5_33, BorderLayout.CENTER);
      lblNewLabel_5_33.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_33.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_5.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_4_5.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_2.add(lblNewLabel_7_13_4_5, BorderLayout.SOUTH);
      panel_2_14_4_6_6_7_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2_14_4_6_6_7_2.setBackground(new Color(255, 204, 204));
      
      panel.add(panel_2_14_4_6_6_7_2);
      panel_2_14_4_6_6_7_2.setLayout(new BorderLayout(0, 0));
      panel_2_14_4_6_6_7_2.add(lblNewLabel_5_35, BorderLayout.CENTER);
      lblNewLabel_5_35.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      lblNewLabel_5_35.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_7_13_3.setFont(new Font("HY견고딕", Font.PLAIN, 18));
      
      panel_2_14_4_6_6_7_2.add(lblNewLabel_7_13_3, BorderLayout.SOUTH);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(Color.WHITE);
      panel_1.setBounds(328, 44, 837, 85);
      MainInnerpanel_1.add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblNewLabel_6 = new JLabel("시간표");
      lblNewLabel_6.setFont(new Font("HY견고딕", Font.PLAIN, 26));
      lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_6.setBounds(247, 10, 298, 65);
      panel_1.add(lblNewLabel_6);
      panel_3.setBackground(Color.BLACK);
      panel_3.setBounds(328, 138, 844, 544);
      
      MainInnerpanel_1.add(panel_3);
      
      js.setPreferredSize(new Dimension(1200,700));
      js.setBounds(7, 15, 1230, 763);
      
      //오시는길
      MapPanel.setBackground(new Color(255, 255, 255));
      MapPanel.setBounds(17, 210, 1197, 731);
      MapBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
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