package ch03;

public class Confirmation04 {
    public static void main(String[] args) {
        int value = 356;
        // 1. 3.56
        // 2. 3.56 > 3
        // 3. 3 * 100
        System.out.println((int)(value * 0.01) * 100); // 300

        // 1. 3
        // 2. 3 * 100
        System.out.println(value / 100 * 100 ); // 300

        // 1. 56 구한다.
        // 2. 356 - 56 뺀다
        System.out.println(value - value % 100); // 300

    }
}
