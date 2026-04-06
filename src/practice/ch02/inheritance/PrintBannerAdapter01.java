package practice.ch02.inheritance;

// 어댑터
// Banner 클래스를 상속하면서 Print 인터페이스 구현
public class PrintBannerAdapter01 extends Banner implements Print {
    // 부모 Banner에게 메소드 물려받음 -> this로 생략

    // 기억하기
    // (1) 인자가 없는 생성자는 자동으로 만들어짐
    // (2) 생성자는 상속되지 않음

    // 생성자
    public PrintBannerAdapter01(String string) {
        super(string); // super: 부모 생성자를 호출(부모=Banner)
        // Main에서 Hello World를 넘겨받아서 여기에 저장됨
    }

    @Override
    public void printWeak() {
        showWithParen(); // 객체.메소드() 형태로 호출인데 앞에 객체가 없으면 "this."이 생략된 것
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
    
}
