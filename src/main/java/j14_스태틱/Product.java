package j14_스태틱;

import lombok.Data;

/*
    공유영역
     */
@Data
public class Product {
    private static int autoIncrement = 20220000;
    private String  name;
    private  int seriaLNumber;

    public Product(String name) {
        this.seriaLNumber = ++autoIncrement;
        this.name = name;
}
public static void print(){
    System.out.println(autoIncrement);
//    System.out.println(seriaLNumber); 아직 메모리에 할당이 안됨
}
}
