package j21_문자열;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {
	public static void main(String[] args) {
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN, GUEST";
		roles = roles.replace(" ", "");

		String[] roleArray = roles.split(",");
		List<String> roleList = Arrays.asList(roleArray);
		System.out.println(roleList);

		roleList.forEach(role -> {
//			prefix(접두어),stratsWith()
//			suffix(접미어),endsWith()
//			ROLE_로 시작하면
//			equalsIgnoreCase 소,대문자 상관없이 구분 가능
			if (role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) {
				System.out.println("권한 : " + role);
			} else {

			}
		});

	}

}