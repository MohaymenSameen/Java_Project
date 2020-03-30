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
import Windows.Login;
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
		//displayStudents();
		
		Login loginView = new Login();
		loginView.login();
		
	}	
}
