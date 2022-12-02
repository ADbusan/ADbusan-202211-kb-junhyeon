package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("박준현");
		names.add("조광현");
		names.add("장근영");
		names.add("서정현");

			Supplier<String> firsName = () -> names.get(0);
			System.out.println(firsName.get());
		
	}

}
