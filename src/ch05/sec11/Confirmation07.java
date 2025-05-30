package ch05.sec11;

public class Confirmation07 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2, 50, 2, 4, 52, 1, 6,-2 };
        int temp = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > temp){
                temp = array[i];
            }
        }
        System.out.println(temp);
    }
}
