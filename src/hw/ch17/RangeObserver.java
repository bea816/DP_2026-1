package hw.ch17;

public class RangeObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int count = generator.getNumber();
        String range = "";
        
        if (count >= 0 && count < 10) {
            range = "Low";
        } else if (count >= 10 && count < 20) {
            range = "Mid";
        } else if (count >= 20) {
            range = "High";
        }
        
        System.out.println("RangeObserver: [" + range + "] " + count);
        
        // 출력 속도 조절
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}