package ex0705;

public class BankAccount {

	String jumin;
	String acc;
	int bal;
	public BankAccount() {}
// class 만들면 기본생산자는 생략되어져있, 다른 생성자를 서언하게 되면 기본 생성자 생략 불가.	
	public BankAccount(String j, String a, int b) {
		jumin = j;
		acc = a;
		bal = b;
	}
	public void deposit(int b) {
		bal = bal + b;
		
	}
	public void printbal() {
		System.out.println("주민번호 = "+jumin);
		System.out.println("계좌번호 = "+acc);
		System.out.println("bal = "+bal);
	}
}
