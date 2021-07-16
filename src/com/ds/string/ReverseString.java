package com.ds.string;

import java.util.Arrays;

public class ReverseString {
        public static void main(String[] args) {
            char[] s = {'a', 'b', 'c', 'd', 'e'};
            char temp;
            int start = 0;
            int end = s.length - 1;
            while (start < end) {
                temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }
            System.out.println("Reversed Array: \n" + Arrays.toString(s));

        }

    }
