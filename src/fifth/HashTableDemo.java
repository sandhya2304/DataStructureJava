package fifth;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args)
	{
		
		Hashtable employee = new Hashtable();
		employee.put("abc",new Double(1345));
		employee.put("def",new Double(2345));
		employee.put("ghi",new Double(3345));
		employee.put("jkl",new Double(4345));
		
		
		Enumeration names= employee.keys();
		
		String str;
		double total = 0.0;
		
		for(int i=0;i<employee.size();i++)
		{
			
			str=(String) names.nextElement();
			total+= (double)employee.get(str);
			
			System.out.println(str+" : "+employee.get(str));
			
		}
		
		System.out.println("Total :"+total);

	}

}
