
import java.util.ArrayList;
import java.util.Stack;

/**
 * NAME: abstractTree.java
 * Description: This is the BST class containing all methods for traversing the tree
 * Author: 
 */


public class  BST<E extends Comparable<E>> implements TreeInterface<E> {

   // Data fields
   public E root;
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
            boolean blResult = false;

            /** TODO: INSERT YOUR CODE HERE 
             * 
             * SEARCH FOR THE ITEM PASSED AS PARAMETER AND RETURN TRUE IF FOUND
             * ELSE RETURN FALSE
             * 
             * 
             */
            return blResult;
   } // end search method



   public void insert(E e) {
         
            /**
             * TODO: INSERT YOUR CODE HERE
             * 
             * INSERT THE ITEM PASSED AS PARAMETER IN THE TREE .
             * HINT: THE NUMBER OF NODE CAN BE UPDATED IN THE "size" VARIABLE
             * 
             */

   }



      public boolean delete(E e) {
            boolean blResult = false;
            /**
             * TODO: INSERT YOUR CODE HERE
             * DELETE THE ITEM PASSED AND REPLACE WITH THE INORDER SUCCESSOR OF THE ELEMENT
             * RETURN true IF ELEMENT FOUND AND DELETED
             * ELSE RETURN false i.e. ITEM NOT FOUND
             *HINT: THE NUMBER OF NODE CAN BE UPDATED IN THE "size" VARIABLE 
             *HINT: SEARCH FOR THE ELEMENT TO BE DELETED AND DELETE THE ELEMENT ONCE FOUND
             * 
             */
            return blResult;
      }

   // returns the size of the tree
   public int getSize(){
            /**
             * TODO: INSERT YOUR CODE HERE
             * FIND THE NUMBER OF NODES IN THE TREE AND STORE THE VALUE IN CLASS VARIABLE "size"
             * RETURN THE "size" VALUE
             * 
             * HINT: THE NMBER OF NODES CAN BE UPDATED IN THE "size" VARIABLE EVERY TIME A NODE IS INSERTED OR DELETED FROM THE TREE. 
             */

      return size;
   }// end getSize

   // (Implement postorder traversal without using recursion)  
   public ArrayList<E>  postorderNoRecursion() 
   {
	   ArrayList<E> nonRecursivePostorder= new ArrayList<>();
	   
	   /**
	       * TODO: INSERT YOUR CODE HERE
	       * FIND THE POST ORDER TRAVERSAL OF THE TREE WITHOUT USING RECURSION AND RETURN THE RESULT TRAVEL SEQUENCE IN ARRAYLIST nonRecursivePostorder
	       */

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
	   
	   /**
	       * TODO: INSERT YOUR CODE HERE
	       * FIND THE IN ORDER TRAVERSAL OF THE TREE WITHOUT USING RECURSION AND RETURN THE RESULT TRAVEL SEQUENCE IN ARRAYLIST nonRecursiveInorder
	       */

	   return nonRecursiveInorder;
   }
   
  
   // traversal with recursion
   public ArrayList<E> inorder() {
	   /**
	       * TODO: INSERT YOUR CODE HERE
	       * FIND THE IN ORDER TRAVERSAL OF THE TREE AND RETUN THE RESULT TRAVEL SEQUENCE IN ARRAYLIST inOrderTraversal
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

