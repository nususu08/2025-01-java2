package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        // 배열 공간 먼저 확보
        int[] arr1 = new int[3];
        for(int i = 0; i < arr1.length; i++){
            System.out.printf("arr1[%d]: %d\n",i, arr1[i]);
        }
        //arr1[0]: 0
        //arr1[1]: 0
        //arr1[2]: 0
        System.out.println();

        // for문 이용하여
        // arr1[0] = 10;
        // arr1[1] = 20;
        // arr1[2] = 30;

        // 읽기와 쓰기는 분리하는게 좋다.
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = 10*(i+1);
            System.out.printf("arr1[%d]: %d\n",i, arr1[i]);
        }

    }
}
