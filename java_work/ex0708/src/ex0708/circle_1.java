package ex0708;

class Point{
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("[" + xPos + " , " + yPos + "]");
	}
}
public class circle_1 {
	
	
	public static void main(String[] args) {
		Circle c= new Circle(2,2,4);
		c.showCircleInfo();
	}
}
