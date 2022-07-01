package ex0701;
//매개변수 2개일때
public class ex06 {

	public static void doA(int age, String name) {
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
	
	public static void main(String[] args) {
		doA(13, "aaa");
		doA(20, "bbb");
	}
}
