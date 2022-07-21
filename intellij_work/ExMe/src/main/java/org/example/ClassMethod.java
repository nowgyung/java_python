package org.example;


class NumberPrinter{
    private int myNum = 0;

    static void showInt(int n){
        System.out.println(n);
    }
    static void showDouble(double n){
        System.out.println(n);
    }
    void setMyNumber(int n){
        myNum = n;
    }
    void showMyNumber(){
        showInt(myNum);
    }
}

public class ClassMethod {
    public static void main(String[] args) {

        NumberPrinter np = new NumberPrinter();
        NumberPrinter.showInt(20);

        np.showDouble(3.15);
        np.setMyNumber(75);
        np.showMyNumber();
    }
}
