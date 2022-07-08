package ex0708;

class A {
	static int a = 0;
	int b = 10;
	A(){
		a++;
		System.out.println("a = "+a);
	}
}

public class EX01 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		System.out.println(A.a);
		System.out.println(a1.b); // 스태틱변수가 아니라 접근 불가, 참조변수를 통해 접근가능
	}
}
