package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;
import ch06.sec08.Calculator;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star: " + star);

        // 콘솔에 출력
        // 5였다면 ***** (개행)
        // 3였다면 *** (개행)
        printSingleLine(star);
        System.out.println("===============");

        printMultiLine(4);

        System.out.println("===============");

        printTriangleLine(4);

    }
    public static void printSingleLine(int in) {
        for(int i = 0; i < in; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printMultiLine(int cnt) {
        for (int i=0; i<cnt; i++) {
            printSingleLine(cnt);
        }
    }
    public static void printTriangleLine(int cnt) {
        for(int i=0; i<=cnt; i++) {
            printSingleLine(i);
        }
    }
}
