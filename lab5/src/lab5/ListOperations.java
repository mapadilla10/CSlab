package lab5;

/*Marko Padilla
 * CS lab 
 * recursion Assignment
 * 3/06/2018
 */
public class ListOperations {

	public static void main(String[] args){
		MyListOfInts t=null;
		for (int i=0; i<5;i++){
			//int ran = (int) (-100.0* Math.random());
			int ran = i+2;
			t=new MyListOfInts(ran, t);
		}
		System.out.println("All numbers in the list:");
		printMyList(t);
		System.out.println();
		t = null;
		System.out.println("Sum="+sumOfMyList(t));
		System.out.println("Max="+maxOfMyList(t));
		System.out.println("Length="+lengthOfMyList(t));
		t=reverseMyList(t);
		System.out.println("All numbers in the reversed list:");
		printMyList(t);
		System.out.println();
	}
	/* Write a recursive method to print all the numbers separated by spaces.
	This method cannot contain any loop (that is, uses of for, while, do
	while are prohibited).
	 */
	public static void printMyList(MyListOfInts m){
		if(m==null){//if nothing is in m
			return;
		}

		System.out.print(m.firstInt + " ");
		
		printMyList(m.restOfTheInts);
	}

	/* Write a recursive method to retrieve the sum of all the numbers in a list.
	This method cannot contain any loop (that is, uses of for, while, do while
	are prohibited).
	 */

	public static int sumOfMyList (MyListOfInts m){
		if(m==null){//if null then nothing can be sum.
			System.out.println("empty");
			return 0;
		}
		return m.firstInt + sumOfMyList(m.restOfTheInts);
	}
	/* Write a recursive method to retrieve the largest number from the list.
	Assume that there is at least one number in the given list when the method
	is called from the main function. This method cannot contain any loop (that
	is, uses of for, while, do while are prohibited).
	 */

	public static int maxOfMyList (MyListOfInts m){
		int largest= Integer.MIN_VALUE;
		if(m==null){
			return largest;	
		}
		return Math.max(m.firstInt, maxOfMyList (m.restOfTheInts));
	}

	/* Write a recursive method to compute the length of a list.
	This method cannot contain any loop (that is, uses of for, while, do while
	are prohibited).
	 */

	public static int lengthOfMyList (MyListOfInts m){
		if(m==null){
			return 0;
		}
		return 1+lengthOfMyList(m.restOfTheInts);
	}

	/* Write a recursive method named reverseMyList that will reverse a given
	linked list m. Return the head of the reversed linked list. It is fine
	if you need to modify the given linked list to obtain the reversed one.
	The method reverseMyList may not contain any loop.
	 */

	public static MyListOfInts reverseMyList (MyListOfInts m){

		if(m == null || m.restOfTheInts == null){           //if has nothing || has one 
			return m;
		}
		MyListOfInts rev = reverseMyList(m.restOfTheInts); //first  to last

		m.restOfTheInts.restOfTheInts = m;
		m.restOfTheInts = null;                             //restOf is now the head
		return rev;


	}
}
