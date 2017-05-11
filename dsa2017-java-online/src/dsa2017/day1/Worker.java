package dsa2017.day1;

public class Worker 
{
	public String workerName;
	
	public String workerBirthday;
	
	public String workerNumber;
	
	public Worker lower1;
	public Worker lower2;
	public Worker lower3;

	@Override
	public String toString() {
		return "Student [studentName=" 
	+ workerName + ", studentBirthday=" 
	+ workerBirthday + ", studentNumber="
				+ workerNumber + "]";
	}

}
