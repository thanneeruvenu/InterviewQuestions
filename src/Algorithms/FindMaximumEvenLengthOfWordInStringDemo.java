package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaximumEvenLengthOfWordInStringDemo {
    /**
     *
     * Find Maximum Even Length of a String
     *
     * Ex :
     */

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("before approach1 :: " + (runtime.totalMemory() - runtime.freeMemory()));
       System.out.println(approach1("geeksforgeeks is a platform for geeks"));
        System.out.println("after approach1 :: " + (runtime.totalMemory() - runtime.freeMemory()));

        System.out.println("before approach2 :: " + (runtime.totalMemory() - runtime.freeMemory()));
        System.out.println(approach2("geeksforgeeks is a platform for geeks"));
        System.out.println("after approach2 :: " + (runtime.totalMemory() - runtime.freeMemory()));

    }

    public static final String approach1(String str){
        return Arrays.stream(str.split(" ")) // creates the stream with words
                .filter(s -> s.length() % 2 == 0) // filters only the even length strings
                .max(Comparator.comparingInt(String::length)) // finds the string with the max length
                .orElse(" "); // returns " " if none string is found

    }

    public static final String approach2(String str){
        String output = "";
        for(String word : str.split(" ")){
            if(word.length() % 2 == 0 && output.length() < word.length()) {
                output = word;
            }
        }
        return output;
    }

    public static final String approach3(String str){
        int min_index = 0;
        int max_index=0;

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == ' '){
                if(max_index % 2 == 0){

                }
            }else {
                max_index ++;
            }
        }

        return str.substring(min_index,max_index);
    }
}
