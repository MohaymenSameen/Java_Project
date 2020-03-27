package Test;

import java.util.ArrayList;
import Classes.Student;
import Classes.Account;

public class TestData
{
	public ArrayList<Student> studentList()
	{
		ArrayList<Student> db = new ArrayList<Student>();
		
		db.add(new Student(1,"Emma","Smith","12/04/1997","IT-02-A"));
		db.add(new Student(2,"Jack","Brown","08/07/1993","IT-02-A"));
		db.add(new Student(3,"Michael","Gracia","11/01/1999","IT-02-A"));
		db.add(new Student(4,"Lisa","Jones","04/29/2000","IT-02-A"));
		db.add(new Student(5,"John","Miller","10/27/2001","IT-02-A"));
		db.add(new Student(6,"Linda","Martinez","01/17/2002","IT-02-A"));
		db.add(new Student(7,"Richard","Davis","09/22/1997","IT-02-A"));
		db.add(new Student(8,"Mark","Lopez","12/09/1996","IT-02-A"));
		db.add(new Student(9,"Debora","Hernandez","02/25/1995","IT-02-A"));
		db.add(new Student(10,"Rick","Moore","03/16/2000","IT-02-A"));
		
		return db;
	}
	public ArrayList<Account> accountList()
	{
		ArrayList<Account> db = new ArrayList<Account>();
		
		db.add(new Account("ema","emma12"));
		
		return db;
		
	}
}
