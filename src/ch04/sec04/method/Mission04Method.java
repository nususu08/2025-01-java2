package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        gugudan(4);
        /*
        4 x 1 = 4
        4 x 2 = 8
        ...
        4 x 9 = 36
         */
        System.out.println("====================");

        gugudan(4, 9); // 4 ~ 9단까지 구구단 출력
        gugudan(2, 4); // 2 ~ 4단까지 구구단 출력
    }

    static void gugudan(int num) {
        for (int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }
    static void gugudan(int num1, int num2) {
            for (int i=num1; i<=num2; i++) {
                gugudan(i);
                System.out.println();
            }
    }
}
