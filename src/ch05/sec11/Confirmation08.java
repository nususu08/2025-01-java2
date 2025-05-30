package ch05.sec11;

public class Confirmation08 {
    public static void main(String[] args) {
        int[][] arr = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 },
        };
        int temp = 0;
        int temp0 = 0;
        for(int i = 0; i < arr.length; i++) {
            temp0 += arr[i].length;
            for(int k = 0; k < arr[i].length; k++){
                temp += arr[i][k];
            }
        }
        System.out.println(temp);
        System.out.println((double)temp / temp0);
    }
}
