package ex0707;

public class EX01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		//p1.name = "자바" priavate인해 직접작성 안됨
		p1.setName("자바");
		System.out.println(p1); 
		System.out.println(p1.toString()); //같은 의미(생략가능)
		
		Person p2 = new Person("한글");
		System.out.println(p2);
 	}

}
