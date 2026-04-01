package hw.ch04.license;

import hw.ch04.framework.Product;
import hw.ch04.framework.Factory;

public class LicenseCardFactory extends Factory{
    private int licenseCounter = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    protected synchronized Product createProduct(String holder) {
        int id = licenseCounter++; // 카운터 자동 증가
        String issuedDate = baseDate; 
        String expiryDate = "2025-12-31"; // 만료일은 고정값으로 설정
        return new LicenseCard(holder, id, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
