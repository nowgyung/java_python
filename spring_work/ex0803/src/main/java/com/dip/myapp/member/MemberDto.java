package com.dip.myapp.member;

public class MemberDto {
	
	private String email;
	private String name;
	private String pwd;
	
	
	public MemberDto() {} // 기본생성자
	
	public MemberDto(String email, String name, String pwd) {
		super();
		this.email = email;
		this.name = name;
		this.pwd = pwd;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "MemberDto [email=" + email + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
}
