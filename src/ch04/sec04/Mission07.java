package ch04.sec04;

public class Mission07 {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 70, 60 };
        int sum = 0;
        // 어떤 학생이 받은 점수이다.
        // 평균 점수를 구하라.
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = (double)sum / scores.length;
        System.out.println("평균 : " + avg);

    }
}
