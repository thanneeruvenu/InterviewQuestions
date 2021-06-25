package corejava;

import java.util.HashMap;
import java.util.Map;

public class FindPairWhichSumEqualsDemo {
    public static void main(String[] args) {
        /**
         * find a pair of numbers whose sum is equal to given sum
         * [1, 5, 2, 4, 3]
         * 7
         */

        System.out.println(findPairs(new int[]{1, 5, 2, 4, 3, 7,0}, 7));
    }

    public static Map<Integer,Integer> findPairs(int[] input, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        Map<Integer, Integer> temp = new HashMap<>();
        for (int i=0; i<input.length; i++) {
            if(temp.containsKey(input[i])) {
                map.put(input[i], temp.get(input[i]));
            }else {
                temp.put(k-input[i], input[i]);
            }
        }

        //System.out.println(temp);
        return map;
    }
}
