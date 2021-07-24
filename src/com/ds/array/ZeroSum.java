package com.ds.array;
//Array of both positive and negative numbers, the task i
// s to find out the sub array whose sum is Zero in Time Complexity O(n) and Space Complexity O(n)

import java.util.*;

class SubArray
{
    int first, second;
    SubArray(int a, int b)
    {
        first = a;
        second = b;
    }
}

public class ZeroSum
{
    static List<SubArray> findSubArrays(int[] array, int n)
    {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<SubArray> result = new ArrayList<>();
        int sum = 0;
        for(int i = 0 ;i < n ; i++){
            sum = sum + array[i];
            if(sum == 0){
                result.add(new SubArray(0,i));
            }
            List<Integer> list = new ArrayList<>();
            if(map.containsKey(sum)) {
                list = map.get(sum);
                for (int j = 0; j < list.size(); j++) {
                    result.add(new SubArray(list.get(j) + 1, i));
                }
            }
                list.add(i);
                map.put(sum,list);


        }
        return result;
    }


    public static void main(String args[])
    {
        int[] array = {6, 3, -2, 5, -3, 7, -6, -1, 4};
        int n = array.length;
        findSubArraysWithoutHashMap(array, n);
        subArrayExists(array);
        List<SubArray> out = findSubArrays(array, n);
        for(SubArray sb : out){
            int first = sb.first;
            int second = sb.second;
           // System.out.println(first);
           // System.out.println(second);
        }
      //  System.out.println(out.size());


    }

    private static void findSubArraysWithoutHashMap(int[] array, int n) {
        for(int i = 0 ; i< n ;i++){
            for(int j = 1 ; j < i ; j++){
                if(array[i] + array[j] == 0){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }


    }


    static Boolean subArrayExists(int arr[])
    {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0
                    || sum == 0
                    || hs.contains(sum))
                return true;

            // Add sum to hash set
            hs.add(sum);
            System.out.println(hs);

        }

        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }
}

/* Try more Inputs
case1:
actual = findSubArrays([4, 2, -3, 1, 6],5)
expected = True

case2:
actual = findSubArrays([4,2,0,1,6],5)
expected = True

actual = findSubArrays([-3,2,3,1,6],5)
expected = False

actual = findSubArrays([1,2],2)
 expected = False

*/