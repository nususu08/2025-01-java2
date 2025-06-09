package ch04.sec04.method;

public class Mission05Method {
    public static void main(String[] args) {
        int[] arr = { 10, 70, 90, 110, 4 };
        int sum = addAllUpArray(arr); // 배열의 모든 값을 더한 값을 리턴
        System.out.println("sum : " + sum);
    }
    static int addAllUpArray(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
