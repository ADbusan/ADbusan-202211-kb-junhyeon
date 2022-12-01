package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {
	public static void main(String[] args) {
		User user = User.builder()
				.username("준현")
				.password("123456")
				.name("박준현")
//				.email("dlsnditk90@naver.com")
				.build();
		System.out.println(user);
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.excludeFieldsWithoutExposeAnnotation()
				.create();//gson 에서 쓰는 빌더 패턴 
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		User userObj = null;
		userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
						
		
	}

}
