package practice.ch04;

import practice.ch04.idcard.IDCard;
import practice.ch04.idcard.IDCardFactory;
import practice.ch04.framework.Product;

public class Main {
    public static void main(String[] args) {
        // IDCard 객체를 직접 생성
        // IDCard c = new IDCard("김나영");
        // c.use();

        // 공장을 통해서 IDCard 객체를 생성
        IDCardFactory f = new IDCardFactory();
        IDCard c = (IDCard) f.create("김나영");
        // Product c = f.create("김나영");
        c.use();
    }
}
