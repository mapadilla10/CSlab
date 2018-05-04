public class BST{  
	BTNode root;
	int count;   
	private BTNode curr;
	BST(){}
	BST(String str)
	{
		root = new BTNode(str);
	}
	//
	//
	/**
	@return Number of elements in the binary search tree.
	 */
	private int size(BTNode node){

		int count=0; 
		if(node != null){

			count++;
			count += size(node.left);
			count += size(node.right);
		}
		return count;
	}
	//to return size
	public int size(){
		return size(root);
	}
	//
	//
	/**
   Insert the string in the parameter into the Binary Search Tree.
   @param str
   @return true if insertion is successful.
	 */
	public boolean insert(String str){

		BTNode node = new BTNode(str);
		if(root == null){
			root = node;
			return true;
		}
		else
		{
			curr = root;
			while(curr != null){

				if(curr.left == null){
					curr.left = node;
					return true;
				}
				else
					curr = curr.left;
			}

			{
				if(curr.right== null){
					curr.right = node;
					return true;
				}
				else
					curr = curr.right;
			}
		}
		return false;
	}
	//
	//
	/**
	Print the binary search tree in the format shown in the output in next page.
	 */
	private void printBT(BTNode node){

		if(node == null){
			return;
		}
		System.out.println(node.data);
		printBT(node.left);
		printBT(node.right);
	}
	//print Binary Tree
	public void printBT(){
		printBT(root);
	}
	//
	//
	/**
	Print the elements of the binary search tree in ascending order * (lexicographic order).
	 */
	private void printAscending(BTNode node){

		if(node == null) 
			return;
		printAscending(node.left);
		System.out.println(node.data);
		printAscending(node.right);
	}
	//printAcending
	public void printAscending(){
		printAscending(root);
	}
	//
	//
	/**
	Print the elements of the binary search tree in descending order.
	 */

	private void printDescending(BTNode node){

		if(node == null) 
			return;
		printDescending(node.right);
		System.out.println(node.data);
		printDescending(node.left);//switch right from left to get descending opposite to Ascending
	}
	//printDecenting
	public void printDescending(){
		printDescending(root);
	}
	//
	//
	/**
	Return the longest string of the binary search tree.
	@return the longest string
	 */ 
	String largestString="";
	
	private void gLongestString(BTNode root){

		if (root != null) {
			gLongestString(root.left);

			if (root.data.toString().length() > largestString.length()) {
				largestString = root.data.toString();
			}
			gLongestString(root.right);
		}
	}
	//print getLongestString   
	public String getLongestString(){

		gLongestString(root);
		return largestString;
	}  
}