package com.rss.leetPractice.start;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] yourTest = {"uniting","unit","united"};
        System.out.println(longestCommonPrefix(yourTest));

    }

    public static String longestCommonPrefix(String[] inputs){

        if (inputs.length == 0){
            return "";
        }

        String prefix = inputs[0];
        for (int i = 1; i < inputs.length; i++){
            while (inputs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;
    }
}
