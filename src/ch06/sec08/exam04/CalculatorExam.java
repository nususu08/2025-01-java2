package ch06.sec08.exam04;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        // 한변의 길이가 40인 정사각형의 넓이를 구하고 싶소.
        double extent = cal.areaRectangle(40.0);
        System.out.println("extent: " + extent);

        // 가로 40, 세로 50인 직사각형의 넓이를 구하고 싶소.
        double extent2 = cal.areaRectangle(40, 50);
        System.out.println("extent: " + extent2);

    }
}
