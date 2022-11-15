package j06_반복문;

public class Loop3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i< n; i++){
            for (int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            for (int j=0; j<5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i< n; i++){
            for (int j=0; j<4+1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
