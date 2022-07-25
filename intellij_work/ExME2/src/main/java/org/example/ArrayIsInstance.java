package org.example;

public class ArrayIsInstance {
    public static void main(String[] args) {
        int[] ar1 = new int[5]; // 길이가 5이며 int형의 1차원 배열 인스턴스 생성

        double[] ar2 = new double[7]; // 길이가 7이며, double형의 1차원 배열

        //길이가 9이며, float형의  배열 참조변수와 인스턴스 생성 분리
        float [] ar3;
        ar3 = new float[9];

        System.out.println("배열 ar1의 길이: "+ ar1.length);
        System.out.println("배열 ar2의 길이: "+ ar2.length);
        System.out.println("배열 ar3의 길이: "+ ar3.length);
    }
}
