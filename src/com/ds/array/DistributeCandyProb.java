package com.ds.array;
//
//There are N children standing in a line with some rating value.
// You want to distribute a minimum number of candies to these children such that:
// Each child must have at least one candy. The children with higher ratings will have more
// candies than their neighbors. You need to write a program to calculate the minimum candies you must give.
//
//        Example:
//
//        Input: arr[] = [1, 5, 2, 1]
//        Output: 7
//        Explanation: Candies given = [1, 3, 2, 1]
public class DistributeCandyProb {

    public static void main(String[] args) {
        int ratings[] = {1,5,2,1};
        int result = candy(ratings);
        System.out.println(result);
    }

    public static int candy(int[] ratings) {
        if(ratings == null || ratings.length == 0){
        return 0;
        }
        int left[] = new int[ratings.length];
        int right[] = new int[ratings.length];
        // first n last element
        left[0] = 1;
        right[ratings.length -1] = 1;
        int result = 0;

        for(int i = 1;i< ratings.length;i++)
        {
            if(ratings[i] > ratings[i-1]){
                left[i] = left[i-1] + 1;
            }
            else{
                left[i] = 1;
            }
        }


        for(int i = ratings.length - 2;i>=0;i--)
        {
            int cur = 1;
            if(ratings[i] > ratings[i+1]){
                right[i] = right[i+1] + 1;
            }
            else{
                right[i] = 1;
            }
        }

        for(int i = 0 ; i< ratings.length;i++){
            result += Math.max(right[i],left[i]);
            int[] resultarr = ratings;
            System.out.println(resultarr);
        }



        return result;
    }

}
