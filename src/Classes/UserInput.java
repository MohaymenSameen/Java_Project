package Classes;

import java.util.Scanner;

public class UserInput
{
	public Scanner scanner() 
	{
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}
	public String readString(String question)
	{
		System.out.print(question);
		String input = scanner().nextLine();
		return input;		
	}
	public int readInt(String question)
	{
		System.out.print(question);
		int input = scanner().nextInt();
		return input;
	}
}
