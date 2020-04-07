package Classes;

import Enum.CourseType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Student extends Person
{
	public String group;
	public ObservableList<Course> results;	
	public CourseType courseName;
	public int gradeJava;
	public int gradeCsharp;
	public int gradePhp;
	public int gradePython;
	
	public Student() {};
	public Student(int id,String firstName,String lastName,String birthDate,String group)
	{
		super(id,firstName,lastName,birthDate);
		this.group = group;
	}
	public Student(int id,String firstName,String lastName,String birthDate,String group,int gradeJava,int gradeCsharp,int gradePhp, int gradePython) 
	{
		super(id,firstName,lastName,birthDate);
		this.group = group;	
		this.gradeJava = gradeJava;	
		this.gradeCsharp = gradeCsharp;	
		this.gradePhp = gradePhp;	
		this.gradePython = gradePython;	
		this.results = results();
	}	
	public ObservableList<Course> results()
	{
		results = FXCollections.observableArrayList();
		results.add(new Course(CourseType.JAVA,gradeJava));
		results.add(new Course(CourseType.CSHARP,gradeCsharp));
		results.add(new Course(CourseType.PHP,gradePhp));
		results.add(new Course(CourseType.PYTHON,gradePython));		
		return results;
	}
	
	public int getGradeJava()
	{
		return gradeJava;
	}
	public int getGradeCsharp()
	{
		return gradeCsharp;
	}
	public int getGradePhp()
	{
		return gradePhp;
	}
	public int getGradePython()
	{
		return gradePython;
	}
	public void setGradeJava(int gradeJava)
	{
		this.gradeJava = gradeJava;
	}
	public void setGradeCsharp(int gradeCsharp)
	{
		this.gradeCsharp = gradeCsharp;
	}
	public void setGradePhp(int gradePhp)
	{
		this.gradePhp = gradePhp;
	}
	public void setGradePython(int gradePython)
	{
		this.gradePython = gradePython;
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
