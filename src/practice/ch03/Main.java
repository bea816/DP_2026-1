package practice.ch03;

public class Main {
    public static void main(String[] args) {
        // CharDisplay의 인스턴스를 생성한다 
        // ''는 캐릭터 타입, ""는 문자열 타입
        CharDisplay d1 = new CharDisplay('H');
        // 부모 타입으로 선언해도 OK -> 프로그램이 좀 더 유연해짐
        AbstractDisplay d3 = new CharDisplay('e');
        // 생성한 인스턴스에 대해 display()를 호출한다 
        d1.display();
        d3.display();

        StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d4 = new StringDisplay("Hello");
        d2.display();
        d4.display();

        // 부모 타입으로 선언하면 자식을 모두 가리킬 수 있음
        // d5는 d3와 d4를 모두 가리킬 수 있음
        AbstractDisplay d5;

        // 추상 클래스는 인스턴스를 생성할 수 없음
        // AbstractDisplay d6 = new AbstractDisplay(); // 컴파일 오류
    }
}
