package org.example;

class Point1 {
    private int xPos;
    private int yPos;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public Point1(int x, int y){
        xPos = x;
        yPos = y;
    }
}
class Rectangle {
    private Point1 upperLeft;
    private Point1 lowerRight;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public Rectangle(int x1, int y1, int x2, int y2){
        upperLeft = new Point1(x1, y1);
        lowerRight = new Point1(x2, y2);
    }
}
public class Ex19_1 {
    public static void main(String[] args) {
        Point1 p1 = new Point1(1 ,3);
        Point1 p2 = new Point1(2,4);
        Rectangle rec1 =  new Rectangle(2,4, 3, 4);
        Rectangle rec2 = new Rectangle(2,3,4,5);

        System.out.println(p1 == p2);
        System.out.println(rec1 == rec2);
        System.out.println(p1.equals(p2));
        System.out.println(rec1.equals(rec2));

    }

}
