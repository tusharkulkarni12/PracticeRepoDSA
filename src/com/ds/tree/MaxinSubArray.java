package com.ds.tree;

import java.util.Deque;
import java.util.LinkedList;

public class MaxinSubArray {

    static void maxInSubarrayay(int array[], int n, int k) {

        Deque<Integer> integerDeque = new LinkedList<Integer>();
        int i;
        for (i = 0; i < k; ++i) {
            while (!integerDeque.isEmpty() && array[i] >= array[integerDeque.peekLast()]) {
                integerDeque.removeLast();
                integerDeque.addLast(i);
            }
        }
        for (; i < n; ++i) {
            System.out.println(array[integerDeque.peek()] + " ");
            while (!integerDeque.isEmpty() && integerDeque.peek() <= i - k) {
                integerDeque.removeFirst();
                while ((!integerDeque.isEmpty()) && array[i] >= array[integerDeque.peekLast()])
                    integerDeque.removeLast();

                integerDeque.addLast(i);
            }

            System.out.print(array[integerDeque.peek()]);
        }
    }
    public static void main(String[] args) {
        int array[] = {8, 6, 10, 7, 5, 17, 14, 87, 15};
        int k = 3;
        maxInSubarrayay(array, array.length, k);
    }
}
//    private static void maxInSubarrayay(int[] array, int length, int k) {
//
//            for(int i = 0 ; i< length -1 ;i++)
//            {
//                if(array[i] > array[i+1])
//                {
//                    if(i<k) {
//                        System.out.println(array[i]);
//                    }
//                }
//                else{
//                    if(i<k) {
//                        System.out.println(array[i + 1]);
//                    }
//                }
//            }
//    }
//}

/* Try more Inputs
Case 1:
int array[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
int k = 3;
maxInSubarrayay(array, array.length, k)
expected = 3 3 4 5 5 5 6
Case2:
int array[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
int k = 4;
maxInSubarrayay(array, array.length, k)
expected = 10 10 10 15 15 90 90

*/

