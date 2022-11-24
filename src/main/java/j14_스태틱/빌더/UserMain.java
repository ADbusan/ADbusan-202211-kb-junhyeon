package j14_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .username("준현")
                .name("박준현")
                .password("1234")
                .email("@naver.com")
                .build();
        System.out.println(user);
    }

}
