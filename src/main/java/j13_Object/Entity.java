package j13_Object;

import lombok.*;
/*
mvn 으로 쉽게 코드 자동 사용 가능
 */
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data

public class Entity {
    public  boolean cmp(){
        return this.getClass() == Entity.class;
    }
//    클래스의 두가지 종류
//    클래스 = 정보를 담는 곳이 Entity
//    클래스 = 동작을 하기위한 코드르 담는 곳이 services
    private  String name;
    private int age;
    private String address;

//    public Entity() {}
//    public Entity(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    @Override
//    public String toString() {
//        return "Entity{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
