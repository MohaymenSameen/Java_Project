package Windows;

import java.io.FileWriter;

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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Menu
{
	public void menuDisplay(Account account)
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
				displayStudents(window,account);				
			}
		});
		Button displayTeachers = new Button("Display Teachers");
		displayTeachers.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				displayTeachers(window,account);				
			}
		});
		Button editStudents = new Button("Add or Edit students");
		editStudents.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				editStudents(window,account);				
			}
		});
		Button downloadReports = new Button("Download Reports");
		downloadReports.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				displayStudents(window,account);				
			}
		});
		
		if(account.accessType == AccessType.ADMIN)
		{
			
			menu.getChildren().addAll(displayStudents,editStudents,displayTeachers,downloadReports);
		}	
		else if(account.accessType == AccessType.EDITOR)
		{
			
			menu.getChildren().addAll(displayStudents,displayTeachers,editStudents);
		}
		else
		{
			menu.getChildren().addAll(displayStudents,displayTeachers);
		}
		
		window.setScene(scene);
		window.show();
	}
	public void displayStudents(Stage window, Account account)
	{	
		VBox form = new VBox();
		
		Button back = new Button("Back");			
		back.setOnAction(actionEvent ->
		{			
			backButton(back,window,account);
		});
		
		form.setPadding(new Insets(10,10,10,10));
		form.setSpacing(10);
		TestData data = new TestData();
		ObservableList<Student> db = data.studentList();		
		MenuItem dis = new MenuItem();		
		TableView<Student> view = dis.displayStudent(db,account);		
		
		
		form.getChildren().addAll(view,back);
		Scene scene = new Scene(form,600,600);
		window.setScene(scene);		
	}
	public void editStudents(Stage window, Account account)
	{		
		VBox form = new VBox();
		Button back = new Button("Back");
		TestData data = new TestData();
		ObservableList<Student> db = data.studentList();		
		MenuItem dis = new MenuItem();
		TableView<Student> view = dis.displayStudent(db,account);			
		
		view.setEditable(true);	
		
		back.setOnAction(actionEvent ->
		{			
			backButton(back,window,account);
		});	
		
		form.setPadding(new Insets(10,10,10,10));
		form.setSpacing(10);
		
		Button add = new Button("Add");
		Button delete = new Button("delete");
		
		TextField idInput = new TextField();
		idInput.setPromptText("ID");
		TextField firstNameInput = new TextField();
		firstNameInput.setPromptText("First name");
		TextField lastNameInput = new TextField();
		lastNameInput.setPromptText("Last name");
		TextField birthDateInput = new TextField();
		birthDateInput.setPromptText("Date Of Birth (MM/DD/YYYY)");
		TextField groupInput = new TextField();
		groupInput.setPromptText("group");    
		
		add.setOnAction(actionEvent ->
		{
			int id = Integer.parseInt(idInput.getText());			
			String firstName = firstNameInput.getText();
			String lastName = lastNameInput.getText();
			String birthDate = birthDateInput.getText();
			String group = groupInput.getText();			
			Student student = new Student(id,firstName,lastName,birthDate,group);
			 
			view.getItems().add(student);
			
			idInput.clear();			
			firstNameInput.clear();
			lastNameInput.clear();
			birthDateInput.clear();
			groupInput.clear();			
		});
		delete.setOnAction(actionEvent ->
		{			
			db.remove(view.getSelectionModel().getSelectedItem());			
		});	
		
		form.getChildren().addAll(view,idInput,firstNameInput,lastNameInput,birthDateInput,groupInput,add,delete,back);
		Scene scene = new Scene(form,600,600);
		window.setScene(scene);	
	}	
	public void displayTeachers(Stage window,Account account)
	{
		HBox form = new HBox();
		Button back = new Button("Back");
		back.setOnAction(actionEvent ->
		{			
			backButton(back,window, account);
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
	public void downloadReports(Stage window,Account account)
	{
		TestData data = new TestData();
		ObservableList<Student> students = data.studentList();
		for(Student student: students)
		{
			FileWriter writer = new FileWriter(student.firstName);
			
		}
	}
	public void backButton(Button button,Stage window, Account account)
	{		
		window.close();
		menuDisplay(account);		
	}
}
