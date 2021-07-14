package com.ds.tree;

import java.util.Stack;

public class Histogram {

    static int findMaxHistogram(int array[],int n)
    {
        Stack<Integer> s = new Stack<>();
        int max_area = 0;
        int tp;
        int max_area_temp;
        int i = 0;
        while(i<n){
            if(s.empty() ||  array[s.peek()] <= array[i])
            {
                s.push(i++);
            }
            else{
                tp = s.peek();
                s.pop();
                max_area_temp = array[tp] * (s.empty() ? i : i - s.peek() -1);
                if(max_area < max_area_temp){
                    max_area = max_area_temp;
                }
            }
        } while (s.empty() == false)
        	        {
        	            tp = s.peek();
        	            s.pop();
        	            max_area_temp = array[tp] * (s.empty() ? i : i - s.peek() - 1);

        	            if (max_area < max_area_temp)
            	                max_area = max_area_temp;
        	        }

        	        return max_area;
    }
public static void main (String[] args){
        int arr[] = {6,2,5,4,5,1,6};
    System.out.println("Maximum area  " + findMaxHistogram(arr, arr.length));

}
}
