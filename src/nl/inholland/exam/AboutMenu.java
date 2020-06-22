package nl.inholland.exam;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AboutMenu
{
	public void Menu() throws IOException
	{
		Stage window = new Stage();
		window.setTitle("About");
		HBox menu = new HBox();
		Scene scene = new Scene(menu,600,400);
		GetTextFile();
		menu.getChildren().addAll(GetTextFile());		
	}
	public Label GetTextFile() throws IOException
	{
		String[] lines = Files.readAllLines(new File("lines.dat").toPath()).toArray(new String[0]);
		Label line = new Label();
		int count = 0;
		for(String l: lines)
		{
			if(count%2 == 0)
			{				
				line.setText(l);
				line.setTextFill(Color.web("#800080", 0.8));
			}
			else
			{
				line.setText(l);
				line.setTextFill(Color.web("#0000FF", 0.8));
			}
		}
		return line;
	}
}
