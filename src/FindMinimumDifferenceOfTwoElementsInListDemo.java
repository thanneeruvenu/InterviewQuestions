import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindMinimumDifferenceOfTwoElementsInListDemo {

    public static void main(String[] args) {
        /**
         * find minimum diff of b/w two elements and get the pair
         *
         * Input : [11,61,20,91,93,84,88,78,21]
         *
         * output : [20,21], Minimum diff is 1
         */

        System.out.println("####### With out sort #########");
        withOutSort(new int[]{11, 61, 20, 91, 93, 84, 88, 78, 21});
        System.out.println("####### With sort #########");
        withSort(new int[]{11, 61, 20, 91, 93, 84, 88, 78, 21});
    }

    public static void withOutSort(int[] input) {
        int min = Integer.MAX_VALUE;
        Map<Integer, Map<Integer, Integer>> map = new TreeMap<>();
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int diff = Math.abs(input[i] - input[j]);
                min = Math.min(min, diff);
                if (!map.containsKey(diff)) {
                    map.put(diff, new HashMap<>());
                }
                map.get(diff).put(input[i], input[j]);

            }
        }
        //System.out.println(map);
        System.out.println("Minimum diff pair is : " + map.get(min));
        System.out.println("minimum diff is : " + min);
    }

    public static void withSort(int[] input) {
        Arrays.sort(input);
        Map<Integer, Map<Integer, Integer>> map = new TreeMap<>();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            int diff = input[i + 1] - input[i];
            if (!map.containsKey(diff)) {
                map.put(diff, new HashMap<>());
            }
            map.get(diff).put(input[i], input[i + 1]);

            min = Math.min(min, diff);
        }

        System.out.println("Minimum diff pair is : " + map.get(min));

        System.out.println("minimum diff is : " + min);

    }
}
