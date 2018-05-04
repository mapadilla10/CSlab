/*Marko Padilla
 * CS lab 
 * implementation of stacks, from on postfix form equation from text file.
 * 4/024/2018
 */
public class GenericStack  {

	protected Node top ;
	protected int size ;

	public GenericStack()
	{
		top = null;
		size = 0;
	}    
	
	//is empty
	public boolean isEmpty()
	{
		return top == null;
	}    

	//push to stack
	public void push(int data)
	{
		Node NextP = new Node (data, null);
		if (top == null)
			top = NextP;
		else
		{
			NextP.setLink(top);
			top = NextP;
		}
		size++ ;
	}    

	public Object pop()
	{

		Node pointer = top;
		top = pointer.getLink();
		size-- ;
		return pointer.getData();
	}    

	public void popAll() {
		while(!isEmpty()) {
			pop();
		}
	}

	public Object peek()
	{
		return top.getData();
	}    
	
	//to get size
	public int Size()
	{
		return size;
	}  

}