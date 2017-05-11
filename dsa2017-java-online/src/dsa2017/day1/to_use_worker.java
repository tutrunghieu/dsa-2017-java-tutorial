package dsa2017.day1;

public class to_use_worker {

	public static void main(String[] args) 
	{
		Worker s1 = new Worker();
		s1.workerName = "Hải";
		s1.workerBirthday = "2/3/1995";
		s1.workerNumber = "0943123123";
		
		Worker s11 = new Worker();
		s1.lower1 = s11;
		
		s11.workerName = "Hải 11";
		s11.workerBirthday = "2/3/1995";
		s11.workerNumber = "0943123124";

		Worker s12 = new Worker();
		s1.lower2 = s12;
		
		s12.workerName = "Hải 12";
		s12.workerBirthday = "2/3/1997";
		s12.workerNumber = "0943123124";
	}

}
