package lab9;

/*Marko Padilla
 * CS lab 2401
 * practice Queue operations implement by printing, finding largest and reverse order. also queue will double once the min limit has been reached.
 * 4/14/2018
 */
public class Queue{
	private int QUEUE_SIZE = 5;
	private Object[] items;
	private int front, back, count;
	public Queue() {
		items = new Object[QUEUE_SIZE];
		front = 0;
		back = QUEUE_SIZE -1;
		count = 0;
	}
	public boolean isEmpty(){
		return count ==0;
	}
	public boolean isFull(){
		return count == QUEUE_SIZE;
	}
	public void enqueue(Object newItem){
		if (!isFull()){
			back = (back+1) % QUEUE_SIZE;
			items[back] = newItem;
			count++;
			return;
		} else 
			System.out.println("Queue is full. Doubling the size.");
        System.out.println("New max. size is:" + QUEUE_SIZE*2 );
		//double the size	
        QUEUE_SIZE = (QUEUE_SIZE * 2); 
        //put in array
			Object[] temp = new Object[QUEUE_SIZE]; 
        System.arraycopy(items, front, temp, front, items.length - front); 
        if (front != 0) {
            System.arraycopy(items, 0, temp, items.length, front); 
        }
        items = temp; 
        back = front + count;
        items[back] = newItem; 
        count++; 
			
	}
	public Object dequeue(){
		if (!isEmpty()){
			Object queueFront = items[front];
			front = (front+1) % QUEUE_SIZE;
			count--;
			return queueFront;
		}else
			System.out.println("Trying to dequeue from empty queue //reference number 2");
		return null;
	}
	public void dequeueAll(){
		items = new Object[QUEUE_SIZE];
		front = 0;
		back = QUEUE_SIZE -1;
		count =0;
	}
	public Object peek(){
		if (!isEmpty()) {
			return items[front];
		}
		else
			System.out.println("Trying to peek with empty queue //reference number 3 ");
		return null;
	}
	public int size(){
		return count;
	}
}// End of class Queue