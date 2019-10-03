package project;

public class HashTable
{
	
	private StdList[] arr;
	private int size;
	private int totalStudents;
	
	public HashTable()
	{
		size  = 1000;
		arr = new StdList[size];		
	}
	
	
	public int toHashCode(String rollNo)
	{
		int addasciis = 0;
		int codeValue = 0;
		
		for(int i= 0 ;i<rollNo.length();i++)
		{
			addasciis = addasciis + (int)rollNo.charAt(i);
		}
		codeValue = addasciis % arr.length;
		return codeValue;
	}
	
	public boolean insert(int key,Student data)
	{
		if(arr[key]==null)
		{
			arr[key] = new StdList();
		}
		arr[key].insertStd(data);
		totalStudents++;
		return true;
	}
	
	public int getTotal()
	{
		return totalStudents;
	}
	
	public Student fetchStudentInfo(String rollNo)
	{
		int key = toHashCode(rollNo);
		if(arr[key] ==null)
		{
			return null;
		}else
		{
			Student q = arr[key].fetchData(rollNo);
			if(q!=null)
			{
				return q;
			}else
			{
				return null;
			}
		}	
	}
	
	
	public boolean deleteStd(String rollNo)
	{
		boolean have = arr[toHashCode(rollNo)].haveRollNo(rollNo);
		if(have)
		{
			int key = toHashCode(rollNo);
			arr[key].deleteStudent(rollNo);
			totalStudents--;
			return true;
		}
		return false;
		
	}
	
	
	public void showData()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				arr[i].showAll();
			}
		}
	}

}
