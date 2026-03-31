package practice.ch05;

public class Singleton {
    // (3) Singleton 객체를 미리 하나 만들어서 static 변수에 저장해 놓는다.
    // 만들어진 하나가 계속 사용됨 -> 싱글톤이 됨
    private static Singleton singleton = new Singleton(); // 클래스 로드 시 실행됨, 이때 객체가 만들어짐

    // (1) 생성자를 private으로 한다.
    private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
    }

    // (2) Singleton 객체를 얻어가는 static 메소드를 정의한다.
    // static을 안 붙이면 호출할 수 X -> 객체 얻을 수 X
    public static Singleton getInstance() {
        return singleton; // 생성자가 없더라도 이걸 호출하면 객체를 얻을 수 있음
    }


}
