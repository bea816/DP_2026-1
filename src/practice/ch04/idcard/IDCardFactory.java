package practice.ch04.idcard;

import practice.ch04.framework.Product;
import practice.ch04.framework.Factory;

public class IDCardFactory extends Factory {
    @Override
    // protected IDCard createProduct(String owner) {
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
