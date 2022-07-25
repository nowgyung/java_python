package org.example;

class Box{
    String text;

    public Box(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box[] ar = new Box[5];
        System.out.println("length: "+ ar.length); //길이가 5인 Box형 1차원 배열

    }
}
