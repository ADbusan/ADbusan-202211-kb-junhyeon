package j19_익명클래스;

public class Addition implements Calculator{
//	implements = 인터페이스를 상속 받을때 쓰는 문법
	@Override
	public int calc(int a, int b) {
		System.out.println("덧셈");
		return a+b;
	}

}
