package practice.ch02.delegation;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter02("Hello World");
        print.printWeak();
        print.printStrong();

        // print.getYourName();  // 오류, Print 클래스에는 getYourName() 메서드가 선언되어 있지 않음
        // print는 Print 클래스 타입이므로, Print 클래스에 선언된 메서드만 호출할 수 있음
        // print.getYourName()를 호출하려면, print를 PrintBannerAdapter02 타입으로 캐스팅해야 함

        ((PrintBannerAdapter02) print).getYourName();  // 형변환(타입 캐스팅). 캐스팅 후 getYourName() 메서드 호출
    }
}
