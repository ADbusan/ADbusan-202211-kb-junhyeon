package j05_조건;

import java.util.Scanner;

public class Condtition4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
//       ***** for(int i = 0; i<10;i++){
//            System.out.println("aa");
//        }

        System.out.println("시험 성적 입력 : ");
        score = scan.nextInt();
        if (score<0 || score>100){
            System.out.println("잘못된 입력!");

        }else {
            switch (score/10){
                case 10:
                    System.out.println("A");
                    break;
                case 9:
                    System.out.println("B");
                    break;
                case 8:
                    System.out.println("C");
                    break;
                case 7:
                    System.out.println("D");
                    break;
                case 6:
                    System.out.println("E");
                    break;
                default:
                    System.out.println("F");
            }
        }
    }
}
