package java;

import java.util.Arrays;

public class FindMissingNumberInListDemo {
    public static void main(String[] args) {
        int input[] = {1, 3, 5, 2};

        System.out.println(" ### approach1 ### : " + approach1(input));
        System.out.println(" ### approach2 ### : " + approach2(input));
        System.out.println(" ### approach3 ### : " + approach3(input));
        System.out.println(" ### approach4 ### : " + approach4(input));

    }

    private static int approach1(int[] input) {
        int n = input.length+1;
        int sum_of_elements = n * (n + 1) / 2;
        int sum = 0;
        for (int i : input) sum += i;
        return sum_of_elements - sum;
    }

    private static int approach2(int[] input) {
        int temp[] = Arrays.copyOf(input, input.length);
        Arrays.sort(temp);
        int output = 0;
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] + 1 != temp[i + 1]) {
                output = temp[i] + 1;
                break;
            }
        }
        return output;
    }

    private static int approach3(int[] input) {
        int output = 1;
        for(int i=2; i<=input.length + 1; i++){
            output+=i;
            output-=input[i-2];
        }
        return output;
    }

    private static int approach4(int[] input) {
        int x1 = input[0];
        int x2 = 1;
        for (int i =1; i<input.length; i++) x1 = x1 ^ input[i];
        for (int i =2; i<=input.length+1; i++) x2 = x2 ^ i;

        return (x1^x2);
    }
}
