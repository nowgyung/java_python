package org.example;


import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        Arrays.fill(ar1, 7); // 배열ar1을 7로 초기화
        System.arraycopy(ar1, 0, ar2, 3, 4); // 배열ar1을 ar2로 부분 복사/ 자리3부터 4개의 요소를 변경0으로

        for(int i  = 0; i<ar1.length; i++)
            System.out.println(ar1[i]+"");
        System.out.println();

        for(int i=0; i <ar2.length; i ++)
            System.out.println(ar2[i]+"");

        String [] st = new String[] {"coffee", "milk", "sugar"};
        String [] st1 = {"coffee", "milk", "sugar"};

        for(int i = 0; i<st.length; i ++)
            System.out.println(st[i]);
        for(int i = 0; i<st.length; i ++)
            System.out.println(st1[i]);


    }
}
