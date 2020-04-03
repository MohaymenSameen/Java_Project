package Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Classes.Student;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MenuItem
{
	public TableView<Student> displayStudent(ObservableList<Student> students)
	{	
		TableView<Student> tableView = new TableView<>();
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		TableColumn<Student, String> id = new TableColumn<>("Id");
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		TableColumn<Student, String> firstName = new TableColumn<>("First Name");
		firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		
		TableColumn<Student, String> lastName = new TableColumn<>("Last Name");
		lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		
		TableColumn<Student, String> dateOfBirth = new TableColumn<>("Date Of Birth");
		dateOfBirth.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
		
		TableColumn<Student, String> group = new TableColumn<>("Group");			
		group.setCellValueFactory(new PropertyValueFactory<>("group"));			
		
		tableView.getColumns().addAll(id,firstName,lastName,dateOfBirth,group);
		
		tableView.setItems(students);
		
		return tableView;		
	}
	public TableView<Student> displayResults(ObservableList<Student> students)
	{	
		TableView<Student> tableView = new TableView<>();		
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		TableColumn<Student, String> id = new TableColumn<>("Id");
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		TableColumn<Student, String> firstName = new TableColumn<>("First Name");
		firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		
		TableColumn<Student, String> lastName = new TableColumn<>("Last Name");
		lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		
		TableColumn<Student, String> dateOfBirth = new TableColumn<>("Date Of Birth");
		dateOfBirth.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
		
		TableColumn<Student, String> group = new TableColumn<>("Group");			
		group.setCellValueFactory(new PropertyValueFactory<>("group"));		
		
		TableColumn<Student, String> java = new TableColumn<>("Java");			
		java.setCellValueFactory(new PropertyValueFactory<>("gradeJava"));			
		
		TableColumn<Student, String> csharp = new TableColumn<>("C#");			
		csharp.setCellValueFactory(new PropertyValueFactory<>("gradeCsharp"));	
		
		TableColumn<Student, String> php = new TableColumn<>("Php");			
		php.setCellValueFactory(new PropertyValueFactory<>("gradePhp"));	
		
		TableColumn<Student, String> python = new TableColumn<>("Python");			
		python.setCellValueFactory(new PropertyValueFactory<>("gradePython"));			
		
		tableView.getColumns().addAll(id,firstName,lastName,dateOfBirth,group,java,csharp,php,python);
		
		tableView.setItems(students);
		
		return tableView;		
	}
	public TableView<Teacher> displayTeacher(ObservableList<Teacher> teachers)
	{	
		TableView<Teacher> tableView = new TableView<>();
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		TableColumn<Teacher, String> id = new TableColumn<>("Id");
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		TableColumn<Teacher, String> firstName = new TableColumn<>("First Name");
		firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		TableColumn<Teacher, String> lastName = new TableColumn<>("Last Name");
		lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		TableColumn<Teacher, String> dateOfBirth = new TableColumn<>("Date Of Birth");
		dateOfBirth.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
		TableColumn<Teacher, String> salary = new TableColumn<>("Salary");			
		salary.setCellValueFactory(new PropertyValueFactory<>("salary"));		
			
		tableView.getColumns().addAll(id,firstName,lastName,dateOfBirth,salary);
		
		tableView.setItems(teachers);
		
		return tableView;
		
	}
	
}
