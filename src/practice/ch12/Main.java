package practice.ch12;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world."); // 중심 객체
        d1.show();
    
        Display d2 = new SideBorder(d1, '*'); // d1을 *로 장식
        d2.show();

        Display d3 = new FullBorder(d1); // d2를 fullborder로 장식
        d3.show();

        Display d4 = new FullBorder(d2);
        d4.show();
    }
}
