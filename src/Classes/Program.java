package Classes;

import java.util.ArrayList;
import Test.TestData;
import Classes.Student;
import Classes.Account;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Program extends Application
{

	public static void main(String[] args)
	{
		TestData data = new TestData();
		Account account = new Account();
		
		ArrayList<Account> accounts = data.accountList();
		launch();
		//account.login(accounts);			
		//ArrayList<Student> students = data.studentList();		
		
	}
	public void start(Stage window) throws Exception
	{
		window.setTitle("Login Screen");
		
		GridPane gridpane = new GridPane();
		Scene scene = new Scene(gridpane,300,200);
		
		Label username = new Label("Username: ");
		gridpane.setPadding(new Insets(10, 10, 10, 10));
		gridpane.setVgap(10); // Vertical spacing between grid items
		gridpane.setHgap(8); // Horizontal spacing between grid items
		gridpane.setConstraints(username, 1, 1);
		
		TextField usertext = new TextField();
		gridpane.setConstraints(usertext,2,1);
		
		Label passField = new Label("Password: ");
		PasswordField passwordField = new PasswordField();
		
		String password = passwordField.getText();
		gridpane.setConstraints(passField,1,2);
		gridpane.setConstraints(passwordField,2,2);
		System.out.println(usertext.getText());
		
		Button login = new Button("Log In");
		gridpane.setConstraints(login,2,3); // Right align in the gri
		gridpane.getChildren().addAll(username,usertext,passField,passwordField,login);
		window.setScene(scene);
		window.show();
	}

}
