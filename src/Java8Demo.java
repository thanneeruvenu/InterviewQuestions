import java.util.HashMap;
import java.util.Map;

public class Java8Demo {
    public static void main(String[] args) {
        // print map key, value pair using java 8

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a"); map.put(2,"b");
        map.forEach((k,v)->System.out.println("{ key : "+ k+ ", value : "+ v + " }"));

        // map and flat map

        // print prime number 1 to 10 using java 8

    }
}
