package corejava;

public class SubListReverseBasedOnIndexDemo {
    public static void main(String[] args) {

        /**
         * Input:
         * arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
         * k = 3
         * Output:
         * [3, 2, 1, 6, 5, 4, 9, 8, 7]
         *
         * Input:
         * arr = [1, 2, 3, 4, 5, 6, 7, 8]
         * k = 5
         * Output:
         * [5, 4, 3, 2, 1, 8, 7, 6]
         *
         * Input:
         * arr = [1, 2, 3, 4, 5, 6]
         * k = 1
         * Output:
         * [1, 2, 3, 4, 5, 6]
         */

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        reverse(input, k);

        // print out put
        for (int i: input) {
          System.out.print( i+" \t ");
        }

        input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
         k = 5;
        reverse(input, k);
        System.out.println("\n");
        // print out put
        for (int i: input) {
            System.out.print( i+" \t ");
        }

    }

    public static void reverse(int[] input, int k) {
        for (int i=0; i<input.length; i+=k) {
            int left = i;
            int right = Math.min(i+k-1, input.length-1);
            int temp;
            while(left < right) {
                temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        }
    }
}
