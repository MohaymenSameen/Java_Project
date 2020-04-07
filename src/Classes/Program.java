package Classes;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import Test.TestData;
import Windows.Login;

public class Program extends Application
{
	public static void main(String[] args)
	{
		launch();	
		/*TestData data = new TestData();
		ObservableList<Account> accounts = data.accountList();		
		Account account = new Account();
		account.accessLevel(accounts);		*/
	}
	public void start(Stage window) throws Exception
	{
		Login loginView = new Login();
		loginView.login();		
	}
	
}
