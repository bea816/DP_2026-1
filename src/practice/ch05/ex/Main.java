package practice.ch05.ex;

// Main 클래스는 스레드를 상속받아 스레드가 될 수 있음
public class Main extends Thread {
    public static void main(String[] args) {
        // 스레드 2개 만듦
        Thread a = new Main("thread A"); // 스레드 객체 a 생성
        Thread b = new Main("thread B"); // 스레드 객체 b 생성
        Thread c = new Main("thread C"); // 스레드 객체 c 생성
        
        // 스레드 a와 b가 동시에 실행되도록 함
        a.start(); // 스레드 a 실행
        b.start(); // 스레드 b 실행
        c.start(); // 스레드 c 실행
    }

    @Override
    // thread의 run 메서드를 오버라이드함
    // start() 하면 이 스레드가 실행할 코드
    public void run() {
        Singleton s = Singleton.getInstance(); // 싱글톤 객체 얻기
        System.out.println(getName() + ": " + s); // 객체의 주소값 출력
    }

    // 인자 있는 생성자
    public Main(String name) {
        super(name); // Thread 클래스의 생성자 호출해서 이름 설정
    }
}
