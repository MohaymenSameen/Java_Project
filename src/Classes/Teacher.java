package Classes;


public class Teacher extends Person
{
	public double salary;
	
	public Teacher(int id, String firstName, String lastName, String birthDate, double salary)
	{
		super(id,firstName,lastName,birthDate);
		this.salary = salary;		
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
}
