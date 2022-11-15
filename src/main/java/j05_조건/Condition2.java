package j05_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        System.out.print("접수를 입력 하시오: ");

        while (true){
            score = scan.nextInt();
        if (0 < score && score < 101) {
            if (score > 90) {
                System.out.println("A");
                break;
            } else if (score > 80) {
                System.out.println("B");
                break;
            } else if (score > 70) {
                System.out.println("C");
                break;
            } else if (score > 60) {
                System.out.println("D");
                break;
            } else {
                System.out.println("F");
                break;
            }
        }else {
            System.out.println("점수를 다시 입력하시오 : ");
             }
        }
    }
}