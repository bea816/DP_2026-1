package ch04.A2.idcard;


import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private Map<Integer, String> ownerTable = new HashMap<>();

    protected synchronized Product createProduct(String owner) {
        int id = serial++;
        ownerTable.put(id, owner);
        return new IDCard(owner, id);
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


// public class IDCardFactory extends Factory {
//     private int serial = 100;
//     protected synchronized Product createProduct(String owner) {
//         return new IDCard(owner, serial++);
//     }
//     @Override
//     protected void registerProduct(Product product) {
//         System.out.println(product + "을 등록했습니다.");
//     }
// }