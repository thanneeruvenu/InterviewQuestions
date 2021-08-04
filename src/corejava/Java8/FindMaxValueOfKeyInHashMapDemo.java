package corejava.Java8;

import java.util.*;

public class FindMaxValueOfKeyInHashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("a",1);
        stringIntegerMap.put("c",100);
        stringIntegerMap.put("b",50);
        stringIntegerMap.put("e",101);
        stringIntegerMap.put("f",60);

        stringIntegerMap
                .entrySet()
                .stream()
                .filter(entry ->
                        entry.getValue() == Collections.max(stringIntegerMap.values()))
                .forEach(System.out::println);

        OptionalInt max = stringIntegerMap.values().stream().mapToInt(i -> i).max();
        if(max.isPresent()){
            stringIntegerMap
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() == max.getAsInt())
                    .forEach(System.out::println);
        }

        Optional<Map.Entry<String, Integer>> optionalEntity = stringIntegerMap
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(entry -> entry.getValue()));

        if(optionalEntity.isPresent()){
            System.out.println(optionalEntity.get());
        }


    }
}
