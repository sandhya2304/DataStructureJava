package project;

public class StdList 
{
	private Node head;
	
	
	public StdList()
	{
		head = new Node();
		head.next = null;
		head.data = null;
		
	}
	
	public boolean insertStd(Student std)
	{
		Node n= new Node();
		n.data = std;
		n.next = head.next;
		head.next = n;
		
		return true;
	}
	
	public boolean haveRollNo(String rolno)
	{
		Node a = head.next;
		boolean have = false;
		
		while(a!=null)
		{
			if(rolno.equals(a.data.getRollno()))
			{
				have = true;
			}
			a = a.next;
		}
		return have;
	}
	
	public Student fetchData(String rollNo)
	{
		Student data = null;
		Node p = head.next;
		
		while(p!=null)
		{
			if(p.data.getRollno().equals(rollNo))
			{
				data= p.data;
				break;
			}
			p = p.next;
		}
		return data;
	}
	
	public void deleteStudent(String rollNo)
	{
		Node p = head;
		Node q =head.next;
		
		while(q!=null && !(q.data.getRollno().equals(rollNo)))
		{
			p = q;
			q = q.next;
		}
		if(q!=null)
		{
			p.next = q.next;
		}else
		{
			//no data found
		}
		
	}
	
	public void showAll()
	{
		Node x = head.next;
		while(x!=null)
		{
			System.out.println(x.data);
			x = x.next;
		}
		
	}
	
	
	
	class Node
	{
		private Student data;
		private Node next;
	}
	
	
	

}
