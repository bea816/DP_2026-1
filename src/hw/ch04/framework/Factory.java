package hw.ch04.framework;

public abstract class Factory {
    // 템플릿 메소드
    public final Product create(String owner) {
        // 실제론 IDCard 객체가 생성되지만, 부모 타입으로 받을 수 있음
        // 자식은 부모를 못 담음
        Product p = createProduct(owner); // 실제 제품 생성
        registerProduct(p); // 생성된 제품 등록
        return p;
    }

    // 추상 메서드 -> 구체적인 공장에서 구현해야 하는 메서드
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
