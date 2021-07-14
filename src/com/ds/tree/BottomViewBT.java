package com.ds.tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class NodeLevel<U,V>{
    public final U first;
    public final V second;
    NodeLevel(U first,V second){
        this.first = first;
        this.second = second;
    }
    public static <U, V> NodeLevel <U, V> of(U a, V b)
    {
        return new NodeLevel<>(a, b);
    }
}
public class BottomViewBT {

    public static void bottomView(Node root, int d, int level, Map<Integer,NodeLevel<Integer,Integer>> map){
            if(root == null){
                return;
            }
            if(!map.containsKey(d) || level >= map.get(d).second){
                map.put(d,NodeLevel.of(root.data,level));
            }
        bottomView(root.left,d-1,level+1,map);
        bottomView(root.right,d+1,level+1,map);

    }
    //Function to print the bottom view of given binary tree
    public static ArrayList<Integer> bottamView(Node root)
    {
        //Practise Yourself : Write your code Here

        ArrayList<Integer> mlist = new ArrayList<Integer>();
        Map<Integer,NodeLevel<Integer,Integer>> map = new TreeMap<>();
        bottomView(root,0,0,map);
        for(NodeLevel<Integer,Integer> it : map.values()){
            mlist.add(it.first);
        }
        return mlist;
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        System.out.print(bottamView(root));
    }
}

