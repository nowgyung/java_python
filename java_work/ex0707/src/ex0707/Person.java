package ex0707;

public class Person {
	private String name;
	
	// alr + shift + s + r -> setter getter
	// alt + shift + s+ o -> constructor

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Person name = "+ name;
	}
	public Person() {}
	public Person(String name) {
		super();//생략가능
		this.name = name; // 원래는 생략가능, 동일한 변수명이 있을때는 생략 불가
	}
}
