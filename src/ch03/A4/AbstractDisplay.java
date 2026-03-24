package ch03.A4;

// 추상 클래스를 interface로 변경함
public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    // default 메소드는 인터페이스에서 구현을 제공하는 메소드
    public default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
