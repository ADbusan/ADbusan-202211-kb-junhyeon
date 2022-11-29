package j16_컬렉션.Set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("박준현");
		nameSet.add("조광현");
		nameSet.add("장근영");
		nameSet.add("서정현");
		nameSet.add("박혜성");
		nameSet.add("이관훈");

		System.out.println(nameSet);
		for (String string : nameSet) {
			if (string.equals("조광현")) {
				System.out.println(string);
				break;
			}
		}
		List<String> nameList = Arrays.asList(new String[] { "장근영", "박준현" });
		System.out.println(nameList);
		Set<String> ListToSet = new HashSet<String>();
		ListToSet.addAll(nameList);
		System.out.println(ListToSet);
		
		nameSet.remove("박준현");
		System.out.println(nameSet);
	}

}
