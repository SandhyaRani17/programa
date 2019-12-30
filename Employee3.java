class Employee3 implements java.io.Serializable
{
	private int eid;
	private String name;
	double salary;
	public Employee3(){}
	Employee3(int eid,String name,double salary)
	{
		this.eid=eid; this.name=name; this.salary=salary;
	}
	public void setEid(int eid){this.eid=eid;}
	public void setName(String name){this.name=name;}
	public void setSalary(double salary){this.salary=salary;}
	public int getEid(){return eid;}
	public String getName(){return name;}
	public double getSalary(){return salary;}
}