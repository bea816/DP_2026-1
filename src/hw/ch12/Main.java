package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220753, 이름: 김나영\n");

        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hello, Java!");
        md.add("Decorator Pattern");
        md.add("is powerful.");

        System.out.println("[2-1] 원본 출력");
        md.show();
        System.out.println();

        System.out.println("[2-2] NumberedBorder 단독 적용");
        Display d1 = new NumberedBorder(md);
        d1.show();
        System.out.println();

        System.out.println("[2-3] FullBorder + NumberedBorder 조합");
        Display d2 = new FullBorder(new NumberedBorder(md));
        d2.show();
        System.out.println();

        System.out.println("[2-4] SideBorder + FullBorder + NumberedBorder 3단 중첩");
        Display d3 = new SideBorder(new FullBorder(new NumberedBorder(md)), '*');
        d3.show();
    }
}
