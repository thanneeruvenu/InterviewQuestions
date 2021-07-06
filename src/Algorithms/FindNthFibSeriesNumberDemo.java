package Algorithms;

public class FindNthFibSeriesNumberDemo {

    public static void main(String[] args) {
        int n = 9;

        long startTime = System.nanoTime();
        System.out.println(n + "th of Fib series Number : " + approach1(n));
        System.out.println("Time Taken approach1 (Recursive) === > " + ((System.nanoTime()) - startTime));

        startTime = System.nanoTime();
        System.out.println(n + "th of Fib series Number : " + approach2(n, new int[n + 1]));
        System.out.println("Time Taken approach2 (Recursive DP Top Down ) === > " + ((System.nanoTime()) - startTime));

        startTime = System.nanoTime();
        System.out.println(n + "th of Fib series Number : " + approach3(n, new int[n + 1]));
        System.out.println("Time Taken approach4 (DP Bottom Up with table cache) === > " + ((System.nanoTime()) - startTime));

        startTime = System.nanoTime();
        System.out.println(n + "th of Fib series Number : " + approach4(n));
        System.out.println("Time Taken approach4 (DP Bottom Up without table cache) === > " + ((System.nanoTime()) - startTime));

    }

    /**
     * Recursive Approach
     * <p>
     * f(n) -> {
     * if n <2 return n
     * else f(n-1) + f(n-2)
     * }
     * <p>
     * Time Complexity -> O(2^n)
     * Space Complexity -> O(n) due to method stack otherwise O(1)
     */
    public static int approach1(int n) {
        if (n < 2) return n;
        return approach1(n - 1) + approach1(n - 2);
    }

    /**
     * Recursive , repeated calculated data will be cached
     * Dynamic Programming with Top Down Approach with table cache
     * Time Complexity -> O(n)
     * Space Complexity -> O(n)
     */
    public static int approach2(int n, int[] cache) {
        if (n < 2)
            return n;

        if (cache[n] != 0)
            return cache[n];

        return cache[n] = approach2(n - 1, cache) + approach2(n - 2, cache);
/*
        int first, second;

        if (cache[n - 1] != -1)
            first = cache[n - 1];
        else
            first = approach2(n - 1,cache);

        if (cache[n - 2] != -1)
            second = cache[n - 2];
        else
            second = approach2(n - 2,cache);

        // Memoization
        return cache[n] = first + second;*/
    }

    /**
     * Iterate , repeated calculated data will be cached
     * Dynamic Programming with Top Down Approach with table cache
     * Time Complexity -> O(n)
     * Space Complexity -> O(n)
     */
    public static int approach3(int n, int[] cache) {
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i <= n; i++) cache[i] = cache[i - 1] + cache[i - 2];
        return cache[n];
    }

    /**
     * Time Complexity -> O(n)
     * Space Complexity -> O(1)
     */
    public static int approach4(int n) {
        int i = 0, j = 1;
        while (n - 2 >= 0) {
            int temp = i + j;
            n--;
            i = j;
            j = temp;
        }
        return j;
    }
}



