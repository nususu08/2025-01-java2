package ch05.sec08;

public class ArrayRefObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[2] == strArray[1]);
        System.out.println(strArray[2].equals(strArray[1]));
    }
}
