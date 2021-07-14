package com.ds.tree;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    static void maxInSubarrayay(int array[], int n, int k)
    {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int i;
        for (i = 0; i < k; ++i) {

            while (!Qi.isEmpty() && array[i] >= array[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
        }
        for (; i < n; ++i) {

            System.out.print(array[Qi.peek()] + " ");

            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();

            while ((!Qi.isEmpty()) && array[i] >= array[Qi.peekLast()])
                Qi.removeLast();

            Qi.addLast(i);
        }

        System.out.print(array[Qi.peek()]);
    }

    public static void main(String[] args)
    {
        int array[] = {8, 6, 10, 7, 5, 17, 14, 87, 15};
        int k = 3;
        maxInSubarrayay(array, array.length, k);
    }
}

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