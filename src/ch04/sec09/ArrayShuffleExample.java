package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 10칸 짜리 정수 배열을 만들고 싶다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------");

        /*
        0 ~ 9 랜덤값 구한다. 예를 들어 7이 나온다. 0번방과 7번방 스와핑한다.
        0 ~ 9 랜덤값 구한다. 예를 들어 8이 나온다. 1번방과 8번방 스와핑한다.
        0 ~ 9 랜덤값 구한다. 예를 들어 5이 나온다. 2번방과 5번방 스와핑한다.
         */
        int num2 = 0;
        for(int i = 0; i < arr.length; i++) {
            int num = (int)(Math.random() * 10.0);
            num2 = arr[num];
            arr[num] = arr[i];
            arr[i] = num2;
        }
        System.out.println(Arrays.toString(arr));

    }
}
