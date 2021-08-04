package Algorithms;

import java.util.Arrays;

public class FindEquilibriumIndexOfAnArrayDemo {

    public static void main(String[] args) {
        /**
         *
         * Equilibrium index of an array is an index such that the sum of elements
         *                   at lower indexes is equal to the sum of elements at higher indexes.
         *
         * For example, in an array A:
         *
         * Example :
         *
         * Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
         * Output: 3
         * 3 is an equilibrium index, because:
         * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
         *
         * Input: A[] = {1, 2, 3}
         * Output: -1
         *
         */

        System.out.println(getEquilibriumIndex(new int[]{-7, 1, 5,2, -4, 3, 0}));

        System.out.println(approach2(new int[]{-7, 1, 5,2, -4, 3, 0}));
    }


    public static int getEquilibriumIndex(int []input){
        int index = -1;
        int left_sum = 0;
        int right_sum = 0;

        int left = 0;
        int right = input.length-1;

        while (left <= right){
            left_sum+=input[left];
            right_sum+=input[right];


            if(left_sum == right_sum && (left != right-1 || left+1 != right)){
                index = left+1;
                break;
            }
            left++;
            right--;

        }
        return index;
    }

    public static int approach2(int []input){
        int index = -1;
        int sum = 0;
        int left_sum = 0;
        for(int i=0;i<input.length;i++)
            sum+=input[i];

        for(int i=0;i<input.length;i++){
            sum-=input[i];
            if(sum == left_sum){
                index = i;
                break;
            }
            left_sum+=input[i];
        }
        return index;
    }




}
