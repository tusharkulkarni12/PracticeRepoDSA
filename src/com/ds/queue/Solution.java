package com.ds.queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int operation = 0;
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        for(int i=0 ;i< q;i++)
        {
            operation = in.nextInt();
            if(operation == 1){
                stack1.push(in.nextInt());
            }else{
                if(stack2.isEmpty())
                {
                    while(!stack1.isEmpty()){
                        stack1.push(stack1.pop());
                    }
                }
            }
            if(operation == 2){
                stack2.pop();
            }
            if(operation == 3){
System.out.println(stack2.peek());
            }
        }

    }
}
