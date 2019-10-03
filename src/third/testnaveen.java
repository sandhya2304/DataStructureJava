package third;

public class testnaveen {

	public static void main(String[] args)
	{
		LinkedListNaven list = new LinkedListNaven();
		list.insert(12);
		list.insert(14);
		list.insert(15);
		
		list.insertAtStart(1);
		
		list.insertAtSpecificPosition(2,23);
		
		list.deleteAt(2);
		
		list.show();

	}

}
