package j06_반복문;

public class Loop1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i < 9) {
                System.out.print(", ");
            }

        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(20 - i);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(10 - i);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + 10);
            if (i < 9) {
                System.out.print(", ");
            }

        }
        int n = 10;
        for (int i = 0, j = n; i<n; i++,j-- ){
            System.out.println(i);
            System.out.println(j);
        }
    }
}