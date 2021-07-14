package com.ds.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array  of n integers and an integer target, Find if there elements a, b, c, and
// d in integers present in array  such that a + b + c + d = target.
// Find unique quadruplets in the array which gives the sum of target
public class Quadruplets {

    static class Numbers{
         int x;
         int y;
         public Numbers(int x,int y){
             this.x = x;
             this.y = y;
         }
    }

    static List<String>  FourSumProblem(int []arr,int n,int target, ArrayList<String> mlist) {
        Map<Integer, Numbers> map = new HashMap<Integer, Numbers>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                map.put(arr[i] + arr[j], new Numbers(i, j));
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (map.containsKey(target - sum)) {
                    Numbers p = map.get(target - sum);
                    if (p.x != i && p.x != j && p.y != i && p.y != j) {
                        mlist.add(arr[i] + " , " + arr[j] + " ," + arr[p.x] + " , " + arr[p.y]);
                        return mlist;
                    }
                }

            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        int array[] = { 1, 5, 1, 0, 6, 0 };
        int n = array.length;
        int sum = 12;
        ArrayList<String> mlist = new ArrayList<String>();
        System.out.println(FourSumProblem(array, n, sum,mlist));
    }
}

