package org.example;

public class StringArray {
    public static void main(String[] args) {
        String[] ar = new String[7];

        ar[0] = new String("java");
        ar[1] = new String("system");
        ar[2] = new String("compiler");
        ar[3] = new String("park");
        ar[4] = new String("tree");
        ar[5] = new String("dinner");
        ar[6] = new String("brunch cafe");

        int cnum = 0;


        for(int i=0; i<ar.length; i++)
            cnum  += ar[i].length();

        System.out.println("총 문자수: "+ cnum);
        System.out.println(ar.length);
    }
}
