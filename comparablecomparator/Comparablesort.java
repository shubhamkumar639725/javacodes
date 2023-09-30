import java.io.*;
import java.util.*;

public class Comparablesort {

	static class Student implements Comparable<Student>
	{
		int id ;
		String name;
		int age;

        
		public int compareTo(Student s)
		{
			return s.name.length() - this.name.length() ;
		}

		Student(String name, int age, int id)
		{
			this.name=name;
			this.age=age;
			this.id=id;
		}

		public String toString()
		{
			return name+":"+age+":"+id;
		}


	}

	public static void main(String[] args) throws IOException {
		
     List<Student> list=new ArrayList<Student>();

	 Student s1=new Student("shubham",22,1);
	 Student s2=new Student("saurabh",23,2);
	 Student s3=new Student("aman",12,3);

	 list.add(s1);
	 list.add(s2);
	 list.add(s3);

	 Collections.sort(list);

	 System.out.print(list);




	}
}
