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
		
	}
	public void start(Stage window) throws Exception
	{
		Login loginView = new Login();
		loginView.login();		
	}
	
}
