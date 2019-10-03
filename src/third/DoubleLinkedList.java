package third;

import third.SingleLinkedList.Node;

public class DoubleLinkedList 
{
	
private Node head;
	
	public DoubleLinkedList(int item)
	{
		head = new Node();
		head.value = item;
		head.next = null; 
		head.prev = null;
	}
	
	public boolean insertItem(int item)
	{
		
		Node n = new Node();
		n.value = item;
		n.prev = null;
		head.prev = n;
		n.next = head;
		head = n ;
		
		return true;
	}
	
	public void printList()
	{
		Node node = head.next;
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
		
		private Node prev;
		private int value;
		private Node next;
	}


}
