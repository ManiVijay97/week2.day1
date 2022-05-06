package week2.day1.assignments;

public class Palindrome {
	
	public static void main(String[] args) {
		String a = "madam";
		
		String rev = "";
		for (int i = 0; i < a.length(); i++) 
		{
			char b = a.charAt(i);

			rev = b + rev;
		}

		System.out.println(rev);

		if (a.equals(rev)) 

			System.out.println("the string is a palindrome");
	}

	

}