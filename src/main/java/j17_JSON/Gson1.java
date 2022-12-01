package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {
	public static void main(String[] args) {
		Gson gson = new Gson();
//		Gson gsonBuilder = new GsonBuilder().create();
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson2 = gsonBuilder.setPrettyPrinting().create();

		Map<String, Object> map = new HashMap<>();
		map.put("name", "박준현");
		map.put("email", "dlsnditk90@naver.com");
		map.put("address", "부산 진구");
		map.put("phone", "01097766882");

		List<String> hobby = new ArrayList<>();
		hobby.add("축");
		hobby.add("농");
		hobby.add("야");
		map.put("hobby", hobby);
		System.out.println(map);
		
		String json = gson2.toJson(map);
		System.out.println(json);
		Map<String, Object>jsMap =gson2.fromJson(json,Map.class);
		System.out.println(jsMap);
	}
}
