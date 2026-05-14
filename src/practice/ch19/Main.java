package practice.ch19;

public class Main {
    public static void main(String[] args) {
        // UI 프레임 생성
        SafeFrame frame = new SafeFrame("rmarh rudql tltmxpa");

        // 시계
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour); // 시간 설정
                try {
                    Thread.sleep(1000); // 1초마다 시간 변경
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
