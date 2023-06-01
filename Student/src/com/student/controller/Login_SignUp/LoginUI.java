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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import com.student.controller.AdminPage.MainPageFrame_Admin;
import com.student.controller.MainPage.MainPageFrame_Student;
import com.student.controller.MainPage.MainPageUI;
import com.student.dao.StudentDAO;

//로그인 UI + 버튼 기능 추가

public class LoginUI extends JDialog implements ActionListener { 
   
   JFrame jf = new JFrame();
   public MainPageUI main;
   
   private JButton Loginbtn = new JButton("로그인");
   private JLabel TitleLabel = new JLabel("ID / PW 로그인");
   private JLabel idLabel = new JLabel("아이디 : ");
   private final JTextField idtextField = new JTextField();
   private final JLabel PwdLabel = new JLabel("비밀번호 : ");
   private final JPasswordField PasswordField = new JPasswordField();
   private final JButton FindIDBtn = new JButton("아이디 찾기");
   private final JButton FindPwdBtn = new JButton("비밀번호 찾기");
   private final JButton SignUpbtn = new JButton("회원가입");
   private final JButton Cancelbtn = new JButton("취소");
   private final JPanel panel = new JPanel();

   StudentDAO dao = new StudentDAO();
   
   public static void main(String[] args) {
      new LoginUI();
   }
   
   public LoginUI() {
      
      //프레임 생성
      setSize(new Dimension(750, 710));
      getContentPane().setBackground(new Color(255, 255, 255));
      getContentPane().setLayout(null);

      setTitle("KGITbank 로그인 페이지");
      setResizable(false);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      setVisible(true);

      //타이틀 생성
      TitleLabel.setBounds(159, 15, 436, 91);
      TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
      TitleLabel.setFont(new Font("HY견고딕", Font.PLAIN, 30));
      TitleLabel.setBackground(Color.WHITE);

      //아이디 생성
      getContentPane().add(TitleLabel);
      idLabel.setBounds(108, 189, 116, 30);
      idLabel.setHorizontalAlignment(SwingConstants.CENTER);
      idLabel.setFont(new Font("HY견고딕", Font.PLAIN, 22));
      idLabel.setBackground(Color.WHITE);
      getContentPane().add(idLabel);

      //아이디 텍스트 생성
      idtextField.setBounds(233, 177, 362, 52);
      idtextField.setMargin(new Insets(0, 0, 0, 0));
      idtextField.setBackground(Color.WHITE);
      idtextField.setFont(new Font("HY견고딕", Font.PLAIN, 25));
      getContentPane().add(idtextField);
      idtextField.setColumns(10);

      // 비밀번호 생성
      PwdLabel.setBounds(90, 312, 136, 30);
      PwdLabel.setHorizontalAlignment(SwingConstants.CENTER);
      PwdLabel.setFont(new Font("HY견고딕", Font.PLAIN, 22));
      PwdLabel.setBackground(Color.WHITE);
      getContentPane().add(PwdLabel);

      // 비밀번호 필드 생성
      PasswordField.setBounds(233, 300, 362, 52);
      PasswordField.setEchoChar('*');
      PasswordField.setFont(new Font("HY견고딕", Font.PLAIN, 25));
      getContentPane().add(PasswordField);

      //로그인 버튼 생성
      Loginbtn.setBounds(134, 479, 461, 71);
      Loginbtn.setBackground(Color.WHITE);
      Loginbtn.setFont(new Font("HY견고딕", Font.PLAIN, 25));
      Loginbtn.setBorder(new MatteBorder(1,1,1,1, (Color) new Color(0, 0, 0)));
      Loginbtn.setContentAreaFilled(true);
      Loginbtn.setFocusPainted(true);
      Loginbtn.setBorderPainted(true);
      getContentPane().add(Loginbtn);

      // 로그인 버튼 클릭 시  회원 비교 + 알림메세지 창으로 알림.
      // 맞다면 MainPageFram() 으로 이동 틀리면 다시 로그인창 확인 띄우기.
      Loginbtn.addActionListener(this);
      
      //버튼에 마우스 올렸을때 손가락모양으로 변경
      Loginbtn.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

      // 아이디 찾기 버튼 생성
      FindIDBtn.setFont(new Font("HY견고딕", Font.PLAIN, 22));
      FindIDBtn.setFocusPainted(true);
      FindIDBtn.setContentAreaFilled(true);
      FindIDBtn.setBorderPainted(true);
      FindIDBtn.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
      FindIDBtn.setBackground(Color.WHITE);
      FindIDBtn.setBounds(184, 403, 179, 64);
      getContentPane().add(FindIDBtn);
      // 아이디 찾기 버튼 클릭시 '아이디 찾기' 창으로 이동
      FindIDBtn.addActionListener(new ActionListener() {    
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            new FindIDUI();
         }
      });
      //버튼에 마우스 올렸을때 손가락모양으로 변경
      FindIDBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      
      // 비밀번호 찾기 버튼 생성
      FindPwdBtn.setBackground(Color.WHITE);
      FindPwdBtn.setFont(new Font("HY견고딕", Font.PLAIN, 22));
      FindPwdBtn.setBounds(363, 403, 179, 64);
      FindPwdBtn.setBorder(new MatteBorder(0,0,0,0, (Color) new Color(0, 0, 0)));
      FindPwdBtn.setContentAreaFilled(true);
      FindPwdBtn.setFocusPainted(true);
      FindPwdBtn.setBorderPainted(true);
      getContentPane().add(FindPwdBtn);
      // 비밀번호 찾기 버튼 클릭시 '비밀번호 찾기' 창으로 이동
      FindPwdBtn.addActionListener(new ActionListener() {    
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            new FindPwdUI();
         }
      });
      //버튼에 마우스 올렸을때 손가락모양으로 변경
      FindPwdBtn.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

      // 회원가입 버튼 생성
      SignUpbtn.setFont(new Font("HY견고딕", Font.PLAIN, 22));
      SignUpbtn.setBackground(Color.WHITE);
      SignUpbtn.setBounds(134, 565, 179, 64);
      SignUpbtn.setBorder(new MatteBorder(1,1,1,1, (Color) new Color(0, 0, 0)));
      SignUpbtn.setBorderPainted(true);
      SignUpbtn.setContentAreaFilled(true);
      SignUpbtn.setFocusPainted(true);
      getContentPane().add(SignUpbtn);

      // 회원가입 버튼 클릭시 회원 가입 창으로 이동 및 로그인 창 닫기.
      SignUpbtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            new SignUpUI();
         }
      });
      //버튼에 마우스 올렸을때 손가락모양으로 변경
      SignUpbtn.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

      // 취소 버튼 생성
      Cancelbtn.setFont(new Font("HY견고딕", Font.PLAIN, 22));
      Cancelbtn.setBorder(new MatteBorder(1,1,1,1, (Color) new Color(0, 0, 0)));
      Cancelbtn.setBackground(Color.WHITE);
      Cancelbtn.setBounds(416, 565, 179, 64);
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
      
   }//생성자
   
   @Override
   public void actionPerformed(ActionEvent e) { //로그인 버튼 -> 일치여부
      String user_id = idtextField.getText();
      String user_pwd = new String(PasswordField.getPassword());
      
      try {
         if(user_id.length()==0) {
            JOptionPane.showMessageDialog(null, "ID를 입력하세요", "오류", JOptionPane.ERROR_MESSAGE);
            idtextField.requestFocus();
            return;
         }else if(user_pwd.length() ==0) {
            JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요","오류",JOptionPane.ERROR_MESSAGE);
            PasswordField.requestFocus();
            return;
         }
      }catch(Exception ec){
         ec.printStackTrace();
      }

      boolean result;
      try {
         result = dao.Login(user_id, user_pwd);

         if(result) {
            JOptionPane.showMessageDialog(null, "로그인에 성공하셨습니다.");
            dispose();
            if(user_id.equals("student")) {
            	new MainPageFrame_Student();
               return;
            } else if(user_id.equals("admin")) {
               new MainPageFrame_Admin();
               return;
            }
            
         }else {
            JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다.", "오류", JOptionPane.ERROR_MESSAGE);            
            idtextField.setText(""); 
            idtextField.requestFocus(); //로그인 잘못되면 공백으로 처리 -> 아이디창으로 돌아가기 
            PasswordField.setText("");
         }
         
      }catch(Exception e1) {
         e1.printStackTrace();
      } 

   }//이벤트
   
   //메시지 박스를 띄워주는 메서드 작성
      public static void messageBox(Object obj, String message) {
         JOptionPane.showMessageDialog((Component)obj, message);
      }
} // end LoginUI{}