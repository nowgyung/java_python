package ex0705;

public class A {
	
	// alt + shift +s -> o생성자 자동 만들기 
	
	public int a = 10;
	public void doA() {//void 반환값x
		System.out.println("doA a = "+a);
	
	}
	public int doB() {
		System.out.println("doB a = "+a);
		return 10;
		
	}
	public double doC(double c) {
		System.out.println("doC");
		return c*c;
	}
}
