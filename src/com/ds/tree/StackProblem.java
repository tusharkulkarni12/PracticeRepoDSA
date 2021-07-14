package com.ds.tree;

import java.util.*;

public class StackProblem {


    static boolean checkParanthesisBalanced(String expr) {
        //Write your program here
        if (expr.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack();
        for (char ch : expr.toCharArray()) {
            if (ch == '{') {
                stack.push('}');
            } else if (ch == '(') {
                stack.push(')');
            }
            else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }

        }
        return stack.empty();

    }



    public static void main(String[] args)
    {
        String expr = "([{}])";
        if (checkParanthesisBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}