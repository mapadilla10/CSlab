class Runner{
	public static void main(String[] args){
		BST bst = new BST();
		//inserting String values to BST
		bst.insert("Monkey");
		bst.insert("Jaguar");
		bst.insert("Rabbit");
		bst.insert("Platypus");
		bst.insert("Giraffe");
		bst.insert("Klipspringer");
		bst.insert("Vicuna");
		bst.insert("Quokka");
		System.out.println("---------------------------");
		System.out.println("Printing BST:");
		bst.printBT();//print binary search tree method
		System.out.println("---------------------------");
		System.out.print("Total number of nodes: ");
		System.out.println(bst.size());//Get the size of the binary search tree
		System.out.println("---------------------------");
		System.out.println("Printing BST in ascending order:");
		bst.printAscending();//print the binary search tree in ascending order
		System.out.println("---------------------------");
		System.out.println("Printing BST in descending order:");
		bst.printDescending();//print the Binary search tree in descending order
		System.out.println("---------------------------");
		System.out.print("The longest string is: ");
		System.out.println(bst.getLongestString());//Get the longest String
	}
}