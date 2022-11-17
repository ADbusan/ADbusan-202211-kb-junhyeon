package j07_메소드;

public class Merhod2 {
/*\
    메소드 오버로딩
 */
    public static void print(String name) {
        System.out.println("이름 : "+ name);
    }
    public static void print(int age) {
        System.out.println("나이 : "+ age);
    }
    public static void print(String name, int age) {
        System.out.println("이름 : "+ name+"\n나이 : "+ age);
    }
    public static void print(int age,String name) {
        System.out.println("나이 : "+ age+"\n이름 : "+ name);
    }
//    main  strat
    public static void main(String[] args) {
        print("박준현");
        print(28);
        print("박준현",28);
        print(28, "박준현");
    }
}
