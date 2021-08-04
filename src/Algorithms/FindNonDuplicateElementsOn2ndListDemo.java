package Algorithms;

import java.util.HashSet;
import java.util.Set;

public class FindNonDuplicateElementsOn2ndListDemo {
    public static void main(String[] args) {

        /**
         * Find all elements from first list which is not present in 2nd list.
         *
         *
         */
        approach1(new int[]{1,3,5,6}, new int[]{2,1,6,4});
        System.out.println("\n");
        approach2(new int[]{1,3,5,6}, new int[]{2,1,6,4});

    }

    public static void approach1(int []a, int []b){
        for (int i=0;i<a.length;i++){
            int j;
            for(j=0;j<b.length;j++)
                if (a[i] == b[j])
                    break;

            if(j==b.length)
                System.out.print(a[i] + " \t ");
        }
    }

    public static void approach2(int a[], int []b){
      Set<Integer> set = new HashSet();
      for(int i=0;i<b.length;i++){
          set.add(b[i]);
      }

      for(int i=0;i<a.length;i++) {
          if (!set.contains(a[i]))
              System.out.print(a[i] + " \t");
      }
    }
}
