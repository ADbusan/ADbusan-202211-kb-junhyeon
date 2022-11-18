package j09_접근지정자.캡슐화;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("박준현", "남");
        Student2 student2 = new Student2();
        student.printinfo();

        student.setName("박준현");
        student.printinfo();
        System.out.println();

        student2.setName("박준현");
        student2.setSchool("서울대");
        student2.setYear(28);
        student2.setGender(true);
        student2.showinfo();
        System.out.println();

        student.gender = "여";

        student.printinfo();
        System.out.println(student.gender);
        System.out.println(student.getName());

        System.out.println(student2.getName());
        System.out.println(student2.getSchool());





    }
}

/*
public class Student{
    private String name;
}
 */