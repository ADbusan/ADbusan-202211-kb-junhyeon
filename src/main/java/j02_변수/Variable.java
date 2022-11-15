package j02_변수;

public class Variable {
    public static void main(String[] args) {
        boolean chekFlag = false;
        System.out.println("논리 자료형: "+chekFlag);
        chekFlag = true;
        System.out.println("논리 자료형: "+chekFlag);

//      유니코드
//      캐릭터 자료형은 +연산하면 숫자형으로 출력
        char name1 = '박';
        char name2 = '준';
        System.out.println(""+name1+name2);
        System.out.println(Integer.toHexString(name1));
        System.out.println("\ubc15");

        int width = 100;
        int width2 = 200;
        System.out.println(width2+width);

        String sWidth = "100";
        String sWidth2 = "200";
        System.out.println(sWidth+sWidth2);

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum+dNum2);
//        주석(메모)
        /**
         * 클래스,메소드에대한 설명
         */
        System.out.println("------------업 캐스팅 형변환------------");
//        회색 부분 생략 가능
        //        업캐스팅
//        문자 정수 실수 방향
        char c1 = 'a';
        System.out.println(c1);
        System.out.println((int)c1+10);
        int n1 = (int)c1;
        System.out.println(n1);
        double d1 = (double) n1;
        System.out.println(d1);
        System.out.println("-----------다운 캐스팅 형변환-------------");
        //        다운캐스팅
//        실수 정수 문자 방향
        int n2 = (int)d1;
        System.out.println(n2);

        char c2 = (char)   n2;
        System.out.println(c2);














    }
}
