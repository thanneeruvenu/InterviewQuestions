package corejava.Java8;

import java.util.stream.Stream;

public class SumOfAllElementsInAnArrayDemo {
    /**
     * Sum of {1,2,3,4,5}
     * Using java 8
     */

    public static void main(String[] args) {
       int sum = Stream.of(1,2,3,4,5).mapToInt(i -> i).sum();
       System.out.println(" Sum is : "+ sum);
    }
}
