package practice.ch10;

public class Main {
    public static void main(String[] args) {

        /*
        Hand h1 = Hand.ROCK; // ROCK은 Hand 타입의 객체
        Hand h2 = Hand.SCISSORS; // SCISSORS는 Hand 타입의 객체

        if (h1.isStrongerThan(h2)) {
            System.out.println(h1 + "이 " + h2 + "보다 강하다.");
        } else if (h1.isWeakerThan(h2)) {
            System.out.println(h1 + "이 " + h2 + "보다 약하다.");
        } else {
            System.out.println(h1 + "과 " + h2 + "는 비겼다.");
        }
        */

        // 플레이어 생성
        // Player player1 = new Player("Taro", new WinningStrategy(314));
        // Player player2 = new Player("Hana", new WinningStrategy(15));

        // 부모 타입으로 선언했기 때문에 전략을 바꿔도 문제 없음
        // 이건 실행 중 교체 X, 컴파일 할 때 교체 O
        // seed를 직접 기입함 -> 하드코드 되어 있다고 표현(좋은 것 X)
        Player player1 = new Player("Taro", new ProbStrategy(314));
        Player player2 = new Player("Hana", new WinningStrategy(15));

        // 게임 진행
        for (int i = 0; i < 10; i++) {
            Hand h1 = player1.nextHand();
            Hand h2 = player2.nextHand();

            if (h1.isStrongerThan(h2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (h1.isWeakerThan(h2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(player1);
        System.out.println(player2);

        
    }
}
