package ex0711;

public class EX04 {
	EX04(){
		BB b1 = new BB();
		
		System.out.println(b1.toString());// toString()생략가능
		
		System.out.println("abc".equals(new String("abc")) );
		System.out.println("abc"== new String("abc") );// 다른 결과
		
		String a = 12+""; //숫자를 문자형으로 변환
		String b = String.valueOf(12);
//		String c = 12;
		
	}
	public static void main(String[] args) {
		new EX04();
	}

}
