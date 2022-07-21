package org.example;


class Person implements Cloneable{
    String name; // 클래스타입은 직접 인스턴스 생성해서 복사해줘야 한다. String 형은 깊은복사 바로 가능
    int age; //기본자료형 기본적으로깊은 복사 가능

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Ex03 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("홍길동",50);
        Person p2 = (Person) p1.clone();
        System.out.println(p1);
        System.out.println(p2);

        p1.name="김길동";
        p1.age = 100;
        System.out.println(p1);
        System.out.println(p2);
    }
}
