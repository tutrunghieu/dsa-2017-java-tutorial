package dsa2017.day6;

public class to_get_last_names {

	public static void main(String[] args) 
	{
		String path = "C:/Users/henrytu/git/dsa-2017-java-tutorial";
		String last_seg = last(path);
		System.out.println(last_seg);
	}

	private static String last(String path) 
	{
		int p = path.lastIndexOf('/');
		return path.substring(p+1);
	}

}
