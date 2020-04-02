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
	}
	public ObservableList<Course> results(int grade1,int grade2,int grade3,int grade4)
	{
		ObservableList<Course> course = FXCollections.observableArrayList();
		course.add(new Course(CourseType.JAVA,grade1));
		course.add(new Course(CourseType.CSHARP,grade2));
		course.add(new Course(CourseType.PHP,grade3));
		course.add(new Course(CourseType.PYTHON,grade4));
		courses = course;
		
		return course;
	}
	/*public void displayResults(ObservableList<Student> students)
	{
		for(Student student: students)
		{
			System.out.println(student.firstName);
			System.out.println(student.lastName);
			System.out.println(student.birthDate);
			System.out.println(student.group);
			displayCourses(student.courses);
		}
	}
	public void displayCourses(ObservableList<Course> courses)
	{
		for(Course course: courses)
		{
			System.out.println(course.courseName);
			System.out.println(course.grade);
		}
	}*/
	public String getGroup()
	{
		return group;
	}
	public void setGroup(String group)
	{
		this.group = group;
	}
}
