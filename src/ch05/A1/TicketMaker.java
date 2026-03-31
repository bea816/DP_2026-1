package ch05.A1;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();

    // 생성자
    private TicketMaker() {
    }

    // 클래스 로드 시 객체 하나 만들어 놓고 계속 리턴
    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
