package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number; // 현재 수
    private int end;    // 종료값

    public EvenNumberGenerator(int start, int end) {
        this.number = start;
        this.end = end;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += 2; 
        }
    }
}