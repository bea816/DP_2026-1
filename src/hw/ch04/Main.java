package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;
import hw.ch04.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220753, 이름: 김나영");

        // step 1
        System.out.println("=== IDCardFactory 테스트 ===");
        Factory factory = new IDCardFactory("2026-03-20"); 
        Product card1 = factory.create("Kim Youngjin"); 
        Product card2 = factory.create("Son Heungmin"); 

        card1.use(); 
        card2.use(); 

        // step 2
        System.out.println("\n=== LicenseCardFactory 테스트 ===");
        Factory factory2 = new LicenseCardFactory("2026-03-20"); 
        Product license1 = factory2.create("Park Jisung"); 
        Product license2 = factory2.create("Lee Min-jae"); 
        license1.use(); 
        license2.use(); 
        }
}
