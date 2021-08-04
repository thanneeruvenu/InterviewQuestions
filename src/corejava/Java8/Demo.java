package corejava.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        /**
         * Diff b/w limit and skip
         *
         */

        Stream.of(1,2,3,4,5,6,7,8,9,10).limit(5).forEach(i-> System.out.print(" \t"+ i));
        System.out.println("\n =============");
        Stream.of(1,2,3,4,5,6,7,8,9,10).skip(6).forEach(System.out::println);

        /**
         * Diff b/w Intermediate and Terminal Operations in Stream
         *
         */
        System.out.println("\n =============");

        System.out.println("Intermediate Operation won't execute");
        Arrays.stream(new int[] { 2, 3 }).map(i -> {
            System.out.println(i);
            return i;
            // No terminal operation so it won't execute
        });

        System.out.println("Terminal operation starts here");
        Arrays.stream(new int[] { 4, 8 }).map(i -> {
            System.out.println(i);
            return i;
            // This is followed by terminal operation sum()
        }).sum();

        List<Integer> list1 = new ArrayList<>();
                list1.add(1);
                list1.add(3);
                list1.add(5);
                list1.add(6);

        List<Integer> list2 = List.of(2,1,4,5,6);

        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
