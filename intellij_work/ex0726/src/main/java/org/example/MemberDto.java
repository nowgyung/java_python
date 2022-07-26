package org.example;
//데이터 테이블을 나타내는 ?
public class MemberDto {

    private int index;
    private String name;
    private String email;
    private String pwd;

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
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
}
