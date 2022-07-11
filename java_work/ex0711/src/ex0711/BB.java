package ex0711;

public class BB {
	
	int a  = 10;
	BB(){
		this(20); // 같은 클래스 내에서 생성자를 호출할때 this사용
		System.out.println("기본생성자");
		
	}
	BB(int a){
		System.out.println("a생성자");
		this.a = a;
	}
	@Override // alt + shift + s + s
	public String toString() {
		return "BB [a=" + a + "]"; // this.a this 생략가능
	}
}
