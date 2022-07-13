package ex0713;

class A{
	int  a = 10;
	public void doA() {
		System.out.println("doA");
	}
}
class B extends A{
	public void doB() {
		super.doA(); //super생략가능
		System.out.println("doB a = "+ super.a);//super 생략가능 대신 this도 가능
	}
}


public class Ex02 {
	public static void main(String[] args) {
		B b = new B();
		b.doB();
	}
}
