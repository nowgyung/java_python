package org.example;

import java.util.ArrayList;

public class Main {
    int a = 10;

    public static void showData(Object obj){
        System.out.println(obj);
        System.out.println(obj.toString()); // obj 와  obj.toString() 같은 표현
    }
    public static void main(String[] args) {
        Integer iInst1 = Integer.valueOf(3);
        Integer iInst2 = 5;

        showData(iInst1);
        showData(iInst2);
        showData(new Integer(100));

        ArrayList<Number> al = new ArrayList<>();
        al.add(10);
        al.add(20.0);
//        al.add("오래된 개발자");
    }
}