package Windows;

import Classes.Account;
import Classes.MenuItem;
import Classes.Student;
import Classes.Teacher;
import Enum.AccessType;
import Test.TestData;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Menu
{
	public void menuDisplay()
	{
		Stage window = new Stage();
		window.setTitle("Menu");
		HBox menu = new HBox();
		Scene scene = new Scene(menu,600,400);
		menu.setPadding(new Insets(10,10,10,10));
		menu.setSpacing(10);
		Button displayStudents = new Button("Display Students");
		displayStudents.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				window.setTitle("Displaying Student");
				displayStudents(window);				
			}
		});
		Button displayTeachers = new Button("Display Teachers");
		displayTeachers.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				displayTeachers(window);				
			}
		});
		Button displayResults = new Button("Display Results");
		displayResults.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				displayResults(window);				
			}
		});
		menu.getChildren().addAll(displayStudents,displayTeachers,displayResults);
		window.setScene(scene);
		window.show();
	}
	public void displayStudents(Stage window)
	{	
		VBox form = new VBox();
		Button back = new Button("Back");
		back.setOnAction(actionEvent ->
		{			
			backButton(back,window);
		});	
		form.setPadding(new Insets(10,10,10,10));
		form.setSpacing(10);
		TestData data = new TestData();
		ObservableList<Student> db = data.studentList();		
		ObservableList<Account> accounts = data.accountList();
		MenuItem dis = new MenuItem();
		Button add = new Button("Add");
		Button delete = new Button("delete");
		
		TextField idInput = new TextField();
		idInput.setPromptText("ID");
		TextField userNameInput = new TextField();
		userNameInput.setPromptText("User name");
		PasswordField passwordInput = new PasswordField();
		passwordInput.setPromptText("Password");
		TextField firstNameInput = new TextField();
		firstNameInput.setPromptText("First name");
		TextField lastNameInput = new TextField();
		lastNameInput.setPromptText("Last name");
		TextField birthDateInput = new TextField();
		birthDateInput.setPromptText("Date Of Birth (MM/DD/YYYY)");
		TextField groupInput = new TextField();
		groupInput.setPromptText("group");
		TableView<Student> view = dis.displayStudent(db);	
		add.setOnAction(actionEvent ->
		{
			int id = Integer.parseInt(idInput.getText());
			String userName = userNameInput.getText();
			String password = passwordInput.getText();
			String firstName = firstNameInput.getText();
			String lastName = lastNameInput.getText();
			String birthDate = birthDateInput.getText();
			String group = groupInput.getText();			
			Student student = new Student(id,firstName,lastName,birthDate,group);
			Account account = new Account(userName,password,AccessType.BASIC);
			
			view.getItems().add(student);
			accounts.add(account);
			
			idInput.clear();
			userNameInput.clear();
			passwordInput.clear();
			firstNameInput.clear();
			lastNameInput.clear();
			birthDateInput.clear();
			groupInput.clear();			
		});
		delete.setOnAction(actionEvent ->
		{			
			db.remove(view.getSelectionModel().getSelectedItem());			
		});	
		form.getChildren().addAll(view,idInput,userNameInput,passwordInput,firstNameInput,lastNameInput,birthDateInput,groupInput,add,delete,back);
		Scene scene = new Scene(form,600,600);
		window.setScene(scene);		
	}
	public void displayResults(Stage window)
	{	
		VBox form = new VBox();
		Button back = new Button("Back");
		back.setOnAction(actionEvent ->
		{			
			backButton(back,window);
		});	
		form.setPadding(new Insets(10,10,10,10));
		form.setSpacing(10);
		TestData data = new TestData();
		ObservableList<Student> db = data.studentList();		
		MenuItem dis = new MenuItem();		
		
		TableView<Student> view = dis.displayResults(db);	
		
		form.getChildren().addAll(view);
		Scene scene = new Scene(form,600,600);
		window.setScene(scene);		
	}
	public void displayTeachers(Stage window)
	{
		HBox form = new HBox();
		Button back = new Button("Back");
		back.setOnAction(actionEvent ->
		{			
			backButton(back,window);
		});	
		
		form.setPadding(new Insets(10,10,10,10));
		form.setSpacing(10);
		TestData data = new TestData();
		ObservableList<Teacher> db = data.teacherList();
		MenuItem dis = new MenuItem();
		dis.displayTeacher(db);		
		form.getChildren().addAll(dis.displayTeacher(db),back);
		Scene scene = new Scene(form,600,400);
		window.setScene(scene);
	}	
	public void backButton(Button button,Stage window)
	{		
		window.close();
		menuDisplay();		
	}
}
