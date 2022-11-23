package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Student student = new Student(20221123,"박준현");
        Student student2 = new Student(20221123,"박준현");
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student.equals(student2));
        System.out.println();
        print(student);
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        Class c = student.getClass();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        Field[] field = c.getDeclaredFields();
        for(int i  = 0;  i < field.length; i++) {
            System.out.println(field[i].getName());
        }
        Method[] methods = c.getDeclaredMethods();
        for(int i  = 0;  i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}
