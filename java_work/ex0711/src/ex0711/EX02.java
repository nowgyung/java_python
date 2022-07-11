package ex0711;

public class EX02 {
	EX02(){
		AA aa = new AA(); // static이 아닌경우  힙영역 올리기위해 객체
		aa.doA();
		aa.doA(10);
		aa.doA(10,20);

	}

	public static void main(String[] args) {
		new EX02();
		
	}
}
