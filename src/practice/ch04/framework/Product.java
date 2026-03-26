package practice.ch04.framework;

public abstract class Product {
    // 생성자
    // public abstract Product(String name); // 오류

    // 추상 메소드는 서브 클래스에서 반드시 구현해야 하는 메소드  
    public abstract void use();
}
