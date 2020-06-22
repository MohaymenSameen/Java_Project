package Windows;

import Classes.Account;
import Classes.UnauthorizedException;
import Test.TestData;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import Windows.Menu;

public class Login
{
	public void login() throws UnauthorizedException
	{
		//getting the data
		TestData data = new TestData();
		ObservableList<Account> accounts = data.accountList();
		Account account = new Account();
		
		Stage window = new Stage();
		window.setTitle("Login Screen");
		
		GridPane gridpane = new GridPane();
		Scene scene = new Scene(gridpane,400,300);
		
		//username 
		Label username = new Label("Username: ");
		gridpane.setPadding(new Insets(60,60,60,60));
		gridpane.setVgap(20); 
		gridpane.setHgap(8); 
		GridPane.setConstraints(username, 1, 1);		
		//username input
		TextField usertext = new TextField();
		GridPane.setConstraints(usertext,2,1);
		
		//password
		Label passField = new Label("Password: ");
		//password input
		PasswordField passwordField = new PasswordField();		
		GridPane.setConstraints(passField,1,2);
		GridPane.setConstraints(passwordField,2,2);
		
		//login button
		Button login = new Button("Log In");
		GridPane.setConstraints(login,2,3); 		
		
		//login 
		Label logIn = new Label();
		GridPane.setConstraints(logIn,2,4);
		
		//THIS IS THE QUESTION ONE OF THE JAVA EXAM
		//login button event
		login.setOnAction(actionEvent->
		{				
			boolean loggedIn = account.login(accounts, usertext.getText(), passwordField.getText());
			try 
			{				
				if(loggedIn == true)
				{
					window.close();
					Menu menu = new Menu();	
					//setting the logged in account as the user account throughout application
					Account userAccount = account.accessLevel(accounts, usertext.getText(), passwordField.getText());	
					System.out.println(userAccount.getAccessType());
					menu.menuDisplay(userAccount);
				}
				else if(usertext.getText().equals("") || passwordField.getText().equals(""))
				{
					throw new UnauthorizedException("Empty username or password");					
				}
				else
				{
					throw new UnauthorizedException("Bad Credentials");					
				}
			}
			catch (UnauthorizedException e)
			{
				logIn.setTextFill(Color.web("#ff0000", 0.8));
				logIn.setText(e.getMessage());				
			}			
		});
		gridpane.getChildren().addAll(username,usertext,passField,passwordField,login,logIn);		
		window.setScene(scene);
		window.show();		
	}	
}
