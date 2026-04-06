package practice.ch02.inheritance;


// 클라이언트
public class Main{
    public static void main(String[] args) {
        // 어댑터 없이 Banner 클래스 이용
        Banner banner = new Banner("Hello");
        banner.showWithParen();
        banner.showWithAster();

        // 어댑터 이용
        System.out.println("=== 어댑터 이용 ===");
        Print print = new PrintBannerAdapter01("Hello World");
        print.printWeak();
        print.printStrong();
    }
}