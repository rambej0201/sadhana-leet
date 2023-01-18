package com.rss.leetPractice.start;

public class PalindromeNumberValidation {

    public static void main(String[] args) {
        int x = 121;
        System.out.println(findPalindrome(121));

    }


    public static boolean findPalindrome(int xx){
        if (xx < 0 || ( xx != 0 && xx % 10 == 0)){
            return false;
        }
        int temp = xx;
        int rev = 0;

        while (xx > 0){
            int digit = xx % 10;
            rev = (rev * 10) + digit;
            xx = xx/10;
        }
        if (rev == temp){
            return true;
        }
        return false;
    }
}
