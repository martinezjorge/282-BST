import java.util.ArrayList;

/**
 * NAME: Tree.java
 * Description: interface with abstract methods

 */

public interface TreeInterface<E>{

    /** Return true if the element is in the tree */
    public boolean search(E e);

    /** Insert element o into the binary tree
     * Return true if the element is inserted successfully */
    public void insert(E e);

    /** Delete the specified element from the tree
     * Return true if the element is deleted successfully */
    public boolean delete(E e);

    /** Inorder traversal from the root*/
    public ArrayList<E> inorder();

    /** Postorder traversal from the root */
    public ArrayList<E> postorder();

    /** Preorder traversal from the root */
    public ArrayList<E> preorder();

    /** Get the number of nodes in the tree */
    public int getSize();

    /** Return true if the tree is empty */
    public boolean isEmpty();
    /** Return inorder traversal using stack i.e. without using recursion */
    public ArrayList<E>  inorderNoRecursion() ;
    /** Return postorder traversal using stack i.e. without using recursion */
    public ArrayList<E>  postorderNoRecursion() ;
}// end interface Tree
