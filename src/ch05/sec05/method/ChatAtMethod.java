package ch05.sec05.method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); // "남자" 리턴
        String gender2 = checkGender("900212-2998756"); // "여자" 리턴

        System.out.println(gender);
        System.out.println(gender2);
    }
    public static String checkGender(String num) {
        char gender = num.charAt(7);
        return switch (gender) {
            case '1', '3' -> "남자";
            case '2', '4' -> "여자";
            default -> null;
        };
    }
}
