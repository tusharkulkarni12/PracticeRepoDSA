package com.ds.array;

import java.util.Arrays;

//Given an array (or string), the task is to reverse the array/string.
//        Examples :
//
//        Input  : arr[] = {1, 2, 3}
//        Output : arr[] = {3, 2, 1}
//
//        Input :  arr[] = {4, 5, 1, 2}
//        Output : arr[] = {2, 1, 5, 4}
public class ReverseArray {
    public static void main (String[] args) {
        int arr[] =  {1, 2, 3,4,5,6,8,9,10};
        //reverseArr(arr);
        reverseArray(arr);
    }

    private static void reverseArr(int[] arr) {
        int i,temp;
        for(i = 0 ; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = temp;
        }
        System.out.println("Reversed Array: \n" + Arrays.toString(arr));
    }
    private static void reverseArray(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        System.out.println("Reversed Array: \n" + Arrays.toString(arr));
    }


}
