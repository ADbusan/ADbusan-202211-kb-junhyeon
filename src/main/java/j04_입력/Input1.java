package j04_입력;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 입력하시오");
        String name = scan.nextLine();
        System.out.println("나이를 입력하시오");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("연락처를 입력하시오");
        String phone = scan.nextLine();
        System.out.println("주소를 입력하시오");
        String address = scan.nextLine();

        System.out.println("이름: "+ name);
        System.out.println("나이: "+ age);
        System.out.println("연락처: "+ phone);
        System.out.println("주소: "+ address);
    }
}
