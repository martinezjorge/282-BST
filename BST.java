//import jdk.nashorn.api.tree.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * NAME: abstractTree.java
 * Description: This is the BST class containing all methods for traversing the tree
 * Author:
 */


public class  BST<E extends Comparable<E>> implements TreeInterface<E> {

    // Data fields
    public TreeNode<E> root;
    // Store the number of Nodes in this class variables
    public int size = 0;
    //Store the number of Non Leaf nodes in this class variables
    public int nonleaves;

    public ArrayList<E> inOrderTraversal = new ArrayList<>();
    public ArrayList<E> preOrderTraversal = new ArrayList<>();
    public ArrayList<E> postOrderTraversal = new ArrayList<>();
    public ArrayList<E> bstTraversal= new ArrayList<>();


    // empty constructor
    public BST(){

    }

    // check if it is empty
    public boolean isEmpty() {
        // if the root has nothing then there can be no tree. so True
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }// end isEmpty

    // By: Jorge Martinez
    // Searches for a node in the tree
    public boolean search(E e){
        TreeNode<E> focusNode = root;
        while(focusNode.getElement().compareTo(e) != 0){
            if(e.compareTo(focusNode.getElement()) < 0 ){
                focusNode = focusNode.getLeft();
            } else {
                focusNode = focusNode.getRight();
            }
            if(focusNode == null){
                System.out.print("Node " + e + " not found: ");
                return false;
            }
        }
        System.out.println("Node Analysis:");
        System.out.println("Node " + e + " found: ");
        if(focusNode.getParent() != null)
            System.out.println("Node's parent is: " + focusNode.getParent().getElement());
        if(focusNode.getLeft() != null)
            System.out.println("Node's left child is: " + focusNode.getLeft().getElement());
        if(focusNode.getRight() != null)
            System.out.println("Node's right child is: " + focusNode.getRight().getElement());
        return true;
    } // end search method

    // By: Jorge Martinez
    // Inserts a node to the tree
    public void insert(E e) {
        TreeNode<E> newNode = new TreeNode<>();
        newNode.setElement(e);
        if(root == null){
            root = newNode;
            size++;
        } else {
            TreeNode<E> focusNode = root;
            while (e.compareTo(focusNode.getElement()) != 0) {
                newNode.setParent(focusNode);
                if (e.compareTo(focusNode.getElement()) < 0) {
                    if (focusNode.getLeft() == null) {
                        //System.out.println(focusNode.getElement());
                        focusNode.setLeft(newNode);
                        size++;
                        return;
                    } else
                        focusNode = focusNode.getLeft();
                } else {
                    if (focusNode.getRight() == null) {
                        focusNode.setRight(newNode);
                        size++;
                        return;
                    } else
                        focusNode = focusNode.getRight();
                }
            }
            System.out.println("Node already in tree, no duplicates!");
        }
    }

    public boolean delete(E e) {
        /*
        Stack<TreeNode> in = new Stack<TreeNode>();
        Stack<TreeNode> post = new Stack<TreeNode>();
        TreeNode current = root;

        if(root==null){
            return true;
        }
        else{
            in.push(root);

            while(in.isEmpty()==false){

            }
        }
        */
        return true;
    }

    // returns the size of the tree
    public int getSize(){ return size; }// end getSize

    // (Implement postorder traversal without using recursion)
    public ArrayList<E>  postorderNoRecursion(){

        /**
         * TODO: INSERT YOUR CODE HERE
         * FIND THE POST ORDER TRAVERSAL OF THE TREE AND RETUN THE RESULT TRAVEL SEQUENCE IN ARRAYLIST postOrderTraversal
         */
        //This code will go from the first node from left of root and place each left node on the "in" Stack
        //Then it will place the node into the "post" Stack when it meets the condition to be in Post Order
        //If the Node does not meet the requirements to be placed into Post order it will be placed back into the stack
        //and the nodes childern will be placed to top of the stack. Continues until stack has no nodes. Repeat on right side.
        //Then all nodes on the final stack will be transfered to an ArrayList
        ArrayList<E> nonRecursivePostorder = new ArrayList<>();
        Stack<TreeNode> post = new Stack<TreeNode>();
        Stack<TreeNode> flipped = new Stack<TreeNode>();
        Stack<TreeNode> in = new Stack<TreeNode>();
        TreeNode current = root;
        TreeNode temp = root;
        if(root==null){
            return null;
        }
        else{
            in.push(root);
        }

        while(in.isEmpty()==false){
            current = in.pop();
            post.push(current);

            if(current.getLeft()!=null){
                in.push(current.getLeft());
            }

                if(current.getRight()!=null){
                in.push(current.getRight());
                }

        }
        while(post.isEmpty()==false){
            nonRecursivePostorder.add((E) post.pop().getElement());
        }

        return nonRecursivePostorder;
    }



    // get the Number of non-leaves.
    // Aram Balayan
    public int getNumberofNonLeaves() {
            int nonleaves = 0;
            Stack<TreeNode> treeStack = new Stack<TreeNode>();
            TreeNode current = root;
            if(root==null){
                return 0;
            }
            else {
                while(true) {
                    while (current != null) {
                        treeStack.push(current);
                        current=current.getLeft();
                    }
                    if(treeStack.isEmpty()){
                        break;
                    }
                    current = treeStack.pop();
                        //check each node for left right nodes & iterate the counter when both are null
                        if(current.getRight()==null && current.getLeft()==null){
                            nonleaves++;
                        }
                        current= current.getRight();
                }
            }

        /**
         * TODO: INSERT YOUR CODE HERE
         * FIND THE NUMBER OF NON_LEAF NODES IN THE TREE AND RETURN
         */
       return nonleaves;
    }

    // By: Jorge Martinez
    //(Implement inorder traversal without using recursion)
    public ArrayList<E>  inorderNoRecursion()
    {
        ArrayList<E> nonRecursiveInorder= new ArrayList<>();

        // Morris' Inorder Traversal Algorithm
        TreeNode<E> current = root;
        TreeNode<E> predecessor;
        while(current != null){
            if(current.left == null){
                nonRecursiveInorder.add(current.getElement());
                current = current.getRight();
            } else {
                predecessor = current.getLeft();
                while(predecessor.getRight() != current && predecessor.getRight() != null){
                    predecessor = predecessor.getRight();
                }
                if(predecessor.getRight() == null){
                    predecessor.setRight(current);
                    current = current.getLeft();
                } else{
                    predecessor.setRight(null);
                    nonRecursiveInorder.add(current.getElement());
                    current = current.getRight();
                }
            }
        }
        return nonRecursiveInorder;
    }

    // traversal with recursion
    public ArrayList<E> inorder() {

        return inOrderTraversal;
    }//end of inorder


    public ArrayList<E> preorder() {
        /**
         * TODO: INSERT YOUR CODE HERE
         * FIND THE PRE ORDER TRAVERSAL OF THE TREE AND RETUN THE RESULT TRAVEL SEQUENCE IN ARRAYLIST preOrderTraversal
         */

        return preOrderTraversal;

    }// end preorder

    //Aram Balayan
    public ArrayList<E> postorder() {

        return postOrderTraversal;
    }

}// end class BST
