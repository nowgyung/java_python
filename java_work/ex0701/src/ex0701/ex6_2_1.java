package ex0701;

public class ex6_2_1 {
	public static void main(String[] args) {
		circle(5.0);
		circle1(5.0);
	}
	
	
	public static void circle(double a) {
		double pi = 3.141592;
		System.out.println("원의 넓이: "+ (a*a*pi) );
	}
	
	public static void circle1(double b) {
		double pi = 3.141592;
		System.out.println("원의 둘레: "+ (2*b*pi));
	}
}
