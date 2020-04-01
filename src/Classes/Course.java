package Classes;

import Enum.CourseType;

public class Course
{
	public CourseType courseName;
	public int grade;
	
	public Course(CourseType courseName)
	{
		this.courseName = courseName;
	}
	public Course(CourseType courseName, int grade)
	{
		this.courseName = courseName;
		this.grade = grade;
	}	
	public CourseType getCourseName()
	{
		return courseName;
	}
	public void setCourseName(CourseType courseName)
	{
		this.courseName = courseName;
	}
	public int getGrade()
	{
		return grade;
	}
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
}
