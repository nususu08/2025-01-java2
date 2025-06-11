package ch06.sec11;

import java.io.PrintStream;

public class FinalStudy {
    public static void main(String[] args) {
        final int NUM = 0;
        // NUM = 20;
        final int NUM_2;
        NUM_2 = 10;
        // NUM_2 = 20;

        PrintStream ps = System.out;

        System.out.println();

        FinalObject fo1 = new FinalObject(10);
        FinalObject fo2 = new FinalObject(20);

        fo1.myAge(); // immutable
        fo2.myAge();



    }
}
