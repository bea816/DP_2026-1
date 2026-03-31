package practice.ch05;

public class Main {
    public static void main(String[] args) {
        // Singleton s1 = new Singleton(); // singleton이 private이므로 외부에서 객체 생성 불가 -> 컴파일 에러
        // 클래스를 메모리에 로드
        Singleton s2 = Singleton.getInstance(); // static 메소드로 객체 얻기
        Singleton s3 = Singleton.getInstance(); // 매번 새로운 객체가 생성됨 -> 싱글톤이 아님

        System.out.println("s2: " + s2); // 객체타입@주소
        System.out.println("s3: " + s3); // 주소가 다른 것은 다른 객체 2개가 만들어졌음 의미

        if (s2 == s3) { // 같은 객체를 참조하는지 비교
            System.out.println("s2와 s3는 같은 Singleton 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 Singleton 객체입니다.");
        }

        Singleton2 s4 = Singleton2.INSTANCE; // enum의 상수는 이미 만들어진 객체를 참조
        s4.Hello();
    }
}
