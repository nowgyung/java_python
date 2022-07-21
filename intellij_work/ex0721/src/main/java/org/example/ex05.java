package org.example;

import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = Arrays.copyOf(a, 3); // a의 내용을 3개만 카피

        for (int item : a) {
            System.out.println(item);
        }
        System.out.println("a출력끝");
        for (int item : b) {
            System.out.println(item);
        }
        System.out.println("b출력끝");

        Arrays.stream(a).forEach(item -> System.out.println(item)); //람다자바, a내용을 하나씩 들고오면서 item에 넣고 다음을 실행하라라
    }

}