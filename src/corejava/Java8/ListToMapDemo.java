package corejava.Java8;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMapDemo {
    public static void main(String[] args) {

        List<String> list = List.of("Jan", "Feb",
                "Mar", "Apr",
                "May", "Jun",
                "July", "Aug",
                "Sep", "Oct",
                "Nov", "Dec");

        Map map = IntStream.range(0, list.size())
                .boxed()
                .collect(Collectors.toMap(i -> i + 1, list::get));

        System.out.println(map);

        AtomicInteger index = new AtomicInteger();
        Map map1 = list.stream()
                .sorted().peek(System.out::println)
                .collect(Collectors.toMap((val) -> index.addAndGet(1), (val) -> val));

        System.out.println(map1);

    }
}
