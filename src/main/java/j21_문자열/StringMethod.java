package j21_문자열;

public class StringMethod {
	public static void main(String[] args) {
		
		String name = "박준현장근영2";
		
		System.out.println(name.length());
		
//		문자의 위치 찾기
		System.out.println(name.indexOf("현"));
		System.out.println(name.indexOf("준"));
		
//		문자의 위치 뒤에서부터 찾기
		System.out.println(name.lastIndexOf("박"));
		
		char name1 = name.charAt(1);
		char name2 = name.charAt(name.indexOf("준"));
		System.out.println(name1);
		System.out.println(name2);
//		System.out.println(name.indexOf("준"));
		
		String subName1 = name.substring(0,3);
		System.out.println(subName1);
		
		String subName2 = name.substring(3,6);
		System.out.println(subName2);
		String nameJH = "박준현";
		System.out.println(name.substring(name.indexOf(nameJH),nameJH.indexOf(nameJH))+nameJH.length());
		
		
		String file = "C:/String.java";
		String fileName = null;
		String extension= file.substring(file.indexOf("."));
	
	
		
		System.out.println(file.substring(file.indexOf("S")));
		
		
		
	}

}
