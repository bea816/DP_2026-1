package ch05.A2b;

// enum이 hashmap보다 간단
public enum Triple {
    ALPHA, BETA, GAMMA; // 각 상수에 Triple 객체가 하나씩 자동으로 만들어져 저장됨

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    // 각 상수를 리턴
    // valueOf는 enum 클래스에서 제공하는 static 메소드로, 문자열로 상수 이름을 받아 해당 상수를 리턴
    public static Triple getInstance(String name) {
        return valueOf(name);
    }
}
