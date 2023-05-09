package com.student.controller.MyPage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import com.student.controller.MainPage.MainPageUI;
import com.student.controller.Sugang.Student_Subject_Request;
import com.student.dao.MypageDAO;
import javax.swing.JTextField;


public class MyPageMainUI_Student {

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
      private final JPanel panel_1 = new JPanel();
      private final JPanel panel = new JPanel();
      private final JPanel panel_2 = new JPanel();
      private final JLabel lblNewLabel = new JLabel(" 이름 : ");
      private final JTable table = new JTable();
      private final JTextField textField = new JTextField();
      private final JButton btnNewButton_1 = new JButton("사진 등록");
      private final JPanel panel_3 = new JPanel();
      private final JLabel lblNewLabel_2 = new JLabel("마이페이지");
      

      //생성자
      public MyPageMainUI_Student() {
         
         //이름옆의 텍스트필드
         textField.setBackground(Color.WHITE);
         textField.setFont(new Font("HY견고딕", Font.PLAIN, 18));
         textField.setBounds(278, 125, 279, 60);
         textField.setColumns(10);
         textField.setText("홍길동");//학생이름 정하면 바꿔주기
         textField.setEditable(false);
         
         //프레임 설정
         jf.getContentPane().setBackground(new Color(255, 255, 255));
         jf.setBackground(new Color(255, 255, 255));
         jf.setTitle("KGITbank 마이페이지");
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
               new MyPageMainUI_Student();
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
         LogOutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
         LogOutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               //로그아웃
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
         //수강신청
         SugangBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
         SugangBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
               new Student_Subject_Request();
               
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
         basePanel.setLayout(null);
         basePanel.setBounds(50, 152, 236, 80);
         btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));//버튼 클릭시 손가락모양
         //기본정보 클릭시 이벤트
         MainInnerpanel_1.add(basePanel);
         btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new MyPageInfoUI();
               jf.dispose();
            }
         });
         btnNewButton.setForeground(Color.BLACK);
         btnNewButton.setFont(new Font("HY견고딕", Font.PLAIN, 25));
         btnNewButton.setBackground(Color.WHITE);
         btnNewButton.setBounds(0, 0, 236, 80);
         
         basePanel.add(btnNewButton);
         tablePanel.setLayout(null);
         tablePanel.setBounds(50, 343, 236, 80);
         tableBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));//버튼 클릭시 손가락모양
         //시간표 클릭시 이벤트
         MainInnerpanel_1.add(tablePanel);
         tableBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new MyPageTimeTableUI();
               jf.dispose();
            }
         });
         tableBtn.setBackground(Color.WHITE);
         tableBtn.setFont(new Font("HY견고딕", Font.PLAIN, 25));
         tableBtn.setBounds(0, 0, 236, 80);
         
         tablePanel.add(tableBtn);
         outPanel.setLayout(null);
         outPanel.setBounds(50, 533, 236, 80);
         logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));//버튼 클릭시 손가락모양
         //회원 탈퇴시 이벤트
         MainInnerpanel_1.add(outPanel);
         logoutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new MyPageDelete();
            }
         });
         logoutBtn.setBackground(Color.WHITE);
         logoutBtn.setFont(new Font("HY견고딕", Font.PLAIN, 25));
         logoutBtn.setBounds(0, 0, 236, 80);
         
         outPanel.add(logoutBtn);
         panel_1.setLayout(null);
         panel_1.setBounds(340, 100, 750, 550);
         
         MainInnerpanel_1.add(panel_1);
         panel.setLayout(null);
         panel.setBackground(Color.WHITE);
         panel.setBounds(30, 10, 690, 510);
         
         panel_1.add(panel);
         panel_2.setBackground(Color.WHITE);
         panel_2.setBounds(20, 20, 150, 170);
         ImageIcon prfIcon = new ImageIcon("D:\\20221205_JAVA\\Project_workspace\\Student\\images\\1차프로젝트\\PROFILE.png");
         Image prfImg = prfIcon.getImage();
         Image prfImgChange = prfImg.getScaledInstance(150, 170, Image.SCALE_SMOOTH);
         ImageIcon prfIconChange = new ImageIcon(prfImgChange);
         JLabel prfIMG = new JLabel(prfIconChange);
         prfIMG.setBounds(7, 15, 1230, 763);
         panel_2.add(prfIMG);
         
         //시간표테이블 생성
         panel.add(panel_2);
         table.setBorder(new LineBorder(new Color(0, 0, 0)));
         table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
         String[] tablename = {"과목명", "선생님", "강의실", "요일", "시간", "상태"};
         //테이블 열이름 집어넣었는데 왜 안뜸??
         //화면에 출력되게 수정하기
         DefaultTableModel dt = new DefaultTableModel(tablename, 0);
         /* name : 테이블 열이름
          * 0 : 테이블이 보관하는 행 수
          */
         JTable jt = new JTable(dt);
         JScrollPane jsp = new JScrollPane(jt);
         jsp.setBounds(10, 5, 630, 140);
         //jt.setModel(dt);
         //jt.setBounds(20, 342, 647, 96);
         
         //panel.add(jsp);
         
         JPanel panel_4 = new JPanel();
         panel_4.setBackground(Color.WHITE);
         panel.add(panel_4);
         panel_4.setBounds(20, 342, 650, 150);
         panel_4.setLayout(null);
         panel_4.add(jsp);
         
         
         
         
         
         
         //db불러와서 테이블 채우기
         MypageDAO dao = new MypageDAO();
         dao.subjectSelectAll(dt);//모든 레코드를 검색해서 DefaultTableModel에 올리기
         
         if(dt.getRowCount() > 0) {//레코드 값이 있는 경우
            jt.setRowSelectionInterval(0, 0);//첫번째 행 선택
         }
         
         Component horizontalStrut = Box.createHorizontalStrut(20);
         horizontalStrut.setBounds(20, 320, 647, 1);
         panel.add(horizontalStrut);
         
         JLabel lblNewLabel_1 = new JLabel("수강 교과목");
         lblNewLabel_1.setFont(new Font("HY견고딕", Font.PLAIN, 20));
         lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel_1.setBounds(185, 270, 254, 59);
         panel.add(lblNewLabel_1);
         lblNewLabel.setBounds(187, 120, 81, 70);
         panel.add(lblNewLabel);
         lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
         lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 20));
         
         panel.add(textField);//이름 텍스트필드
         btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));//사진등록 버튼마우스 오버->손가락표시
         btnNewButton_1.setBackground(Color.WHITE);
         btnNewButton_1.setBounds(35, 205, 125, 29);
         
         panel.add(btnNewButton_1);
         panel_3.setBackground(Color.WHITE);
         panel_3.setBounds(240, 30, 350, 80);
         
         panel.add(panel_3);
         panel_3.setLayout(null);
         lblNewLabel_2.setFont(new Font("HY견고딕", Font.PLAIN, 26));
         lblNewLabel_2.setBackground(Color.WHITE);
         lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel_2.setBounds(15, 15, 320, 50);
         
         panel_3.add(lblNewLabel_2);
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