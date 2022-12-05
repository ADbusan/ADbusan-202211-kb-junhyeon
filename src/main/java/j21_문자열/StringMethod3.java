package j21_문자열;

import java.util.function.Function;

public class StringMethod3 {
	public static void main(String[] args) {
		Function<String, String>replacePhoneToken = phoneNumber -> phoneNumber
				.replaceAll("/", "")
				.replaceAll(" ", "")
				.replaceAll("-", "")
				.replaceAll("[.]","");
		
		String phone = "010-9776-6882";
		System.out.println(replacePhoneToken.apply(phone));
		
	}

}
