package Classes;

import java.util.ArrayList;
import Classes.UserInput;
import Enum.AccessType;
import javafx.collections.ObservableList;

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
	public boolean login(ObservableList<Account> accounts,String username, String password)
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
	public Account accessLevel(ObservableList<Account> accounts, String username, String password)
	{
		Account userAccount = new Account();		
		for(Account account: accounts)
		{
			if(account.username.equals(username) && account.password.equals(password))
			{
				userAccount = account;			
			}
		}
		return userAccount;
	}
	/*public void accessLevel(Account userAccount)
	{		
		if(userAccount.accessType.equals(AccessType.BASIC))
		{				
			System.out.println(userAccount.accessType);
		}
		else if(userAccount.accessType == AccessType.EDITOR)
		{
			System.out.println(userAccount.accessType);
		}
		else
		{
			System.out.println(userAccount.accessType);
		}		
	}*/
}
