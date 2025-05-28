package ch04.sec04;

public class Mission02 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        // for 문을 활용하여 위 처럼 출력되게 해주시오.

        for(int i = 1; i < 11; i++) {
            if(i == 1) {
                System.out.print(i);
            } else {
                System.out.printf(", " + i);
            }
        }
    }
}
