package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return this.arr.length;
    }

    public void add(String str) {
        String[] temp = new String[size() + 1];
        temp[size()] = str;
        for(int i = 0; i < size(); i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void add(int num, String str) {
        String[] temp = new String[size() + 1];
        for (int i = 0; i < num; i++) {
            temp[i] = arr[i];
        }
        temp[num] = str;
        for(int i = num; i < size(); i++) {
            temp[i+1] = arr[i];
        }
        arr = temp;
    }

    public String remove() {
        String[] temp = new String[size() - 1];
        String temp2 = arr[size() - 1];
        for(int i = 0; i < size() - 1; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return temp2;
    }

    public String remove(int idx) {
        String[] temp = new String[size() - 1];
        String temp2 = arr[idx];
        for (int i = 0; i < idx; i++) {
            temp[i] = arr[i];
        }
        temp[idx] = temp2;
        for (int i = idx; i < size()-1; i++) {
            temp[i] = arr[i+1];
        }
        arr = temp;
        return temp2;
    }

    public String get(int num) {
        return this.arr[num];
    }


    // 점검용
    public void checkValues() {
        System.out.println(Arrays.toString(this.arr));
    }
}
