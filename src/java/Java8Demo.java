package java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Java8Demo {
    public static void main(String[] args) {
        // print map key, value pair using java 8

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a"); map.put(2,"b");
        map.forEach((k,v)->System.out.println("{ key : "+ k+ ", value : "+ v + " }"));

        // find no of occurrence element in an array
        findOccurrences(new int[]{1, 2, 1, 3, 1}, 1);
        // map and flat map

        // print prime number 1 to 10 using java 8


    }

    public static void findOccurrences(int[] input, int k) {
        System.out.println(IntStream.of(input).filter(i-> i==k).count());
    }


}
