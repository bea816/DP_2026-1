package hw.ch06;

import hw.ch06.framework.Product;

public class BorderLine implements Product {
    private char borderchar;

    public BorderLine(char borderchar) {
        this.borderchar = borderchar;
    }

    @Override
    public void use(String s) {
        // borderlen
        int borderlen = s.length();
        for (int i = 0; i < borderlen; i++) {
            System.out.print(borderchar);
        }
        System.out.println();
        System.out.println(s);
        for (int i = 0; i < borderlen; i++) {
            System.out.print(borderchar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone(); // 자기 복제
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
