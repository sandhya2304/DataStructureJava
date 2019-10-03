package mysecond;

import pack.Person;

public class TestQueue {

	public static void main(String[] args)
	{
		/*
		 * Queue q = new Queue(); q.enqueue(1); q.enqueue(2); q.enqueue(6);
		 * 
		 * 
		 * q.showAll();
		 */
		
		PersonQueue pp=new PersonQueue();
		pp.enqueue(new Person("naam","2234"));
		pp.enqueue(new Person("neret","2114"));
		
		pp.showAll();
		
	}

}
