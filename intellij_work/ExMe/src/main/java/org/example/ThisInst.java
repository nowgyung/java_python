package org.example;

class SimpleBox{
    private int data;

    public SimpleBox(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class ThisInst {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(99);
        System.out.println(box.getData());

        box.setData(77);
        System.out.println(box.getData());
    }
}
