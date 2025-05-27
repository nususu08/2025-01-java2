package ch03;

public class Confirmation03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        // 학생 한명이 가지는 연필 수
        int pencilsPerStudents = (pencils / students);
        System.out.println(pencilsPerStudents); // 17

        // 남은 연필 수
        int pencilsLeft = (pencils % students);
        System.out.println(pencilsLeft); // 24

    }
}
