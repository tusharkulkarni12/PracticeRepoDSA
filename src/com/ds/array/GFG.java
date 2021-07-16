package com.ds.array;

/*Given an array that is sorted and then rotated around an unknown point.
Find if the array has a pair with a given sum ‘x’. It may be
assumed that all elements in the array are distinct.
Examples :
Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
Output: true
There is a pair (6, 10) with sum 16 */
//

// Brute force approach
class GFG {
    public static void main (String[] args) {
        System.out.println("GfG!");
        int arr[] = {11, 15, 6, 8, 9, 5};
        int x = 16;
        if(checkTwoSum(arr,x))
            System.out.println("true");
        else
            System.out.println("false");

    }
    static boolean checkTwoSum(int arr[],int x){
        System.out.println("GfG. ...!");
        boolean flag = false;
        for(int i = 0;i<arr.length - 1 ;i++){
            for(int j = i+1;j<arr.length ;j++){
                if(arr[i] + arr[j] == x){
                    flag =  true;
                    return flag;
                }else{
                    flag = false;
                }
            }
        }
        return flag;
    }
}