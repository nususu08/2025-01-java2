package ch05.sec11;

public class Mission01 {
    public static void main(String[] args) {
        int temp = 0;
        for(int i = 0; i < args.length; i++) {
            temp += Integer.parseInt(args[i]);
        }
        System.out.println(temp);


    }
}
