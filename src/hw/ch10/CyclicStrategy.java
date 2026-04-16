package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int currentHandValue = 0; 

    public CyclicStrategy() {
    }

    @Override
    public Hand nextHand() {
        Hand next = Hand.getHand(currentHandValue); 
        currentHandValue = (currentHandValue + 1) % 3; 
        
        return next;
    }

    @Override
    public void study(boolean win) {
        // 승패와 상관 X
    }
}