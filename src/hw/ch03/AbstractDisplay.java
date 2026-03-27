package hw.ch03;

public abstract class AbstractDisplay {
    private int repeatCount; // 반복 횟수를 저장하는 필드 추가

    // 기존 코드 호환성을 위한 기본 생성자(명시하지 않을 시 5번 반복)
    public AbstractDisplay() {
        this.repeatCount = 5;
    }

    // 반복 횟수를 인자로 받는 생성자 추가
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    // 큰 틀을 제공하는 메소드 -> 템플릿 메소드
    public final void display() {
        open(); 
        for (int i = 0; i < repeatCount; i++) { 
            print();
        } 
        close(); 
    }
}
