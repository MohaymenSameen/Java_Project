package Classes;

import Enum.AccessType;
import javafx.collections.ObservableList;

public class Account
{
	private String username;
	private String password;
	private AccessType accessType;
	
	public Account() {}
	
	public Account(String username, String password, AccessType accessType)
	{
		this.username = username;
		this.password = password;
		this.accessType = accessType;
	}
	//if account details match test data, return true
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
	//If account details match, return account
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
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public AccessType getAccessType()
	{
		return accessType;
	}
	public void setAccessType(AccessType accessType)
	{
		this.accessType = accessType;
	}
}
