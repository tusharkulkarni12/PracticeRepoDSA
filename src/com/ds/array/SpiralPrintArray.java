package com.ds.array;
//you are given a matrix of m x n elements (m rows, n columns),
//        Print all elements of the matrix in spiral order in O(m*n) Time Complexity and O(1) Space
//        Complexity Asked in: Microsoft, OLA, PayTm, Oracle
//        Example:
//        Input:
//        [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//        ]
//        Output: [1,2,3,6,9,8,7,4,5]
//
//        Hint 1 : Divide the matrix in different layers and print numbers from outer to inner layer
public class SpiralPrintArray {
    static void spiralPrint(int m, int n, int matrix[][])
    {
        int i ,k = 0, l = 0;
        while(k < m && l < n){

            for(i = l ; i < n; ++i)
            {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for(i = k ; i < m; ++i)
            {
                System.out.print(matrix[i][n-1] + " ");
            }
            n--;
            if(k<m) {
                for (i = n-1; i >= l; --i) {
                    System.out.print(matrix[m-1][i] + " ");
                }
                m--;
            }
            if(l<n) {
                for (i = m-1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args)
    {
        int R = 4;
        int C = 4;
        int matrix[][] = { { 1, 2, 3, 4},
                {5,6,7,8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16 } };
        spiralPrint(R, C, matrix);
    }
}
