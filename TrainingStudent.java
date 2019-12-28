class Student1
{
	private int sid;
	private String sname;
	private int age;
	public Student1(){}
	Student1(int sid, String sname,int age)
	{
		this.sid=sid; this.sname=sname; this.age=age;
	}
	public void setSid(int sid){this.sid=sid;}
	public void setSname(String sname){this.sname=sname;}
	public void setAge(int age){this.age=age;}
	public int getSid(){ return sid; }
	public String getSname(){ return sname;}
	public int getAge(){ return age;}
}
class Training
{
	Student1[] s;
	private int trainingid;
	private String trainingname;
	public Training(){}
	Training(int trainingid,String Trainingname,Student1[] s)
	{
		this.trainingid=trainingid; this.trainingname=trainingname; this.s=s;
	}
	public void setStudent1(Student1[] s){this.s=s;}
	public void setTrainingid(int trainingid ){this.trainingid=trainingid;}
	public void setTrainingname(String trainingname){this.trainingname=trainingname;}
	public int getTrainingid(){return trainingid;}
	public String getTrainingname(){ return trainingname;}
	public Student1[] getStudent1(){return s;}
}
class TrainingStudent
{
	public static void main(String args[])
	{
		
		Student1[] s1 = {new Student1(101,"sandhya",19),new Student1(102,"mery",20),new Student1(103,"kavya",20)};
		Training t = new Training(1004,"javatesting",s1);
		
		System.out.println("trainingid"+t.getTrainingid());
		System.out.println("trainingname is"+t.getTrainingname());
		System.out.println("Student details");
		for(int i=0;i<t.s.length;i++)
		{
			System.out.println("sid is"+t.s[i].getSid());
		    System.out.println("name is"+t.s[i].getSname());
		    System.out.println("age is"+t.s[i].getAge());
		}
	}
}

