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
	public boolean login(ArrayList<Account> accounts,String username, String password)
	{		
		for(Account account: accounts)
		{
			if(account.username.equals(username) && account.password.equals(password))
			{
				return true;
			}			
		}
		return false;
	}	
}
