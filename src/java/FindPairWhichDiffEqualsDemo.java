package java;

import java.util.*;

public class FindPairWhichDiffEqualsDemo {

    public static void main(String[] args) {
        int[] arr = {2,3,8,5,12,15};
        int diff = 3;

        // list of indices which gives me a diff of 3

        System.out.println("### approach1 ### "+ approach1(arr,diff));
        System.out.println("### approach2 ### "+ approach2(arr,diff));
        System.out.println("### approach3 ### "+ approach3(arr,diff));
        System.out.println("### approach4 ### "+ approach4(arr,diff));


    }

    public static Map<Integer,Integer> approach1(int input[], int diff) {
        int arr[] = Arrays.copyOf(input,input.length);
        Arrays.sort(arr);
        HashMap<Integer,Integer> output = new HashMap<>();
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(output.containsKey(arr[i])) {
                temp.put(arr[i], output.get(arr[i]));
            }
            output.put(diff+arr[i], arr[i]);
        }
        return temp;
    }

    public static Map<Integer,Integer> approach2(int arr[], int diff) {
        Set<Integer> temp = new HashSet<>();
        Map<Integer,Integer> output = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
          if(temp.contains(Math.abs(arr[i]-diff)))
              output.put(Math.abs(arr[i]-diff), arr[i]);
          if(temp.contains(diff+arr[i]))
              output.put(diff+arr[i], arr[i]);
          temp.add(arr[i]);
        }
        return output;
    }

    public static Map<Integer,Integer> approach3(int arr[], int diff) {
        Map<Integer,Integer> output = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
          for(int j=i+1;j<arr.length; j++){
              if(Math.abs(arr[j]-arr[i]) == diff){
                  output.put(arr[i], arr[j]);
              }
          }
        }
        return output;
    }


    public static Map<Integer,Integer> approach4(int arr[], int diff) {
        Map<Integer,Integer> output = new HashMap<>();

        return output;
    }

}
