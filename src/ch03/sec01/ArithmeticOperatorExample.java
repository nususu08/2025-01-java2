package ch03.sec01;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int v1 = 10, v2 = 4, v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1); // result: 14

        System.out.println("result2: " + ( v1 + v2 - v4) ); // result2: 4

        System.out.println("result3: " + ( (double)v1 / v2) ); // result3: 2.5

    }
}
