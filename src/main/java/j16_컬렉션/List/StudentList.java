package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("번호를 입력");
//        int a = scan.nextInt();

        List<Student> students = new ArrayList<Student>();
//        students.add(new Student(202211128,"이승아",28));
//        students.add(new Student(202211128,"김수현",28));
//        students.add(new Student(202211128,"문경원",28));
//        students.add(new Student(202211128,"홍지혜",28));
//        students.add(new Student(202211128,"박준현",28));
//        Student student2 = students.get();
//        System.out.println(student2);
        System.out.println("==========");
        students.get(2).setAge(26);
//        System.out.println(students);
//        0번의 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
//        제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동
        int size = students.size();
        String a = students.get(4).getName();
        for (int i = 0 ; i < size-1;i++){// i<size-1 은 0부터 3까지 4번 반복
            students.get(size-i-1).setName(students.get(size-2-i).getName());
        }//i가 0일때
        //size-i-1은 4를     size-2-i는  3번으로
//                  3을                 2으로
//                  2를                 1으로
//                  1을                 0으로
        students.get(0).setName(a);
        System.out.println(students);

    }
}
