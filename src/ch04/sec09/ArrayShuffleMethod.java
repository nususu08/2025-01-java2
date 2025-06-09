package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromTo(5, 8); // [ 5, 6, 7 ]
        int[] arr2 = makeArrayFromTo(15, 20); // [ 15, 16, 17, 18, 19 ]

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        shuffleArray(arr);
        shuffleArray(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
    public static int[] makeArrayFromTo(int i1, int i2) {
        int[] arr = new int[i2-i1];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i+i1;
        }
        return arr;
    }
    static void shuffleArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int temp2 = (int)(Math.random() * arr.length);
            int temp = arr[temp2];
            arr[temp2] = arr[i];
            arr[i] = temp;
        }
    }
}
