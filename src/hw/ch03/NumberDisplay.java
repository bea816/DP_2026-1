package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int number; // 표시해야 하는 숫자

    // 반복 횟수를 받는 생성자
    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount); // 부모의 AbstractDisplay에 반복 횟수 전달
        this.number = number;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>");;
    }

    @Override
    public void print() {
        System.out.println(number);
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }
    
}
