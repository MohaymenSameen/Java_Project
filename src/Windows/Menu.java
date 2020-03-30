package Windows;

import Classes.MenuItem;
import Classes.Student;
import Test.TestData;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
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
				displayStudents(window);				
			}
		});
		menu.getChildren().addAll(displayStudents);
		window.setScene(scene);
		window.show();
	}
	public void displayStudents(Stage window)
	{	
		HBox form = new HBox();
		Button back = new Button("Back");
		back.setOnAction(actionEvent -> {
			backButton(back);
		});
		form.setPadding(new Insets(10,10,10,10));
		form.setSpacing(10);
		TestData data = new TestData();
		ObservableList<Student> db = data.studentList();
		MenuItem dis = new MenuItem();
		dis.displayStudent(db);		
		form.getChildren().addAll(dis.displayStudent(db),back);
		Scene scene = new Scene(form,600,400);
		window.setScene(scene);		
	}
	public void backButton(Button button)
	{
		button.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				menuDisplay();				
			}
		});
	}
}
