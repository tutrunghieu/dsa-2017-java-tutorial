package dsa2017.day1;

public class Student 
{
	public String studentName;
	
	public String studentBirthday;
	
	public String studentNumber;
	
	public Student next;

	@Override
	public String toString() {
		return "Student [studentName=" 
	+ studentName + ", studentBirthday=" 
	+ studentBirthday + ", studentNumber="
				+ studentNumber + "]";
	}
}
