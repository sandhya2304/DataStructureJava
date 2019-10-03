package third;

import third.LinkedListNaven.Node;

public class SingleLinkedList 
{
	private Node head;
	
	public SingleLinkedList(int item)
	{
		head = new Node();
		head.value = item;
		head.next = null; 
	}
	
	
	public boolean insertItem(int item)
	{
		Node n= new Node();
		n.value = item;
		n.next = head;
		head = n;
		return true;
	}
	
	public void printList()
	{
		Node node = head;
		while(node!=null)
		{
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.value);
			node = node.next;
		}
		
		
	}
	//link = next and data = value
	public void sortList()
	{
		int c = 0;
		Node a = head.next;
		while(a.next!=null)
		{
			Node b = head.next;
			while(b.next!=null)
			{
				if(b.value < b.next.value)
				{
					c= b.value;
					b.value = b.next.value;
					b.next.value = c;
				}
				b = b.next;
			}
			a = a.next;
		}
		
	}
	
	
	
	
	
	public boolean deleteItem(int item)
	{
		if(head.value == item)
		{
			//leaving first elemenet
			head = head.next;
			return true;
		}else
		{
			Node x = head;
			Node y = head.next;
			while(true)
			{
				if(y==null || y.value == item)
				{
					break;
				}else
				{
					x = y;
					y = y.next;
				}
			}
			if(y!=null)
			{
				x.next = y.next;
				return true;
			}else
			{
				return false;
			}
		}
	}
	public void deleteAt(int index)
	{
		if(index == 0)
		{
			head = head.next;
		}else
		{
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			
			n1 = n.next;
			n.next = n1.next;
			System.out.println("n1 "+n1.value);
		}
		
		
	}
	
	
	
	class Node{
		
		int value;
		Node next;
	}

}
