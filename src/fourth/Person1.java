package fourth;

public class Person1
{
	private String name;
	private int age;
	
	public Person1(String n,int a) {
		this.name = n;
		this.age = a;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
