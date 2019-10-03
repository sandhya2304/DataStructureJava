package third;

public class testing 
{
	public static void main(String[] args)
	{
		
		SingleLinkedList slist =new SingleLinkedList(1);
		slist.insertItem(2);
		slist.insertItem(3);
		slist.insertItem(4);
		
		
		
		//slis)t.deleteItem(2);
		slist.printList();
		
		System.out.println("After sorting  ");
		slist.sortList();
		
		//slist.deleteAt(2);
		slist.show();
		
		System.out.println("double   ");
		
		DoubleLinkedList dob = new DoubleLinkedList(1);
		dob.insertItem(5);
		dob.insertItem(7);
		
		slist.deleteAt(1);
		
		dob.show();
		
		
	}

}
