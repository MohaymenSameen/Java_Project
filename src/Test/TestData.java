package Test;

import java.util.ArrayList;
import Classes.Student;
import Classes.Account;
import Classes.Teacher;
import Enum.AccessType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TestData
{
	public ObservableList<Student> studentList()
	{
		ObservableList<Student> db = FXCollections.observableArrayList();
		
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
	public ObservableList<Teacher> teacherList()
	{
		ObservableList<Teacher> db = FXCollections.observableArrayList();
		
		db.add(new Teacher(11,"David","Taylor","06/15/1965",5200.0));
		db.add(new Teacher(12,"Sophy","Anderson","01/06/1987",3500.0));
		db.add(new Teacher(13,"James","Jordan","03/19/1956",6100.0));
		db.add(new Teacher(14,"Susan","Jackson","12/25/1978",4520.0));
		db.add(new Teacher(15,"Mary","Lee","09/04/1971",5130.0));
		
		return db;
	}
	public ArrayList<Account> accountList()
	{
		ArrayList<Account> db = new ArrayList<Account>();
		
		db.add(new Account("ema","emma12",AccessType.BASIC));
		db.add(new Account("david","david12",AccessType.EDITOR));
		db.add(new Account("ben","ben12",AccessType.ADMIN));		
		
		return db;		
	}
}
