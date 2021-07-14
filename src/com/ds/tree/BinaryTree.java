package com.ds.tree;


public class BinaryTree
{
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinaryTree()
    {
        root = null;
    }

    void deleteKey(int key)
    {
        root = Delete(root, key);
    }

    Node Delete(Node root, int key) {
        //Write your code here
        if (root == null) {
            return root;
        } else if (key < root.key) {
            root.left = Delete(root.left, key);
        } else if (key > root.key) {
            root.right = Delete(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
                return root;
            } else if (root.left == null) {
                root = root.right;
                return root;
            } else if (root.right == null) {
                root = root.left;
                return root;
            } else {
                Node temp = findInorderSuccessor(root.right);
                root.key = temp.key;
                root.right = Delete(root.right,temp.key);
            }
        }
        return root;
    }


    Node findInorderSuccessor(Node node)
    {
        //Write your code here
        while(node.left != null)
        {
            node = node.left;
        }
        return node;
    }

    Node insertRec(Node root, int key)
    {
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder()
    {
        inorderRec(root);
    }

    void insert(int key)
    {
        root = insertRec(root, key);
    }

    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

		/* Let us create following BST
			50
		/	 \
		30	 70
		/ \ / \
		20 40 60 80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
    }
}
