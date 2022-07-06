package ex0706;

/*
 * 생성자를 포함하는 클래스의 정의
 * 밑변과 높이 정보를 지정할 수 있는 Triangle클래스를 정의
 * 밑변과 높이 정보를 변경할 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 정의
 */
class Triangle {
	int width;
	int height;
	
	public Triangle() {}
	public Triangle(int width, int height) {
		super(); //부모 클래스에 해당되는 상속개념
		this.width = width;
		this.height = height;
	}

	// alt + shift + s + o > 생성자
	// alt + shift + s + r > getter setter 만들기

	public void printArea() {
		double area = this.width * this.height * 0.5d; // this는 생략가능
		System.out.println("넓이는 =" + area);
	}
	public void setwidth(int w) {
		width = w;
	}
	public void setHeight(int height) {
		this.height = height;// 파이썬에서는 self
	}
}

public class ex01 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.printArea(); // 값이 없을때는 0으로 초기화
		t1.setHeight(50);
		t1.setwidth(50);
		t1.printArea();
		
		Triangle t2 = new Triangle(30,50);
		t2.printArea();

	}

}
