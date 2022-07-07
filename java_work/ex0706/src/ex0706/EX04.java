package ex0706;

class Circle{
	private int rad; // private 같은 class내에서만 수정, protected default public 어디서든지 수정가능 
	final double PI = 3.14;
	public void printArea() {
		System.out.println("넓이는 = "+PI*rad*rad);
	}
	//alt +shift*r , alt+a , alt+r
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		if(rad<0) {
			System.out.println("반지름은 음수가 없습니다.");
			return;
		}
		this.rad = rad;
	}
}
public class EX04 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRad(10);
		//c1.rad = 10;// 값 변경 허용x
	}

}
