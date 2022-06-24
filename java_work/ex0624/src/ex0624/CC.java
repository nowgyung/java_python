package ex0624;

public class CC {
	public static void main(String[] args) {
		
		short a = 32767;
		short b = 20;
		
		System.out.println("a + b =" + ( a+ b));
		
	
		short c = (short)(a + b); // 형 변환
		System.out.println("c =" + c);
		
	}

}
