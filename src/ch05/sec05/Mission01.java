package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /*
        주민번호를 입력하시오. (xxxxxx-xxxxxxx)>
        (만약) 주민등록번호길이가 다르면 "잘못 입력하셨습니다."
        (길이가 맞다면) 8번째 자리의 값으로 "여성, "남성" 출력해주세요.
         */
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.print("주민번호를 입력하시오. (xxxxxx-xxxxxxx) > ");
            String num = scanner.nextLine();
            if (num.length() == 14 && num.charAt(6) == '-') {
                char num2 = num.charAt(7);
                switch (num2) {
                    case '1', '3':
                        System.out.println("남성");
                        run = false;
                        break;
                    case '2', '4':
                        System.out.println("여성");
                        run = false;
                        break;
                    default:
                        System.out.println("성별이 잘못되었습니다.");
                }
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
