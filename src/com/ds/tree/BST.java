package com.ds.tree;


public class BST {
    Node root;
    boolean isBST(){
        return function(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean function(Node node, int min, int max) {
        /* Write Your code Here */
        if(node == null){
            return true;
        }
        return (function(node.left,min,node.data - 1) && function(node.right,node.data +1,max));
    }

    public static void main(String args[]){
        BST bst = new BST();
        bst.root = new Node(12);
        bst.root.left = new Node(4);
        bst.root.right = new Node(25);
        bst.root.left.left = new Node(2);
        bst.root.left.right = new Node(9);
        bst.root.right.left = new Node(16);
        bst.root.right.right = new Node(32);

        if (bst.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");

    }

}
