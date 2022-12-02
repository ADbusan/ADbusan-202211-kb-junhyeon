package j19_익명클래스;

@FunctionalInterface
public interface Calculator {
	public int calc(int a, int b);

//	디폴트 메소드는 사용가능 오버라이드가 없기때문에
	public default int a() {
		return 10;
	}

}
