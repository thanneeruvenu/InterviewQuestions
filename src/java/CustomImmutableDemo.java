package java;

import java.util.HashMap;
import java.util.Map;

public class CustomImmutableDemo {
    public static void main(String[] args) {

        // step 1: class must be final, so it won't allow to extension
        // step 2: all primitive type must be final, should not have setters only it has set the values through a constructor
        // step 3: if it is collection object then it has create temp object and put the reference, like Deep Copy


        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        StudentImmutable obj = new StudentImmutable("abc", 10, map);

        map.put("4","fourth");
        System.out.println(obj.getDetails());

        obj.getDetails().put("3","third");
        System.out.println(obj.getDetails());


    }

}

final class StudentImmutable {

    private final String name;
    private final int id;
    private final Map<String,String> details;

    StudentImmutable(String name, int id, Map<String,String> details){
        this.name = name;
        this.id = id;
        Map<String,String> temp = new HashMap<>(details);
        this.details = temp;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, String> getDetails() {
        return new HashMap<>(details);
    }
}
