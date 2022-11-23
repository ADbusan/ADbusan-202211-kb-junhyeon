package j13_Object;

import java.util.Scanner;

public class StringTest {
//    모든 클래스는 object를 상속 받는다
    public static void main(String[] args) {
        String str = "A";
        String str2 = "A";
        String str3 = new String("A");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str.toString());
    }
}
