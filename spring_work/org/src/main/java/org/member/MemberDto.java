package org.member;

public class MemberDto {
	
	//생성자, to string, 세터게터  alt + shift + s / o, s, r
	
	//기본생성자 직접
	public MemberDto() {}

	private String name;
	private String email;
	private String pwd;
	
	
	
	public MemberDto(String name, String email, String pwd) { // a+s+o
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}

	public String getName() { // a+s+r
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() { // a+s+s
		return "MemberDto [name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}


	
	
}
