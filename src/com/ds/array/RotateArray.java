package com.ds.array;

public class RotateArray {

    public static void main(String []args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int d = 3;
        int n =arr.length;
       // rotate(arr, d, n);
        leftRotate(arr,d,n);
        printArray(arr,n);
    }
 //  1by 1 rotation approach
    private static void rotate(int[] arr, int d, int n) {

        for(int i = 0 ; i< d;i++){
            int j, last;
            last = arr[n -1];   // last = 7
            int first = arr[0];
            for(j= 0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }

        for(int k = 0 ;k< arr.length;k++){

            System.out.print(" " + arr[k]);
        }

    }

    // GCD approach

    static void leftRotate(int arr[], int d, int n)
    {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /*Fuction to get gcd of a and b*/
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

}
