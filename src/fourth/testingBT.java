package fourth;

public class testingBT {

	public static void main(String[] args)
	{
		Person1 pp = new Person1("ram",25);
		
		Person1 pp1 = new Person1("1ram",2);
		Person1 pp2 = new Person1("2ram",3);
		Person1 pp3 = new Person1("3ram",4);
		Person1 pp4 = new Person1("4ram",5);
		Person1 pp5 = new Person1("5ram",6);
		Person1 pp6 = new Person1("6ram",27);
		
		
		BinartSearchTree bst =new BinartSearchTree();
		bst.insert(pp);
		bst.insert(pp1);
		bst.insert(pp2);
		bst.insert(pp3);
		bst.insert(pp4);
		bst.insert(pp5);
		bst.insert(pp6);
		
		bst.showAll(bst.FindNode("5ram"));
		
		Person1 p=bst.getData(bst.findParent("3ram"));
		System.out.println(p.toString());

	}

}
