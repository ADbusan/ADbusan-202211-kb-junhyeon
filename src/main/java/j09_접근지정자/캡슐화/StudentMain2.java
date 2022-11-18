package j09_접근지정자.캡슐화;

public class StudentMain2 {
    public static void main(String[] args) {
        Student2 student = new Student2();

        student.setName("박준현");
        student.setYear(28);
        student.setGender(true);
        student.setSchool("부산대");
        student.showinfo();
    }
}
