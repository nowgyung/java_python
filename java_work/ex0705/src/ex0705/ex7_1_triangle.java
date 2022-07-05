package ex0705;

public class ex7_1_triangle {
	int height; //높이
	int extra; //변
	
	
	public ex7_1_triangle(int h, int e) {
		height = h;
		extra = e;	
	}

	
	public void printT() {
		System.out.println(height);
		System.out.println(extra);
		System.out.println("삼각형의 넓이: " + 0.5*height*extra);
		System.out.println("삼각형의 넓이: " + (1/2.0)*height*extra);
		
	}
}
