package pack;

public class Person
{
	private String name;
	private String rollno;
	
	public Person(String n,String roll) {
		this.name = n;
		this.rollno = roll;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
	

}
