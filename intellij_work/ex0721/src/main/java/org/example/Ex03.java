package org.example;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Random random = new Random(); //씨드값을 주지 않으면 자동으로 입력되도록
        System.out.println("밀리세컨드 랜덤 시작");
        for (int i =0; i<10; i ++){
            System.out.println(random.nextInt(100));
        }
        System.out.println("밀리세컨드 랜덤 끝");

        Random randomseed = new Random(42); // 패턴이 있는 랜덤
        System.out.println("씨드 랜덤 시작");

        for (int i =0; i<10; i ++){
            System.out.println(randomseed.nextInt(100));
        }
        System.out.println("씨드 랜덤 끝");
    }
}
