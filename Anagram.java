package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text = "stops";
		String text1 = "potss"; 
		if (text.length() == text1.length()) 
		{
			for (int i = 0; i < text.length(); i++) {
				char a[] = text.toCharArray();
				char b[] = text1.toCharArray(); 
				Arrays.sort(a);
				Arrays.sort(b);
				if (a[i] == b[i]) {          
					System.out.println("both arrays have "+a[i]);
				}

			}

		}
	}

	}


