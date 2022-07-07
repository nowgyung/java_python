package ex0707;

import ZOO.Duck;

public class EX02 {
	EX02(){
		ZOO.Dog dog = new ZOO.Dog();
		ZOO.Cat cat = new ZOO.Cat();
		Duck duck = new Duck();
		sound(dog, cat, duck);
	}
	public void sound(ZOO.Dog dog, ZOO.Cat cat, Duck duck) {
		dog.sound(); // 가려져 있지만 순서대로 진행된다 캡슐화 한다
		cat.sound();
		duck.sound();
		
	}
	public static void main(String[] args) {
		new EX02();//생성자,  static 영역에 올림(메모리상주) heap 영역으로 이동
	}
}
