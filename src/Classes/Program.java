package Classes;

import java.util.ArrayList;
import Test.TestData;
import Classes.Student;
import Classes.Account;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Program extends Application
{

	public static void main(String[] args)
	{
		launch();
		//TestData db = new TestData();
		/*for(Student student: db.studentList())
		{
			System.out.println(student.firstName);
		}*/
	}
	public void start(Stage window) throws Exception
	{		
		
		//account.login(accounts);			
		//ArrayList<Student> students = data.studentList();		
		//login();
		displayStudents();
		
	}
	public void login()
	{
		TestData data = new TestData();
		Account account = new Account();		
		ArrayList<Account> accounts = data.accountList();
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
				boolean loggedIn = account.login(accounts,usertext.getText(),passwordField.getText());	
				if(loggedIn == true)
				{
					logIn.setText("You have logged In");
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
	public void displayStudents()
	{
		Stage window = new Stage();
		HBox form = new HBox();
		form.setPadding(new Insets(10,10,10,10));
		form.setSpacing(10);
		TestData data = new TestData();
		ObservableList<Student> db = data.studentList();
		MenuItem dis = new MenuItem();
		dis.displayStudent(db);
		
		form.getChildren().addAll(dis.displayStudent(db));
		Scene scene = new Scene(form,1280,720);
		window.setScene(scene);
		window.show();		
	}
}
