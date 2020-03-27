package Classes;

import java.util.ArrayList;
import Test.TestData;
import Classes.Student;
import Classes.Account;

public class Program
{

	public static void main(String[] args)
	{
		TestData data = new TestData();
		Account account = new Account();
		
		ArrayList<Account> accounts = data.accountList();
		account.login(accounts);			
		//ArrayList<Student> students = data.studentList();		
	}

}
