package j09_접근지정자.캡슐화;

public class Student {
    private String name;
    public String gender;

    public Student(){}

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void printinfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}
//26
//q= 2
//r= 6
//sum = 8
//r*10 = 60
//sum%10=8
//r*10+sum%10 =68

//68
//q=6
//r=8
//sum=14
//r*10=80
//sum%10=4
//r*10+sum%10 =84