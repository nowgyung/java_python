package org.example;


import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        Arrays.fill(ar1, 7); // 배열ar1을 7로 초기화
        System.arraycopy(ar1, 0, ar2, 3, 4); // 배열ar1을 ar2로 부분 복사

    }
}
