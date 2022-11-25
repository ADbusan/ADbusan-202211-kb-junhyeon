package j14_스태틱.빌더;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .studentcode(20221011)
                .name("박준현")
                .address("부산")
                .build();
        System.out.println(student);
        Student.StudentBuilder sb =
                new Student.StudentBuilder();
    }
}
