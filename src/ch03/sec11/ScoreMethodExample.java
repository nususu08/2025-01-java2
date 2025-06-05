package ch03.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10, 100); // 10~100
        int randomScore2 = getRandomValue(1, 5); // 1~5
        System.out.println(randomScore);

        char grade = getGrade(randomScore);
        System.out.println(grade);
        // 100점 초과시 혹은 0점 미만시 '' 리턴
        // 90점 이상 'A' 리턴
        // 80점 이상 'B' 리턴
        // 나머지 'D' 리턴
    }
    public static int getRandomValue(int from, int to){
        return (int)(Math.random() * (to-from +1)) + from;
    }

    public static char getGrade(int i) {
        if(i == 0 || i > 100) {
            return  ' ';
        }
        return switch (i / 10) {
            case 9, 10 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'D';
        };
    }
}
