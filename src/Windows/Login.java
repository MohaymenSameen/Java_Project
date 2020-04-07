package Windows;

import java.util.ArrayList;

import Classes.Account;
import Classes.Person;
import Enum.AccessType;
import Test.TestData;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import Windows.Menu;

public class Login
{
	public void login()
	{
		TestData data = new TestData();
		ObservableList<Account> accounts = data.accountList();
		Account account = new Account();
		Person person = new Person();
		Stage window = new Stage();
		window.setTitle("Login Screen");

		
		GridPane gridpane = new GridPane();
		Scene scene = new Scene(gridpane,400,300);
		
		Label username = new Label("Username: ");
		gridpane.setPadding(new Insets(60,60,60,60));
		gridpane.setVgap(20); // Vertical spacing between grid items
		gridpane.setHgap(8); // Horizontal spacing between grid items
		GridPane.setConstraints(username, 1, 1);
		
		TextField usertext = new TextField();
		GridPane.setConstraints(usertext,2,1);
		
		Label passField = new Label("Password: ");
		PasswordField passwordField = new PasswordField();		
		
		GridPane.setConstraints(passField,1,2);
		GridPane.setConstraints(passwordField,2,2);
		
		
		Button login = new Button("Log In");
		GridPane.setConstraints(login,2,3); 		
		
		Label logIn = new Label();
		GridPane.setConstraints(logIn,2,4);
		login.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{	
				boolean loggedIn = account.login(accounts, usertext.getText(), passwordField.getText());
				if(loggedIn == true)
				{
					window.close();
					Menu menu = new Menu();	
					Account userAccount = account.accessLevel(accounts, usertext.getText(), passwordField.getText());	
					System.out.println(userAccount.accessType);
					menu.menuDisplay(userAccount);
				}
				else 
				{
					logIn.setText("Wrong Email/Password Combination");
				}				
			}
		});
		gridpane.getChildren().addAll(username,usertext,passField,passwordField,login,logIn);		
		window.setScene(scene);
		window.show();		
	}
}
