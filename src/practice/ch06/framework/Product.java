package practice.ch06.framework;

// product 인터페이스를 구현한 클래스는 clone() 메서드를 제공함
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy(); // 복제 메서드
}
