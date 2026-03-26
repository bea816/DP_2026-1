package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;

    // 생성자. public이 있어야 외부에서 객체 생성 가능
    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    // 이 객체에 문자열이 필요할 때 자동으로 호출되는 메소드
    // Object 클래스(최상위 클래스)의 toString() 메소드를 오버라이드
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
