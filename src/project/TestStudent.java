package project;

public class TestStudent {

	public static void main(String[] args) 
	{
		HashTable hasht = new HashTable();
		
		Student st1= new Student("abc","1",12);
		Student st2= new Student("dbc","2",33);
		Student st3= new Student("fbc","3",19);
		
		int st1key = hasht.toHashCode(st1.getRollno());
		int st2key = hasht.toHashCode(st2.getRollno());
		int st3key = hasht.toHashCode(st3.getRollno());
		
		
		hasht.insert(st1key, st1);
		hasht.insert(st2key, st2);
		hasht.insert(st3key, st3);
		
		//hasht.showData();

		Student ss=hasht.fetchStudentInfo(st1.getRollno());
		if(ss.getName().equals(st2.getName()))
		{
			System.out.println("equal");
		}else {
			System.out.println("not");
		}
	}

}
