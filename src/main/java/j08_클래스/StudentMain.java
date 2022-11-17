package j08_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("부경대","홍",2,true);
        student.school = "부산대학교";
        student.name = "홍길동";
        student.studentYear=28;
        student.gender=false;
        student.showStudentinfo();
        student2.showStudentinfo();
    }
}
