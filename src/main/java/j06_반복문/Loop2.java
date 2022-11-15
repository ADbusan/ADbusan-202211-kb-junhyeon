package j06_반복문;

public class Loop2 {
    public static void main(String[] args) {
        int dan = 2;
            for (int i = 1; i < 9; i++) {
                System.out.println("[" + dan + "단]");
                for (int j = 1; j<10; j++){
                    System.out.println(dan + "*" + j + "=" + (dan * j));
                }
                dan++;
            }
        }
    }
