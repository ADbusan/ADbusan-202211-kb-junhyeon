package j21_문자열;

public class StringMethod2 {
	public static void main(String[] args) {
//		문자열을 배열로 넣는 방법 split
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";
		String[] roleArray = new String[3];

		String[] roleArray2 = roles.split(", ");
		for (String role : roleArray2) {
			System.out.println(role);
		}

	}

}
