package pack;

public class MyStack
{
	
	private int[] stack;
	private int size;
	private int top;
	
	
	public MyStack() {
	
		top = -1;
		size= 50;
		stack = new int[50];
		
	}
	
	public MyStack(int size)
	{
		top = -1;
		this.size= size;
		stack = new int[this.size];
				
	}
	
	public boolean push(int item)
	{
		if(!isFull())
		{
			top++;
			stack[top] = item; //set top to index
			return true;
		}else
		{
			return false;
		}
		
		
	}
	
	public int pop()
	{
		
		return stack[top--];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top==stack.length-1);
	}
	
	

}
