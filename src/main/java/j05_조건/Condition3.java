package j05_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        String select = null;
//     ******* String select;

        Scanner scan = new Scanner(System.in);
        System.out.print("선택 : ");
        select = scan.nextLine();
        switch (select){
            case "아침":
                System.out.println("아침 식사");
                break;
            case "점심":
                System.out.println("점심 식사");
                break;
            case "저녁":
                System.out.println("저녁 식사");
                break;
            default:
                System.out.println("잘못된 입력 입니다");
//                default 그외의 것들
        }
    }
}
