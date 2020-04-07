package Classes;
import javafx.scene.control.TableColumn.CellEditEvent;
import Classes.Student;
import Enum.AccessType;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

public class MenuItem
{
	TableView<Student> tableView = new TableView<>();
	@SuppressWarnings("unchecked")
	public TableView<Student> displayStudent(ObservableList<Student> students, Account account)
	{		
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);		
		TableColumn<Student, Integer> id = new TableColumn<>("Id");
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		TableColumn<Student, String> firstName = new TableColumn<>("First Name");
		firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));		
		
		TableColumn<Student, String> lastName = new TableColumn<>("Last Name");
		lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));		
		
		TableColumn<Student, String> dateOfBirth = new TableColumn<>("Date Of Birth");
		dateOfBirth.setCellValueFactory(new PropertyValueFactory<>("birthDate"));		
		
		TableColumn<Student, String> group = new TableColumn<>("Group");			
		group.setCellValueFactory(new PropertyValueFactory<>("group"));					
		
		if(account.accessType == AccessType.EDITOR || account.accessType == AccessType.ADMIN)
		{
			tableView.setEditable(true);
			
			editFirstName(firstName);
			editLastName(lastName);
			editDateOfBirth(dateOfBirth);
			editGroup(group);
			
			TableColumn<Student, Integer> java = new TableColumn<>("Java");			
			java.setCellValueFactory(new PropertyValueFactory<>("gradeJava"));			
			editJavaGrade(java);
			
			TableColumn<Student, Integer> csharp = new TableColumn<>("C#");			
			csharp.setCellValueFactory(new PropertyValueFactory<>("gradeCsharp"));		
			editCsharpGrade(csharp);
			
			TableColumn<Student, Integer> php = new TableColumn<>("Php");			
			php.setCellValueFactory(new PropertyValueFactory<>("gradePhp"));	
			editPhpGrade(php);
			
			TableColumn<Student, Integer> python = new TableColumn<>("Python");			
			python.setCellValueFactory(new PropertyValueFactory<>("gradePython"));			
			editPythonGrade(python);
			
			tableView.getColumns().addAll(id,firstName,lastName,dateOfBirth,group,java,csharp,php,python);	
			tableView.setItems(students);
		}
		else
		{
			tableView.getColumns().addAll(id,firstName,lastName,dateOfBirth,group);				
			tableView.setItems(students);
		}
		
		return tableView;		
	}		
	public TableView<Teacher> displayTeacher(ObservableList<Teacher> teachers)
	{	
		TableView<Teacher> tableView = new TableView<>();
		tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		TableColumn<Teacher, Integer> id = new TableColumn<>("Id");
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
	public void editFirstName(TableColumn<Student,String> firstName)
	{
		firstName.setCellFactory(TextFieldTableCell.<Student>forTableColumn());
		firstName.setOnEditCommit
		(
			(CellEditEvent<Student, String> t) ->
				{
			        ((Student) t.getTableView().getItems().get(
		            t.getTablePosition().getRow())
		            ).setFirstName(t.getNewValue());
			}
			);
	}
	public void editLastName(TableColumn<Student,String> lastName)
	{
		lastName.setCellFactory(TextFieldTableCell.<Student>forTableColumn());
		lastName.setOnEditCommit
		(
			(CellEditEvent<Student, String> t) ->
				{
			        ((Student) t.getTableView().getItems().get(
		            t.getTablePosition().getRow())
		            ).setLastName(t.getNewValue());
			}
			);
	}
	public void editDateOfBirth(TableColumn<Student,String> dateOfBirth)
	{
		dateOfBirth.setCellFactory(TextFieldTableCell.<Student>forTableColumn());
		dateOfBirth.setOnEditCommit
		(
			(CellEditEvent<Student, String> t) ->
				{
			        ((Student) t.getTableView().getItems().get(
		            t.getTablePosition().getRow())
		            ).setBirthDate(t.getNewValue());
			}
			);
	}
	public void editGroup(TableColumn<Student,String> group)
	{
		group.setCellFactory(TextFieldTableCell.<Student>forTableColumn());
		group.setOnEditCommit
		(
			(CellEditEvent<Student, String> t) ->
				{
			        ((Student) t.getTableView().getItems().get(
		            t.getTablePosition().getRow())
		            ).setGroup(t.getNewValue());
			}
			);
	}
	public void editJavaGrade(TableColumn<Student,Integer> javaGrade)
	{		
		javaGrade.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		javaGrade.setOnEditCommit
		(
			(CellEditEvent<Student, Integer> t) ->
				{
			        ((Student) t.getTableView().getItems().get(
		            t.getTablePosition().getRow())
		            ).setGradeJava(t.getNewValue());
			}
			);        
	}	
	public void editCsharpGrade(TableColumn<Student,Integer> csharpGrade)
	{		
		csharpGrade.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		csharpGrade.setOnEditCommit
		(
			(CellEditEvent<Student, Integer> t) ->
				{
			        ((Student) t.getTableView().getItems().get(
		            t.getTablePosition().getRow())
		            ).setGradeCsharp(t.getNewValue());
			}
			);        
	}
	public void editPhpGrade(TableColumn<Student,Integer> phpGrade)
	{		
		phpGrade.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		phpGrade.setOnEditCommit
		(
			(CellEditEvent<Student, Integer> t) ->
				{
			        ((Student) t.getTableView().getItems().get(
		            t.getTablePosition().getRow())
		            ).setGradePhp(t.getNewValue());
			}
			);        
	}
	public void editPythonGrade(TableColumn<Student,Integer> pythonGrade)
	{		
		pythonGrade.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		pythonGrade.setOnEditCommit
		(
			(CellEditEvent<Student, Integer> t) ->
				{
			        ((Student) t.getTableView().getItems().get(
		            t.getTablePosition().getRow())
		            ).setGradePython(t.getNewValue());
			}
			);        
	}
}
