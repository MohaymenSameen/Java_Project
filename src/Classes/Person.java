package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

import Enum.AccessType;
import javafx.collections.ObservableList;

public class Person
{
	public int id;
	public String firstName;
	public String lastName;
	public String birthDate;
	public Account account;
	
	public Person() {}
	public Person(int id, String firstName, String lastName, String birthDate)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;			
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(String birthDate)
	{
		this.birthDate = birthDate;
	}
	public Account getAccount()
	{
		return account;
	}
	public void setAccount(Account account)
	{
		this.account = account;
	}	
	/*public int getAge(String birthDate)
	{		
		String patten = "mm-dd-yyyy";
		SimpleDateFormat format = new SimpleDateFormat(patten);
		String date = format.format(new Date());
		int d1 = Integer.parseInt(format.format(birthDate));
	    int d2 = Integer.parseInt(format.format(date));
	    int age = (d2-d1)/10000;
	    return age;		
	}*/
}
