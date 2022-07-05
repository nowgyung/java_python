package ex0705;

public class ex02 {

	public static void main(String[] args) {
		A a1 = new A();
		
		A a2 = a1; /* 같은 A라는 객체 a1,a2라는 이름으로 참조 할 수 */
		a1.a +=10;
		System.out.println("a2.a = "+a2.a);
		
		int a = 10; /* 따로 존재, b에도 10이 추가 되는 것뿐*/
		int b = a;
		
		a=20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
}
