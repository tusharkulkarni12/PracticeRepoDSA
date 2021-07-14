package com.ds.array;

public class DiagonalPrint {

        public static int m,n;

        private static void diagonalPrint(int matrix [][]) {

            for(int i = 0 ; i<m ; i++)
            {
                System.out.println(matrix[i][m] + " ");
            }

            //Write your code here

        }


        public static void main(String[] args)
        {
            int matrix[][] = {{1, 2, 3, 4,5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15},
                    {16, 17, 18, 19, 20},};

            m=matrix.length;
            n=matrix[0].length;

            diagonalPrint(matrix);
        }
    }
/*
Expected Output

        1
        6 2
        11 7 3
        16 12 8 4
        17 13 9 5
        18 14 10
        19 15
        20
*/