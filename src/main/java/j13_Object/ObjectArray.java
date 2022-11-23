package j13_Object;
public class ObjectArray {
    public static Object getObject(Object obj){
        return obj;
    }
    public static void main(String[] args) {
        Object[] objects = new Object[7];
        objects[0] = new Student(20220001,"박준현");
        objects[1] = new Car("벤틀리","화이트");
        objects[2] = new Student(20220002,"park");
        objects[3] = new Car("부가티","블랙");
        objects[4] = new Student(20220003,"jun");
        objects[5] = "hyeon";
        objects[6] = 20221011.5;
        for (int i = 0; i < objects.length;i++){
            System.out.println(objects[i]);
        }
        System.out.println(objects[5].getClass());
        System.out.println(objects[6].getClass());
    }
}
