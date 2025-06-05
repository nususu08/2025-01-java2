package ch02.sec08;

public class CastingMethodExample {
    public static void main(String[] args) {
        double r1 = division(10, 3);
        System.out.print(r1);
    }


    public static double division(double d1, double d2) {
        return d1/d2;
    }
    public static double division(int i1, int i2) {
        return (double)i1/i2;
    }
}
