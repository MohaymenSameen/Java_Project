package Classes;

import java.util.ArrayList;
import Classes.UserInput;

public class Account
{
	public String username;
	public String password;
	
	public Account() {}
	
	public Account(String username, String password)
	{
		this.username = username;
		this.password = password;
	}	
	public Account login(ArrayList<Account> accounts)
	{
		UserInput input = new UserInput();
		String username = input.readString("Enter username: ");
		String password = input.readString("Enter password: ");
		
		for(Account account: accounts)
		{
			if(account.username.equals(username) && account.password.equals(password))
			{
				System.out.print("You have logged in");
			}	
			else
			{
				System.out.print("Please check in details");
			}
		}
		return null;
	}	
}
