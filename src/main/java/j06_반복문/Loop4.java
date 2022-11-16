package j06_반복문;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String select = null;
        String MY_NAME = null;
        boolean loop_flag1 = true;
        boolean loop_flag2 = true;

        while (loop_flag2) {
            System.out.println("[폴더 선택]");
            System.out.println("1. 문서: ");
            System.out.println("2. 음악: ");
            System.out.println("3. 사진: ");
            System.out.println("4. 동영상: ");
            System.out.println("q. 프로그램 종료: ");
            System.out.print("메뉴 선택: ");
            select = scan.nextLine();
            if (select.equals("1")) {
                while (loop_flag1) {
                    System.out.println("[ 문서 ]");
                    System.out.println("1: 대학 서류");
                    System.out.println("2: 개인 자료");
                    System.out.println("3: 기업 정보");
                    System.out.println("4: 뒤로 가기");
                    System.out.println("5: 종료 하기");
                    select = scan.nextLine();
                    if (select.equals("4")) {
                        System.out.println();
                        break;
                    } else if (select.equals("5")) {
                        loop_flag1=false;
                        loop_flag2=false;
                    }

                }

            } else if (select.equals("2")) {

            } else if (select.equals("3")) {

            } else if (select.equals("4")) {

            } else if (select.equals("q")) {
                System.out.println("정말 프로그램을 종료하시겠습니까(y/n)");
                select = scan.nextLine();
                if (select.equals("y")) {
                    break;
                }
            }else {
                System.out.println("다시입력하시오");
            }
        }
    }
}