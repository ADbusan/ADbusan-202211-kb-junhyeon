package j14_스태틱;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("아이폰14");
        Product product2 = new Product("아이폰14_Mini");
        System.out.println(product);
        System.out.println(product2);
        product.print();
        product2.print();

    }
}
