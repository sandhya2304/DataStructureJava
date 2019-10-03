package mysecond;

import pack.Person;

public class PersonQueue
{

	private Person[] arr;
	private int total;
	private int size;
	private int front;
	private int rear;
	
	
	public PersonQueue() 
	{
	
		size = 100;
		total = 0;
		front = 0;
		rear= 0;	
		arr = new Person[size];
	}
	
	public PersonQueue(int size) 
	{
		
		this.size = size;
		total = 0;
		front = 0;
		rear= 0;	
		arr = new Person[this.size];
	}
	
	public boolean enqueue(Person item)
	{
		if(isFull())
		{
			return false;
			
		}else
		{
			total++;
			arr[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}
		
		
	}
	
	public Person dequeue()
	{
		Person item = arr[front]; 
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
				System.out.println(" "+arr[f].toString());
				f= (f+1) % size;
			}
		}
	}
	
	
	
}
