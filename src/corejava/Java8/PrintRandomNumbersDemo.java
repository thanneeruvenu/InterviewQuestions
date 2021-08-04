package corejava.Java8;

import java.util.Random;

public class PrintRandomNumbersDemo {

    public static void main(String[] args) {

        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);

        System.out.println("=======");
        random.ints().limit(5).sorted().forEach(System.out::println);


    }
}
