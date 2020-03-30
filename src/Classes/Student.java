package Classes;


public class Student extends Person
{
	public String group;
	
	public Student(int id,String firstName,String lastName,String birthDate,String group) 
	{
		super(id,firstName,lastName,birthDate);
		this.group = group;
	}
	public String getGroup()
	{
		return group;
	}
	public void setGroup(String group)
	{
		this.group = group;
	}
}
