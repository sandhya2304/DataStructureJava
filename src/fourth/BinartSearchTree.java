package fourth;

public class BinartSearchTree 
{
	private Node root;
	
	public BinartSearchTree() {
		root = null;
	}
	
	public boolean insert(Person1 item)
	{
		Node n =new Node();
		n.data = item;
		n.leftChild = null;
		n.RightChild = null;
		
		if(root == null)
		{
			root = n; //here node assign to root
			return true;
		}
		
		Node parent= root; //get here both refrence of root node
		Node child = root;
		
		while(child!=null)
		{
			parent = child ;
			
			if(item.getName().compareTo(child.data.getName()) < 0)
			{
				child = child.leftChild;
			}else
			{
				child = child.RightChild;
			}	
		}
		if(item.getName().compareTo(parent.data.getName()) < 0)
		{
			parent.leftChild = n;
		}else
		{
			parent.RightChild = n;
		}
			
		return true;
	}
	
	public Node FindNode(String key)
	{
		Node  c= root;
		while(c!=null)
		{
			if(key.compareTo(c.data.getName()) == 0)
			{
				break;
			}if(key.compareTo(c.data.getName()) < 0)
			{
				c = c.leftChild;
			}else
			{
				c= c.RightChild;
			}
		}
		return c;
		
	}
	
	public Node findParent(String key)
	{
		Node p = root;
		Node c = root;
		
		do
		{
			if(key.compareTo(c.data.getName())==0)
			{
				break;
			}
			p = c;
			
			if(key.compareTo(c.data.getName())<0)
			{
				c= c.leftChild;
			}else
			{
				c = c.RightChild;
			}	
		}while(c!=null);
		System.out.println(">>"+p.data.getName());
		
		if(c!=null)
		{
			return p;
		}else
		{
			return null;
		}
		
	}
	
	
	public Person1 getData(Node n)
	{
		return n.data;
	}
	
	
	
	//using recursion to iterate 
	public void showAll(Node n)
	{
		Node p = n; //here get the refence of node
		if(p!=null)
		{
			System.out.print("   "+p.data);
			showAll(p.leftChild);
			showAll(p.RightChild);
		}
		
	}
	

	class Node
	{
		private Node leftChild;
		private Node RightChild;
		private Person1 data;
	}
	
	

}
