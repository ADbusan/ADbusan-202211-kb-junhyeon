package j08_클래스;

public class PhoneMain {
    public static void main(String[] args) {
        Phone iPhone14 = new Phone("Apple","iPhone14");
        Phone galaxys22 = new Phone("SAMSUNG","Galaxys22");

        System.out.println(iPhone14);
        System.out.println(galaxys22);

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxys22.printPhoneCompany();
        galaxys22.printPhoneModel();
    }
}
/*
Class : study, studentmain
학생정보
school(학교명)
name(학생이름)
studentYear(학년)
boolean gender(성별 true= 남 , false=여)

showStudentinfo(){
학교명 : 부산대학교
이름 : 홍길동
학년 : 3

성별 : 남
}
 */
