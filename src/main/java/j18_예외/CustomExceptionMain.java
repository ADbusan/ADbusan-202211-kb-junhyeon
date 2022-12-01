package j18_예외;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomExceptionMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username = null;
		String password = null;
		System.out.print("아이디: ");
		username = scan.nextLine();
		System.out.print("비밀번호: ");
		password = scan.nextLine();
		
		try { 
			if (username.isBlank() && password.isBlank()) {
				Map<String, String> errorMap = new HashMap<>();
				errorMap.put("username", "아이디를 입력하세요");
				errorMap.put("password", "비밀번호 입력하세요");
				throw new CustomException(errorMap);
			}
			else if (username.isBlank()) {
				Map<String, String> errorMap = new HashMap<>();
				errorMap.put("username", "아이디를 입력하세요");
				throw new CustomException(errorMap);
			} else if (password.isBlank()) {
				Map<String, String> errorMap = new HashMap<>();
				errorMap.put("password", "비밀번호 입력하세요");
				throw new CustomException(errorMap);
			}
			System.out.println("회원 등록 진행");

		} catch (CustomException e) {
			// TODO: handle exception
			e.printErrorMap();
			System.out.println("내가 만든 예외 처리함");
			try {
				e.printErrorMap();
			} catch (NullPointerException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");

	}

}
