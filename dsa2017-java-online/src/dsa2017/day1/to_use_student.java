package dsa2017.day1;

public class to_use_student {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.studentName = "Hải";
		s1.studentBirthday = "2/3/1995";
		s1.studentNumber = "0943123123";
		
		Student s2 = new Student();
		s1.next = s2;
	
		s2.studentName = "Cường";
		s2.studentBirthday = "12/3/1995";
		s2.studentNumber = "0943143124";
		
		Student s3 = new Student();
		s2.next = s3;
	
		s3.studentName = "Đăng";
		s3.studentBirthday = "12/3/1997";
		s3.studentNumber = "0943321321";
		s3.next = null;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
 
}
