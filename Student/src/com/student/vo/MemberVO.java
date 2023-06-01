package com.student.vo;

public class MemberVO {

	private int user_no;//유저넘버pk
	private String user_name;  //유저이름
	private String user_id; // id
	private String user_pwd;// password
	private String user_email; // abc@naver.com
	private String user_phone; // 010-1234-1234
	private String user_status; // 수강신청승인 이용 
	
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	
	@Override
	public String toString() {
		return "user_no=" + user_no + ", user_name=" + user_name + ", user_id=" + user_id + ", user_pwd="
				+ user_pwd + ", user_email=" + user_email + ", user_phone=" + user_phone + ", user_status="
				+ user_status;
	}
	
	
	

}
