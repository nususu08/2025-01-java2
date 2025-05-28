package ch04.sec04;

import java.util.Scanner;

public class Mission06 {
    public static void main(String[] args) {
        /*
        1부터 몇까지 더하면 누적합계가 100을 넘지 않는
        제일 큰 수가 무엇인지 알아내는 예제
         */
        int num = 0;
        int result = 0;
        int wat = 100;
        for(int i = 1; i < wat; i++) {
            num += i;
            result = i;
            if(num > wat) {
                break;
            }
        }
        System.out.println(result-1);
    }
}
