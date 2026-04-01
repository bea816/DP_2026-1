package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private Map<Integer, String> ownerTable = new HashMap<>();
    private String baseDate; 

    // 생성자 추가
    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    protected synchronized Product createProduct(String owner) {
        int id = serial++;
        ownerTable.put(id, owner);
        return new IDCard(owner, id, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }

    public String getOwnerName(int serial) {
        return ownerTable.get(serial);
    }

    public Map<Integer, String> getOwnerTable() {
        return new HashMap<>(ownerTable); // 복제본 반환
    }
}