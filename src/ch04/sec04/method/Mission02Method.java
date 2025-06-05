package ch04.sec04.method;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTo(2, 6); // [2, 3, 4, 5, 6]
        printNumberFromTo(12, 16); // [12, 13, 14, 15, 16]

    }
    public static void printNumberFromTo(int from, int to) {
        System.out.print("[");
        for(int i = from; i <= to; i++) {
            System.out.print(i == from ? i : ", " + i);
        }
        System.out.println("]");

    }
}
