package ex0701;

public class EX09 {
	
	public static void doA() {
		int  num1 = 10;
	}

	public static void main(String[] args) {
		boolean a = true;
		int num1 = 20; // 변수명이 같아도 다른 변수다
		
		if(a)
		{
			System.out.println("a = "+a);
			boolean b = false;
			System.out.println("b = "+ b); // 지역변수 b는 if구문 속, 영역속에서는 사용가능
		}
		//System.out.println("b = "+ b); // 지역변수 b는 if구문 속, 영역속에서는 사용가능
	}
}
