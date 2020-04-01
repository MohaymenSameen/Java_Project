package Classes;

import java.util.ArrayList;
import Classes.UserInput;
import Enum.AccessType;

public class Account
{
	public String username;
	public String password;
	public AccessType accessType;
	
	public Account() {}
	
	public Account(String username, String password, AccessType accessType)
	{
		this.username = username;
		this.password = password;
		this.accessType = accessType;
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
