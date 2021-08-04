package Algorithms;

import java.util.StringJoiner;

public class StringPermutationsDemo {

    public static void main(String[] args) {

        /**
         * input “xyz";
         * output xyz,xzy,yxz,yzx,zxy,zyx
         *
         */

        permutation("xyz", "");
    }

    public static void permutation(String s, String output) {
        if(s.isEmpty()){
            System.out.print(output + "\t");
            return;
        }

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            String left_string = s.substring(0,i);
            String right_string = s.substring(i+1);
            String rest = left_string+right_string;
            permutation(rest, output+ch);
        }

    }
}
