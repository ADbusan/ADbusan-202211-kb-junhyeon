package j15_제네릭;

public class InformationMain {
    public static void main(String[] args) {
        Information<Student> studentInformation
                = new Information<Student>(Student.builder()
                .studentCode(2022001)
                .name("박준현")
                .build());

        Information<Teacher> teacherInformation
                =new Information<Teacher>(Teacher.builder()
                .techerCode(200)
                .name("박준현")
                .build());

        studentInformation.printinfo();
        teacherInformation.printinfo();
    }
}
