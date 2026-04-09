package practice.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false; // 직전 게임에서 이겼는지 여부
    private Hand prevHand; // 직전 게임에서 낸 손

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { // 직전 게임에서 지거나 비겼으면 새로운 손을 낸다
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
