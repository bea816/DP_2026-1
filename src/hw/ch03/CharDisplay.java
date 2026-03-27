package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시해야 하는 문자 

    // 기본 생성자 호출
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    // 반복 횟수를 받는 생성자
    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount); // 부모의 AbstractDisplay 생성자 호출
        this.ch = ch;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 기억해 둔 문자를 1회 표시한다 
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println(">>");
    }
}
