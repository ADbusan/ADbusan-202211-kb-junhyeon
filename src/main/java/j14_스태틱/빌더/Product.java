package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Product {
    private int productcode;
    private String productName;
    private int price;
    private int stock;

    public static productBuilder builder() {
        return new productBuilder();
    }

    public static class productBuilder {
        private int productcode;
        private String productName;
        private int price;
        private int stock;

        public productBuilder productcode(int productcode) {
            this.productcode = productcode;
            return this;
        }

        public productBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public productBuilder price(int price) {
            this.price = price;
            return this;
        }

        public productBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public Product build() {
            return new Product(productcode, productName, price, stock);
        }
    }
}