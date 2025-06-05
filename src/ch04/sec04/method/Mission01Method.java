package ch04.sec04.method;

public class Mission01Method {
    public static void main(String[] args) {
        int sum = sumFromTO(10, 20); // 10~20까지 모두 더한 값 리턴 165
        int sum2 = sumFromTO(15, 49); // 15~49까지 모두 더한 값 리턴 1120
        System.out.println(sum);
        System.out.println(sum2);
    }
    public static int sumFromTO(int i1, int i2) {
        int sum = 0;
        for(int i = i1; i <= i2; i++) {
            sum += i;
        }
        return sum;
    }
}
