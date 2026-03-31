package ch04.A2;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import ch04.A2.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim"); //100번
        Product card2 = factory.create("Heungmin Son"); //101번
        Product card3 = factory.create("Kane"); //102번

        card1.use();
        card2.use();
        card3.use();

        System.out.println("/n--- 등록된 카드 목록 (시리얼 번호 -> 오너) ---");
        factory.getOwnerTable().forEach((serial, owner) -> {
            System.out.println("시리얼 번호: " + serial + ", 오너: " + owner);
        });
    }
}


// public class Main {
//     public static void main(String[] args) {
//         Factory factory = new IDCardFactory();
//         Product card1 = factory.create("Youngjin Kim");
//         Product card2 = factory.create("Heungmin Son");
//         Product card3 = factory.create("Kane");
//         card1.use();
//         card2.use();
//         card3.use();
//     }
// }