package ex0715;

interface A {
	public void doA(); // doA는 내용이 없어야한다 // 재정의 해서 사용해야 한다. 오버라이딩 해서 사용해야 한다.
}

interface B {
	public void doB();
}

public class Ex02 implements A {

	public void doA() {

	}

	public void doB() {

	}

}
