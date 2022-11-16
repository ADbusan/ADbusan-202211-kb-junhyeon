package j06_반복문;

import java.util.Scanner;

public class Loop5 {
    public static boolean selectionConditions(String c, int a,int b){
        boolean loop_flag = true;
        if (c.equals("1")) {
            System.out.println("===============");
            System.out.println("정답 : "+(a + b));
            System.out.println("===============");
        }else if (c.equals("2")) {
            System.out.println("===============");
            System.out.println("정답 : "+(a - b));
            System.out.println("===============");
        }else if (c.equals("3")){
            System.out.println("===============");
            System.out.println("정답 : "+(a * b));
            System.out.println("===============");
        }else if (c.equals("4")){
            System.out.println("===============");
            System.out.println("정답 : "+(a / b));
            System.out.println("===============");
        }else if (c.equals("5")){
            System.out.println("===============");
            System.out.println("정답 : "+(a % b));
            System.out.println("===============");
        }else if (c.equals("6")){
            System.out.println("종료합니다");
            loop_flag=false;
        }else {
            System.out.println("===============");
            System.out.println("다시 입력하시오");
            System.out.println("===============");
        }
        return loop_flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 a를 입력하시오 : ");
        int a = scan.nextInt();
        System.out.print("정수 b를 입력하시오 : ");
        int b = scan.nextInt();
        scan.nextLine();
        boolean loop_flag = true;
        while (loop_flag) {
            String c;
            System.out.println("1: 덧셈");
            System.out.println("2: 뺄셈");
            System.out.println("3: 곱셈");
            System.out.println("4: 나눗셈");
            System.out.println("5: 나머지");
            System.out.println("6: 종료");
            System.out.print("입력 : ");
            c = scan.nextLine();

            loop_flag = selectionConditions(c,a,b);
        }
    }
}

