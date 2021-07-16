package com.ds.string;

public class Palindrome {
    public static void main(String[] args) {
        String s = "qmoeeomq";
        System.out.println(isPlaindrome(s));
    }
   static int isPlaindrome(String S) {
        // code here
        String reverse = "";
        for(int i = S.length()-1 ; i >= 0 ; i--)
        {
            reverse = reverse + S.charAt(i);
        }
        if(S.equals(reverse)){
            return 1;
        }else{
            return 0;
        }
    }
}



