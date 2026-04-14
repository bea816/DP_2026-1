package practice.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    // 속성 선언
    private Random random;
    private int prevHandValue = 0; // 직전에 낸 손의 값
    private int currentHandValue = 0; // 이번에 낸 손의 값(가장 최근에 낸 손의 값)
    // 2차원 배열
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };
    
    // 생성자 선언. 난수 만들 때 seed 넣음
    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    // 핵심 전략
    @Override
    public Hand nextHand() {
        // 가장 최근에 낸 손의 값이 행을 다 더함
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    // 행의 합을 구함
    private int getSum(int handvalue) { 
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            // 행 번호는 고정, 열 번호는 0, 1, 2로 변화 = 행의 모든 열의 합
            sum += history[handvalue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        // 이긴 건 1을 더함
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
