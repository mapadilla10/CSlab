package lab9;
/*Marko Padilla
 * CS lab 2401
 * practice Queue operations implement by printing, finding largest and reverse order. also queue will double once the min limit has been reached.
 * 4/14/2018
 */
public class Runner {

	public static void main(String[] args) {

		Queue q = new Queue ();
	//enqueue the following
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.enqueue(40);
			q.enqueue(50);
			//print call the methods
		System.out.println("My queue is as follows: ");
		printQueue(q);
		System.out.println("I am going to dequeue one element.");
		q.dequeue();
		System.out.println("My queue is as follows: ");
		printQueue(q);
		System.out.println("I am going to reverse my queue: ");
		System.out.println("My queue is as follows: ");
		reverseQueue(q);
		System.out.println("I am going to enqueue 60.");
		q.enqueue(60);
		System.out.println("My queue is as follows: ");
		printQueue(q);
		System.out.println("I am going to enqueue 70.");
		q.enqueue(70);
		System.out.println("Entered the new item.");
		System.out.println("My queue is as follows: ");
		printQueue(q);
		System.out.println("I am going to reverse my queue: ");
		reverseQueue(q);
		findMaxInQueue(q);
		System.out.println("My queue is as follows: ");
		printQueue(q);
	}
	
//method to print
	public static void printQueue(Queue q) {

		int s = q.size();

		for (int i = 0 ; i < s ; i++) {
			int temp = (int)q.dequeue();
			q.enqueue(temp);

			System.out.print( temp + " ");

		}
		System.out.println();
	}
//find the max value 
	public static void findMaxInQueue(Queue q) {

		int num = (int)q.peek();
//goes through q then if temp is > then num is the largest num
		for (int i=0 ; i<q.size() ; i++) {
			int temp = (int)q.dequeue();
			q.enqueue(temp);
			if(temp>num) {
				num=temp;

			}

		}
		System.out.print("The Largest number in the queue is: "+num);
		System.out.println();
	}
//
	public static void reverseQueue(Queue q) {
		//System.out.println("I am going to reverse my Queue.");

		Object[] nQueue = new Object[q.size()];

		int newSize = q.size();

		for(int i = newSize - 1; i >= 0; i--){
			nQueue[i] = q.dequeue();
		}
		for(int j = 0; j < newSize; j++){
			q.enqueue(nQueue[j]);
			System.out.print(nQueue[j]+" ");
		}
		System.out.println();
	}

}