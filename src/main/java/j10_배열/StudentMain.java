package j10_배열;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("박준현",1);
        students[1] = new Student("jun",2);
        students[2] = new Student("park",3);

        for (int i = 0 ;  i<3 ; i++) {
            System.out.println("이름: "+students[i].getName()+ "\n학년: "+students[i].getYear());
        }

    }
}
