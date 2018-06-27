package constructor;

public class Employee {
	private int id;
	private String name;
	public Employee(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	void show(){  
	    System.out.println(id+" "+name);  
	}

}
