package com.ds.array;
//N non-negative integers representing an elevation map where the width of each bar is 1.
// Write an algorithm to find how much water it is able to trap after raining in
public class TrappingWater {
    static int array[] = new int[] {0,1,0,2,1,0,1,3,2,1,2,1,6,8};

        static int findWater(int n) {
            int maxLeft[] = new int[n];
            int maxRight[] = new int[n];
            int water = 0;
            maxLeft[0] = array[0];
            for (int i = 1; i < n; i++) {
                maxLeft[i] = Math.max(maxLeft[i - 1], array[i]);
            }
            maxRight[n - 1] = array[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                maxRight[i] = Math.max(maxRight[i + 1], array[i]);
            }
            for (int i = 0; i < n; i++) {
                water += Math.min(maxLeft[i], maxRight[i]) - array[i];
                System.out.println(" water " + water);

            }
            return water;
        }

        public static void main(String[] args)
        {
            System.out.println("Maximum water " + findWater(array.length));
        }
    }

/* Try more Inputs
case 1:
actual = findWater([2, 0, 2],3)
expected = 2

case2:
 actual = findWater([3, 0, 2, 0, 4],5)
 expected = 7

case3:
actual = findWater([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1],12)
expected = 6
*/

