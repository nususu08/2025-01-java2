package ch04.sec04;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = { 10, 70, 90, 110 };
        int num = 0;

        // 배열의 모든 값을 더한 결과값을 출력하시오.
        for(int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        System.out.println("값 : " + num);
    }
}
