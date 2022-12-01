package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User {
	private String username;
	private String password;
}

public class UserListException {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("aaa", "111"));
		userList.add(new User("bbb", "222"));
		userList.add(new User("ccc", "333"));
		userList.add(new User("ddd", "444"));
		userList.add(null);
		int length = userList.size() + 1;

		try {
			for (int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}
			System.out.println("==============================================");
			for (int i = 0; i < 5; i++) {
				System.out.println("username : " + userList.get(i).getUsername());
				System.out.println("password : " + userList.get(i).getPassword());
			}
		} catch (IndexOutOfBoundsException e) {
			length -= 1;
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("예외가 생성됨");
			try {
				System.out.println("===============================================");
				for (int i = 0; i < 5; i++) {
					System.out.println("username : " + userList.get(i).getUsername());
					System.out.println("password : " + userList.get(i).getPassword());
				}
			} 
			catch (NullPointerException e2) {
				System.out.println(e2);
				System.out.println(e.getMessage());
				System.out.println("예외가 생성됨");
			}
			catch (Exception e2) {
				e.printStackTrace();
			}finally {
				System.out.println("무조건실행");
//				무조건 마지막에 실행되는 부분
				
			}
			System.out.println("무조건실행");
		}
		System.out.println("프로그램 정상 종료");

	}

}
