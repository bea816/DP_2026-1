package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220753, 이름: 김나영");
        
        KoreanOutlet outlet = new KoreanOutlet();
        Charger adapter = new KoreanOutletAdapter(outlet);
        Smartphone smartphone = new Smartphone(adapter);
        smartphone.charge();
    }
}
