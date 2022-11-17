package j08_클래스;

public class Student {
    String school;
    String name;
    int studentYear;
    boolean gender;
    Student(){}
    Student(String school,String name, int studentYear, boolean gender) {
        this.school = school;
        this.name = name;
        this.studentYear = studentYear;
        this.gender = gender;
    }
    void showStudentinfo() {
        System.out.println("school : " + school);
        System.out.println("name : " + name);
        System.out.println("age : " + studentYear);
        System.out.println("gender : " + (gender ? "남" : "여"));
    }
}

