package org.example;


class Person{
    private int reginum;
    private int passnum;

    Person(int rnum, int pnum){ // 여권이 있는사람을 위한
        reginum = rnum;
        passnum = pnum;
    }
    Person(int rnum){//여권이 없는 사람을 위한
        reginum = rnum;
        passnum = 0;


    // 둘은 오버로딩 관계
    }
    void showPersonalInfo(){
        System.out.println("주민등록번호: "+ reginum);

        if (passnum != 0)
        System.out.println("여권번호: "+ passnum);
        else
            System.out.println("여권을 가지고 있지 않습니다.");

    }
}

public class ConOverloading {
    public static void main(String[] args) {
        Person jung  = new Person(335577,112233);

        Person hong  = new Person(775544);

        jung.showPersonalInfo();
        hong.showPersonalInfo();
    }
}
