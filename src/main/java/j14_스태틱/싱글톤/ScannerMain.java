package j14_스태틱.싱글톤;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner1 s1 = new Scanner1();
        Scanner2 s2 = new Scanner2();
        s1.inputName();
        System.out.println();
        s2.inputAge();
//1     main 실행
//2     Scanner1, 2 //ScannerSingleton.getInstance().getScanner();실행
//3     ScannerSingleton 실행
//4     Scanner1, 2에 scanner 실행
    }
}
