package ex0707;

class Point {
	int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPointInfo() {

	}
}

public class EX9_1 {
	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showCircleInfo();
	}

}
