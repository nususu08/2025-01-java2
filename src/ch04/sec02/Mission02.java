package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
    /*
    (점수를 입력받는다.)
    점수를 입력해주세요> 99 (점수를 입력 후 엔터)

    (100 초과 혹은 0 미만이면) "잘못된 점수입니다."
    (90점이상) "A"
    (80점이상) "B"
    (70점이상) "C"
    (나머지) "C"
    출력되도록 해주세요.


     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요> ");
        int num = scanner.nextInt();
        if(num > 100 || num < 0) {
            System.out.println("잘못된 점수입니다.");
        } else {
        switch (num / 10) {
            case 9,10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
            }
        }
    }
}
