package j09_접근지정자.캡슐화;

public class Student2 {
    private String school;
    private String name;
    private int year;
    private boolean gender;

    public void setSchool(String school) {
        this.school = school;
    }
    public String getSchool() {
        return school;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public boolean isGender() {
        return gender;
    }
    public void showinfo(){
        System.out.println("학교명: "+school);
        System.out.println("학생명: "+name);
        System.out.println("나이  : "+year);
        System.out.println("성별  : "+ (gender?"남":"여"));
    }
}
