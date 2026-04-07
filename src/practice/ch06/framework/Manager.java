package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    // HashMap은 (key, value) 쌍으로 데이터를 관리
    // Product는 부모 타입 -> 모든 종류의 자식 Product 객체를 관리할 수 있음
    private Map<String,Product> showcase = new HashMap<>();

    // 원본을 등록하는 메소드
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        // 등록할 때 이름을 key로 함
        // key로 등록된 원본 객체를 가져와서 복제한 후 반환
        Product p = showcase.get(prototypeName);
        // 원본 객체의 복제본을 생성하여 반환
        return p.createCopy();
    }
}
