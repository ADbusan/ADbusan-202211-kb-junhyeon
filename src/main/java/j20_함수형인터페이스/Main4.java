package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {
	public static void main(String[] args) {
//		Integer = 값 , String = 리턴값
		Function<Integer, String> fx1 = age -> age + "살";
		System.out.println(fx1.apply(28));

		Function<Function<Integer, String>, String> fx2 = fx -> fx.apply(20) + "입니다.";
		System.out.println(fx2.apply(age -> age + "살"));
		
		
//		Map = 리턴 값? , Integer = 입력값, String = 입력값
		BiFunction<Integer, String, Map<Integer,String>> createMap = (number, name)->{
			Map<Integer,String>map = new HashMap<>();
//			HashMap ??
			map.put(number, name);
			return map;
		};
		List<Map<Integer,String>>list = new ArrayList<>();
		list.add(createMap.apply(100, "박준현"));
		list.add(createMap.apply(200, "준현"));
		list.add(createMap.apply(300, "현"));
		list.add(createMap.apply(400, "박"));
		list.add(createMap.apply(500, "박현"));
		System.out.println(list);
	}

}
