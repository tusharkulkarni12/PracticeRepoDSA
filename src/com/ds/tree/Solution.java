package com.ds.tree;

import java.util.Scanner;

class Solution {

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    public static int height(Node root) {
        // Write your code here.
        if(root == null){
            return 0;
        }

//        int lheight =  height(root.left);
//        int rheight =  height(root.right);

        //if (lheight > rheight){
        // System.out.println(lheight);

        return Math.max(height(root.left),height(root.right)) + 1;
        //  System.out.println(rheight);

        //         return lheight + 1;
        // }
        //      else{
        //      System.out.println(lheight);
        //  System.out.println(rheight);

        //         return rheight + 1;

    }


    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}