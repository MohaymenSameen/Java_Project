package Classes;

import java.util.ArrayList;
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
		
			TableColumn<Student, String> id = new TableColumn<>("id");
			TableColumn<Student, String> firstName = new TableColumn<>("firstName");
			TableColumn<Student, String> lastName = new TableColumn<>("lastName");
			TableColumn<Student, String> dateOfBirth = new TableColumn<>("birthDate");
			TableColumn<Student, String> group = new TableColumn<>("group");
			
			/*id.setCellValueFactory(new PropertyValueFactory<>("id"));
			firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
			lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
			dateOfBirth.setCellValueFactory(new PropertyValueFactory<>("brithDate"));
			group.setCellValueFactory(new PropertyValueFactory<>("group"));	*/
			
			tableView.getColumns().addAll(id,firstName,lastName,dateOfBirth,group);
			
			tableView.setItems(students);
		
		return tableView;
		
	}
}
