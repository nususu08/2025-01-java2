package ch02.sec10;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력해 주세요> ");
        String strNum = scanner.next(); // 입력받은 문자열으 정수로 파싱하여 x2한 값을 출력
        int value = Integer.parseInt(strNum) * 2;
        System.out.println("값: " + value);

    }
}
