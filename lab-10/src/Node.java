/*Marko Padilla
 * CS lab 
 * implementation of stacks, from on postfix form equation from text file.
 * 4/024/2018
 */
public class Node {
	//linked list node
	//object
	public Object data;


	public Node previous;


	public Node()
	{
		previous = null;
		data = 0;
	}    

	public Node(Object d,Node n)
	{
		data = d;
		previous = n;
	}    
	//to next node link
	public void setLink(Node n)
	{
		previous = n;
	}    

	public void setData(Object d)
	{
		data = d;
	}    

	public Node getLink()
	{
		return previous;
	}    

	public Object getData()
	{
		return data;
	}

}