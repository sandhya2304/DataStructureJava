package pack;

public class TestStack {

	public static void main(String[] args)
	{
		/*
		 * MyStack my = new MyStack();
		 * 
		 * if(!my.isFull()) { my.push(2); my.push(1); my.push(6); }
		 * 
		 * System.out.println("show-->"+my.pop());
		 * System.out.println("show-->"+my.pop());
		 */
		
		
		Person p1=new Person("ram","123");
		Person p2=new Person("shym","567");
		Person p3=new Person("shym","567");
		
		PersonStack stack=new PersonStack();
		stack.push(p1);
		stack.push(p2);
		stack.push(p3);
		
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
		
	}

}
