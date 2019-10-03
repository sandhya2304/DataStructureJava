package mysecond;

public class Queue
{
	
	private int[] qq;
	private int total;
	private int size;
	private int front;
	private int rear;
	
	
	public Queue() 
	{
	
		size = 100;
		total = 0;
		front = 0;
		rear= 0;	
		qq = new int[size];
	}
	
	public Queue(int size) 
	{
		
		this.size = size;
		total = 0;
		front = 0;
		rear= 0;	
		qq = new int[this.size];
	}
	
	//add item inseide q
	public boolean enqueue(int item)
	{
		if(isFull())
		{
			return false;
			
		}else
		{
			total++;
			qq[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}
		
		
	}
	
	//get item from q
	public int dequeue()
	{
		int item = qq[front]; 
		total--;
		front = (front + 1) % size;
		return item;
		
	}
	
	
	
	public boolean isFull()
	{
		if(size == total)
		{
			return true;
		}else
		{
			return false;
		}	
	}
	
	public void showAll()
	{
		int f = front;
		if(total!=0)
		{
			for(int i=0;i<total;i++)
			{
				System.out.println(" "+qq[f]);
				f= (f+1) % size;
			}
		}
	}
	

}
