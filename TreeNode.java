/**
 * NAME: TreeNode.java
 * Description: creates the node with root, left and right children defined
 * 
 */


class TreeNode<E extends Comparable<E>>{
   E element;
   TreeNode<E> left;
   TreeNode<E> right;
   TreeNode<E> parent;

   public TreeNode(){
    
   }


public E getElement() { return element; }


public void setElement(E element) {
	this.element = element;
}


public TreeNode<E> getLeft() {
	return left;
}


public void setLeft(TreeNode<E> left) {
	this.left = left;
}


public TreeNode<E> getRight() {
	return right;
}


public void setRight(TreeNode<E> right) {
	this.right = right;
}

public TreeNode<E> getParent(){ return parent; }

public void setParent(TreeNode<E> parent) { this.parent = parent;}
   
   
   // end TreeNode

}// end class TreeNode
