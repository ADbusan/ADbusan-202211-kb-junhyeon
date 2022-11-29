package j16_컬렉션.List;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Student {
    private int studentId;
    private String name;
    private int age;
    private List<Hobby> hobbyList;
}
