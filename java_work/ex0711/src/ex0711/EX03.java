package ex0711;

public class EX03 {
	
	public EX03() {
		System.out.println("기본생성자");
	} // 생성자 오버로딩 
		
	
	public EX03(int a) {
		System.out.println("파라메타 1개 a = "+a);
	}
	public EX03(int a, int b) {
		System.out.println("파라메타 2개 a = "+a);
		System.out.println("파라메타 2개 b = "+b);
	}
	
	public static void main(String[] args) {
		new EX03();
		new EX03(10);
		new EX03(10,20);
	}
}
