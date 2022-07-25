package org.example;

class Box1{
    String ar;

    @Override
    public String toString() {
        return ar;
    }

    public Box1(String ar) {
        this.ar = ar;
    }
}

public class BoxArray {
    public static void main(String[] args) {
        Box[] ar = new Box[3];

        ar[0] = new Box("first");
        ar[1] = new Box("second");
        ar[2] = new Box("third");

        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
    }
}
