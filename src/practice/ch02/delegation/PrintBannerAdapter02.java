package practice.ch02.delegation;

// 어댑터
// 자바에서는 다중 상속 불가능(부모가 2 이상은 허용 X) => 위임 이용함
// public class PrintBannerAdapter02 extends Print, Banner  => 오류
public class PrintBannerAdapter02 extends Print {
    private Banner banner;  // Banner 클래스의 인스턴스를 참조하는 필드

    public PrintBannerAdapter02(String string) {
        this.banner = new Banner(string);  // Banner 클래스의 인스턴스를 생성하여 필드에 저장
    }
    
    @Override
    public void printWeak() {  
        banner.showWithParen();  // Banner 클래스의 메서드를 호출하여 기능을 수행(위임)
    }
    // ↕️ 부모로부터 선언된 것 구현
    @Override
    public void printStrong() {
        banner.showWithAster();  // Banner 클래스의 메서드를 호출하여 기능을 수행(위임)
    }

    // 독자적으로 구현한 메서드
    public String getYourName() {
        return "홍길동";
    }
}
