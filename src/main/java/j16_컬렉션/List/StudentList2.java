package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {
    public static void main(String[] args) {
//        List<String> namesList =  Arrays.asList(new String[]{
//                "김","박","이"});
            List<Hobby>hl = Arrays.asList(new Hobby[]{
                    new Hobby(1,"축구"),
                    new Hobby(2,"농구"),
                    new Hobby(3,"골프"),
                    new Hobby(4,"음악감상")
            });
           Student s1 = Student.builder()
                    .studentId(20221011)
                    .name("박준현")
                    .age(28)
                    .hobbyList(Arrays.asList(new Hobby[]{hl.get(0),hl.get(2)}))
                    .build();
        Student s2 = Student.builder()
                .studentId(20221012)
                .name("조광현")
                .age(28)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(1),hl.get(3)}))
                .build();
        Student s3 = Student.builder()
                .studentId(20221013)
                .name("장근영")
                .age(28)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0),hl.get(3)}))
                .build();
//        System.out.println(s1);
        List<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for (Student s : sl){
            System.out.println(s);
            System.out.println("<"+s.getName()+"학생취미>");
            for (Hobby h : s.getHobbyList()){
                System.out.println(h);
            }
            System.out.println();
        }
    }
}
