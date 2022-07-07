package ex0704;
/*
 * 145p
 * 값을 반환하는 메소드의 정의
 * 인자로 원의 반지름정보를 전달하면, 원의 넓이를 걔산해서 메소드와 원의 둘레를 계산해서 반환하는 메소드를 정의하고
 * 이들을 호출하는 main 메소드 정의
 */
public class EX02 {
	
	public static double carea(double r) {
		return r*r*3.14;
		
	}
	public static double cround(double r) {
		return 2*3.14*r;
		
	}
	
	public static void main(String[] args) {
		System.out.println("carea(3)= "+carea(3));
		System.out.println("cround(3)= "+cround(3));
		
		
		
	}

}
