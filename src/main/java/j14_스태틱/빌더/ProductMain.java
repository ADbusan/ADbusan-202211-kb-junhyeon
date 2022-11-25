package j14_스태틱.빌더;

import j01_출력.SystemOut;

public class ProductMain {
    public static void main(String[] args) {
        Product product = Product.builder()
                .productcode(123456)
                .build();
        System.out.println(product);

    }
}
