package org.example;
//데이터 테이블을 나타내는 ? map - key값(email..)을 가지고 있는
public class MemberDto {

    public String oldpwd;
    private int index;
    private String name;
    private String email;
    private String pwd;

    private String newpwd;



    public String getNewpwd() {
        return newpwd;
    }

    public void setNewpwd(String newpwd) {
        this.newpwd = newpwd;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", newpwd='" + newpwd + '\'' +
                '}';
    }

    public MemberDto(String newpwd) {
        this.newpwd = newpwd;
    }

    public String getName() {
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

    public MemberDto(String name, String email, String pwd) {
        this.name = name;
        this.email = email;
        this.pwd = pwd; // 기본생성자가 사라지게되는 문제점, 안에입력하면 줄 사라짐
    }

    public String newpwd() {return newpwd;}
}
