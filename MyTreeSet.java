import java.util.*;

public class MyTreeSet 
{

	public static void main(String[] args) 
	{
	TreeSet<Empl> emp1=new TreeSet<Empl>(new MySort());
	emp1.add(new Empl("ankur","C",3000));
	emp1.add(new Empl("amar","B",1000));
	emp1.add(new Empl("aman","A",5000));
	for (Empl t: emp1)
	{
		System.out.println(t);
	}
	TreeSet<Empl> emp2=new TreeSet<Empl>(new MySort1());
	emp1.add(new Empl("ankur","C",3000));
	emp1.add(new Empl("amar","B",1000));
	emp1.add(new Empl("aman","A",5000));
	for (Empl t1: emp2)
	{
		System.out.println(t1);
	}
	
	TreeSet<Empl> emp3=new TreeSet<Empl>(new MySort2());
	emp1.add(new Empl("ankur","C",3000));
	emp1.add(new Empl("amar","B",1000));
	emp1.add(new Empl("aman","A",5000));
	for(Empl t3: emp3)
	{
		System.out.println(t3);
	}
	}

}
