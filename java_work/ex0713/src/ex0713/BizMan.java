package ex0713;
class Man {
	private String name;
	
//	public Man() {}
//생성자 만들기
	public Man(String name) {
		this.name = name;
	}
//상속자만들기
	@Override
	public String toString() {
		return "Man [name=" + name + "]";
	}
}
//1. 부모클래스에 기본생성자 선언
//2. 자식클래스에 부모생성자랑 동일한 생성자 선언
public class BizMan extends Man {
	
	public BizMan(String name) {
		super(name);
	}

	public static void main(String[] args) {
		BizMan biz = new BizMan("홍길동");
		System.out.println(biz);
	}
}
