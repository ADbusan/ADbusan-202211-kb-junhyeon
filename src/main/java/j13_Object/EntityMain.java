package j13_Object;


public class EntityMain {
    public static void main(String[] args) {
        Entity entity = new Entity("박준현", 28, "부산 동구 초량동");
        Entity entity1 = new Entity("박준현",28,"부산 동구 초량동");
        System.out.println(entity.equals(entity1));
        System.out.println(entity1.hashCode());
        System.out.println(entity.hashCode());
        System.out.println(entity.getAddress());

        System.out.println(Entity.class);
        Class c = Entity.class;
        System.out.println(c);
        System.out.println(Entity.class == entity.getClass());
    }
}
