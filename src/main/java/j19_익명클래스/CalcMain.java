package j19_익명클래스;

public class CalcMain {
	public static void main(String[] args) {
//		c1에 주소값 들어감
//		이름이 없는 클래스, 임시로 구현함
		Calculator c = new Calculator() {
			@Override
			public int calc(int a, int b) {
				System.out.println("덧셈");
				return a + b;
			}
		};
//		람다!!는 무조건 인터페이스로 씀
//		실행문이 바로 리턴될때 중괄호 생략 가능!
//		중괄호 쓸때는 중간에 실행문 쓸수 있음!
//		인터페이스안에 추상 메소드가 딱 하나만 있어야 람다를 쓸수있음
		Calculator c1 = (x, y) -> x + y;
//		Calculator c1 = (int x, int y) -> {
//		return x+y;
//		};

		CalculatorSub sc = x -> x * x;
		System.out.println(sc.calc(10));
		System.out.println("==============");
		System.out.println(sc.a());
		System.out.println("==============");

		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		Calculator c2 = new Addition();
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
		System.out.println("=============");
	}

}
