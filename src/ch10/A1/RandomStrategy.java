package ch10.A1;

import java.util.Random;

// 부모를 Strategy로 선언해야 함
public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    // 이전과 상관없이 임의의 손을 결정 -> 이전 승부 필요 X
    @Override
    public void study(boolean win) {
    }

    @Override
    public Hand nextHand() {
        // 임의의 손을 내밈
        return Hand.getHand(random.nextInt(3));
    }
}
