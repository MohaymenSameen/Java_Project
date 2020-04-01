package Classes;

import Enum.CourseType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Student extends Person
{
	public String group;
	public ObservableList<Course> courses;
		
	public Student(int id,String firstName,String lastName,String birthDate,String group) 
	{
		super(id,firstName,lastName,birthDate);
		this.group = group;
		this.courses = generateCourses();
	}
	public ObservableList<Course> generateCourses()
	{
		courses = FXCollections.observableArrayList();
		for(CourseType ct: CourseType.values())
		{
			Course course = new Course(ct);
			courses.add(course);			
		}
		return courses;
	}
	public String getGroup()
	{
		return group;
	}
	public void setGroup(String group)
	{
		this.group = group;
	}
}
