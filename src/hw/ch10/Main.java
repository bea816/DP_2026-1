package hw.ch10;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220753, 이름: 김나영\n");

        System.out.println("===== RandomStrategy ====="); 
        Player player1 = new Player("Taro", new RandomStrategy(0)); 
        
        System.out.println("\n===== CyclicStrategy ====="); 
        Player player2 = new Player("Bob", new CyclicStrategy()); 

        // CyclicStrategy 테스트: 순환 확인 
        System.out.println("CyclicStrategy의 손가락 순환:"); 
        Strategy cyclic = new CyclicStrategy(); 
        for (int i = 0; i < 9; i++) { 
            Hand hand = cyclic.nextHand(); 
            System.out.println((i+1) + "번째: " + hand); 
            cyclic.study(false);  // study 호출해도 영향 없음 
        } 

        System.out.println("\n===== 10번 게임 진행 결과 =====");
        for (int i = 0; i < 10; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            // player1이 이긴 경우
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } 
            // player2가 이긴 경우
            else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } 
            // 비긴 경우
            else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("\n===== 최종 결과 =====");
        System.out.println(player1);
        System.out.println(player2);
    }
}
