package j14_스태틱.빌더;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
    private int studentCode;
    private String Name;
    private String address;

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
    public static class StudentBuilder{
        private int studentCode;
        private String name;
        private String address;
        public StudentBuilder studentcode(int studentcode){
            this.studentCode = studentcode;
            return this;
        }
        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }
        public Student build(){
            return new Student(studentCode, name, address);
       }
    }
}
