package org.example;

class InstCnt{
    static int instNum = 100;

    InstCnt(){
        instNum++;
        System.out.println("인스턴스 생성: "+instNum);
    }
}

public class Main {
    public static void main(String[] args) {
        InstCnt.instNum -= 15;
        System.out.println(InstCnt.instNum);

        }
    }