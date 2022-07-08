package ex0708;

public class EX02 {
	
	public static int a = 10;
	EX02(){
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		EX02 ex02 = new EX02();
		ex02.a++;
		EX02 ex02_1 = new EX02();
		ex02_1.a++;
		
		System.out.println("EX02.a = "+EX02.a);
	}

}
