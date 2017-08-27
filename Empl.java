import java.util.*;

public class Empl {
	String name;
	String desig;
	int salary;
	
	public Empl(String name,String desig,int salary)
	{
		this.name=name;
		this.desig=desig;
		this.salary=salary;
	}

	public String toString()
	{
		return this.name+ " "+desig+" "+salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
	class MySort implements Comparator<Empl>
		{
		public int compare(Empl e1, Empl e2)
		{
			if(e1.getSalary()>e2.getSalary())
			{
			return 1;
			}
			else
			{
				return -1;
			}
		}
		}
	class MySort1 implements Comparator<Empl>
	{
	public int compare(Empl em1, Empl em2)
		{
			String mp1=em1.getName().toUpperCase();
			String mp2=em2.getName().toUpperCase();
			return mp1.compareTo(mp2);
		}
	}
	
	class MySort2 implements Comparator<Empl>
	{
		public int compare(Empl p1, Empl p2)
		{
			String mp1=p1.getDesig().toUpperCase();
			String mp2=p2.getDesig().toUpperCase();
			return mp1.compareTo(mp2);
		}
	}
		
		
	



