package ch06.sec08.exam02;

public class Computer {
    int sum;
    public int sum(int ... values) {
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
