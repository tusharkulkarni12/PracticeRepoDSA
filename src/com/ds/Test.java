package com.ds;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String args[]){
        String str = "namano";
        if(checkPalindrom(str)){
            System.out.println("true");
        }
    }

    private static boolean checkPalindrom(String str) {
        Map m = new HashMap();
            String reverse = "";
        for(int i = str.length()-1; i>=0;i--){
            reverse = reverse + str.charAt(i) ;
        }
        System.out.println(reverse);

        if(reverse.equals(str))
        {
            return true;

        }
        else {
            return false;
        }
    }
}
