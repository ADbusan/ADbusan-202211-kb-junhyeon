package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Map;

public class StringMap {

	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();
//		벨류는 중복으로 들어가도 괜찮음
//		벨류 == 자바,에이치티엠엘,씨에스에스,자바스크립트,파이썬
//		키값은 중복 XXX
//		키값 == Java,html,css,js,python
		language.put("Java", "자바");
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("pythoin", "파이썬");
		language.put("pythoin2", "파이썬");
		System.out.println(language);
		String s = language.get("Java");
//		System.out.println(language.get("Java"));
		System.out.println(s);

		language.replace("Java", "자바", "자바2");
		System.out.println(language.get("Java"));
		language.replace("Java", "자바2", "자바3");
		System.out.println(language.get("Java"));

		language.remove("pythin2");
		System.out.println(language);
		
	
	}

}
 
