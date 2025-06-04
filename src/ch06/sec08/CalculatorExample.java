package ch06.sec08;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.plus(1,2);
        System.out.println("result : " + result);
        System.out.println("result2 : " + calculator.plus(10,20));
        System.out.println("result3 : " + 30);

        calculator.powerOn();

        System.out.println("끝");
    }
}
