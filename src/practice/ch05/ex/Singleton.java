package practice.ch05.ex;

public class Singleton {
    // 미리 생성 안 하고 null 넣음 = 아직 객체가 없다는 의미
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); // 생성 시간이 오래 걸리도록 하기 위해 호출
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) { // 첫 번째 호출 될 때만 인스턴스 생성됨
            singleton = new Singleton();
        }
        return singleton; // 이후에는 있던 객체 리턴
    }

    // 객체가 하나 만들어지는 데 시간이 걸린다고 가정
    private void slowdown() {
        try {
            Thread.sleep(1000); // cpu를 내놓고 1초 간 쉰다는 의미
        } catch (InterruptedException e) {
        }
    }
}
