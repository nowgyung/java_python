package ex0704;

public class MAB {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		Account a1 = new Account(); //메모리 상으로 올리는 단계
		Account a2 = new Account();
		Account a3 = new Account();
		
		a1.deposit(10000);
		a2.deposit(5000);
		a3.deposit(1000);
		
		a1.with(1000);
		a2.with(1000);
		a3.with(1000);
		
		a1.check();
		a2.check();
		a3.check();
	
	}

}
