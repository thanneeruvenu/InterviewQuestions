package corejava.Java8;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateInAnArrayDemo {
    public static void main(String[] args) {

      Set<Integer> set =  List.of(1,2,3,1,4,3,2,5).stream().collect(Collectors.toSet());
      System.out.println(set);

      System.out.println("==========================");

      List<Integer> list = List.of(1,2,3,1,4,3,2,5).stream().distinct().collect(Collectors.toList());
      System.out.println(list);


    }
}
