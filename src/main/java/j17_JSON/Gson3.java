package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Gson3 {
	public static void main(String[] args) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("username", "준현");
		jsonObject.addProperty("pasword", "123456");
		System.out.println(jsonObject);
		
		JsonArray jsonArray = new JsonArray();
		jsonArray.add("java");
		jsonArray.add("python");
		jsonArray.add("javascript");
		jsonArray.add("c#");
		System.out.println(jsonArray);
		
		jsonObject.add("subject", jsonArray);
		System.out.println(jsonObject);
		
		
	}

}
