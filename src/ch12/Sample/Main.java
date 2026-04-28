package ch12.Sample;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world."); // 중심 객체
        Display b2 = new SideBorder(b1, '#'); // b1을 sideborder로 장식, 첫번째 장식한 결과물
        Display b3 = new FullBorder(b2); // b2를 fullborder로 장식, 두번째 장식한 결과물
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("Hello, world.") // 중심객체
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b4.show();
    }
}
