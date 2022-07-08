package ex0708;

public class EX03 {
	public static void doA() {
		System.out.println("DOA 메서드");
	}
	public void doB() {
		System.out.println("DOB 메서드");
	}
	public static void main(String[] args) {
		EX03.doA();
		EX03 ex03 = new EX03();
		ex03.doB();
		// static 메서드는 바로호출 가능
		// static 메서드가 아닌것은 메모리영역에 할당 해야지만 호출 가능
		
	}
	
}
