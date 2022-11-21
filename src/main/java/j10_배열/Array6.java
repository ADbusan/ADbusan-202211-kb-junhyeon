package j07_메소드.j10_배열;

public class Array6 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println("배열 a");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+(i !=a.length-1?",":"\n"));
        }
        int[] b = a;
        System.out.println("배열 b ");
        b[3]=10;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+(i!=b.length-1?",":"\n"));
}
    }
}
