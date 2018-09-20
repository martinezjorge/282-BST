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

    // Looks for an item in the tree
    public boolean search(E e){
        TreeNode<E> focusNode = root;
        while(focusNode.getElement().compareTo(e) != 0){
            if(focusNode.getElement().compareTo(e) > 0 ){
                focusNode = focusNode.getLeft();
            } else {
                focusNode = focusNode.getRight();
            }
            if(focusNode == null){
                System.out.print("Node " + e + " not found: ");
                return false;
            }
        }
        System.out.print("Node found: ");
        return true;
    } // end search method

    public void insert(E e) {
        TreeNode<E> newNode = new TreeNode<>();
        newNode.setElement(e);
        //System.out.println(newNode.getElement());
        if(root == null){
            root = newNode;
            size++;
        } else {
            TreeNode<E> focusNode  = root;
            while(focusNode.getElement().compareTo(e) != 0){
                focusNode.setParent(focusNode);
                if(focusNode.getElement().compareTo(e) > 0){
                    if(focusNode.getLeft() == null){
                        focusNode.parent.setLeft(newNode);
                        size++;
                        return;
                    } else
                        focusNode = focusNode.getLeft();
                } else {
                    if(focusNode.getRight() == null){
                        focusNode.parent.setRight(newNode);
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

        // We search for the element that we want to delete
        boolean isItLeftChild = true;
        TreeNode<E> focusNode = root;
        //while(focusNode.getElement() != e){
        while(focusNode.getElement().compareTo(e) != 0){
            focusNode.parent = focusNode;
            if(focusNode.getElement().compareTo(e) > 0){
                focusNode = focusNode.getLeft();
                isItLeftChild = true;
            } else {
                focusNode = focusNode.getRight();
                isItLeftChild = false;
            }
            //System.out.println(focusNode.getElement());
        }

        // If node has no children
        if(focusNode.getLeft() == null && focusNode.getRight() == null){
                focusNode.parent = null;
        // if the node has one child
        } else if(focusNode.getLeft() == null || focusNode.getRight() == null){
            if(isItLeftChild)
                focusNode.parent.setLeft(focusNode.getLeft());
            else
                focusNode.parent.setRight(focusNode.getRight());
        // if the node has two children
        } else {
            //TreeNode<E> s = inorderSuccessor(focusNode);
            if(isItLeftChild)
                focusNode.parent.setLeft(focusNode.getRight());
            else
                focusNode.parent.setRight(focusNode.getLeft());
        }
        size--;
        System.out.print("Node " + e + " was deleted: ");
        return true;
    }

    // helper function to find the inorder successor
    public TreeNode<E> inorderSuccessor(TreeNode<E> replacedNode){
        TreeNode<E> current = replacedNode;
        if(replacedNode.getRight() != null) {
            current.parent = current;
            current = replacedNode.getRight();
            while (current.getLeft() != null) {
                current.parent = current;
                current = current.getLeft();
            }
            return current;
        } else {
            while(current.parent != null){
                if(current == current.parent.getLeft())
                    return current.parent;
                else
                    current = current.parent;
            }
            return null;
        }
    }

    // returns the size of the tree
    public int getSize(){ return size; }// end getSize

    // (Implement postorder traversal without using recursion)
    public ArrayList<E>  postorderNoRecursion()
    {
        ArrayList<E> nonRecursivePostorder= new ArrayList<>();

        return nonRecursivePostorder;
    }



    // get the Number of non-leaves.
    public int getNumberofNonLeaves() {
        /**
         * TODO: INSERT YOUR CODE HERE
         * FIND THE NUMBER OF NON_LEAF NODES IN THE TREE AND RETURN
         */
        return nonleaves;
    }

    //(Implement inorder traversal without using recursion)
    public ArrayList<E>  inorderNoRecursion()
    {
        ArrayList<E> nonRecursiveInorder= new ArrayList<>();

        TreeNode<E> current = root;
        while(current.getLeft() != null) {
            current = current.getLeft();
        }

        while(current != null){
            System.out.println(current.getElement());
            current = inorderSuccessor(current);
        }

        return nonRecursiveInorder;
    }


    // traversal with recursion
    public ArrayList<E> inorder() {

        /*

        */
        return inOrderTraversal;
    }//end of inorder


    public ArrayList<E> preorder() {
        /**
         * TODO: INSERT YOUR CODE HERE
         * FIND THE PRE ORDER TRAVERSAL OF THE TREE AND RETUN THE RESULT TRAVEL SEQUENCE IN ARRAYLIST preOrderTraversal
         */

        return preOrderTraversal;

    }// end preorder


    public ArrayList<E> postorder() {
        /**
         * TODO: INSERT YOUR CODE HERE
         * FIND THE POST ORDER TRAVERSAL OF THE TREE AND RETUN THE RESULT TRAVEL SEQUENCE IN ARRAYLIST postOrderTraversal
         */
        return postOrderTraversal;
    }

}// end class BST
