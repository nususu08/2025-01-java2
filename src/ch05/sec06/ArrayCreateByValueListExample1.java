package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };

        System.out.println("season[0]: " + season[0]);
        System.out.println("season[1]: " + season[1]);

        season[0] = "봄";
        System.out.println("season[0]: " + season[0]);

        int [] scores = { 83, 90, 87 };

        int sum = 0;

        for(int score : scores) {
            sum += score;
        }
        System.out.println("sum : " + sum);
        double avg = (double)sum/scores.length;
        System.out.println("avg : " + avg);
    }
}
