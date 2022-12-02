package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Main3 {
//	Consumer, List 인터페이스
	public static void forEachTest(Consumer<String>consumer,List<String>list) {
		for(String s : list) {
			consumer.accept(s);
//	for(String s : list) 리스트안에 값을 다꺼낼때까지 반복
//	왜 for 구문에 consumer는 못쓰는지 list가 names 리스트형이라서
			
//	s는 뭘의미하는지, 순서를 의미
			
//	consumer.accept(s)에 list, consumer 쓰는 차이가 뭔지
		}
	}
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("박준현");
		names.add("장근영");
		names.add("조광현");
		names.add("서정현");
		names.add("이관훈");

		names.forEach(n->{
			System.out.println(n);
		});
		System.out.println();
		forEachTest(n-> {System.out.println(n);},names);
//	n은 어떤걸 의미하는지, 순서를 의미
		
	}

}
