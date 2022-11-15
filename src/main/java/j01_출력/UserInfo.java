package j01_출력;

public class UserInfo {
    public static void main(String[] args) {
        String name = "박준현";
        String address = "부산 동래구 사직동";
        String phone = "010-0000-0000";
        int age = 28;
//      int = 약 21억까지 숫자 가능 넘어가면 long 사용 더 큰값 double
//      float,double = 실수

        System.out.println(name+ "의 주소는 "+address+" 입니다.");
        System.out.println(name+ "의 연락처는 "+phone+" 입니다.");
        System.out.println(name+ "의 나이는 "+age+" 살 입니다");

    }

}
// 다운캐스팅 실수 정수 문자  형변환 타입 생략 불가능
// 업 캐스팅은 문자 정수 실수 형변환 타입 가능
