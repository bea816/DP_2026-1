package practice.ch04.idcard;

import practice.ch04.framework.Product;
import practice.ch04.framework.Factory;

public class IDCardFactory extends Factory {
    @Override
    // 이렇게 써도 오류는 안 나지만, Factory Method 패턴은 프레임워크와 공장/제품을 분리하기 위해 Product로 선언
    // protected IDCard createProduct(String owner) {
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
