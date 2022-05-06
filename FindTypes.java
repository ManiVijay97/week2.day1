package week2.day1.assignments;

public class FindTypes {
	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		char[] a = test.toCharArray();
		
		int letter = 0, space = 0, num = 0, specialChar = 0;

		for (int i = 0; i < test.length(); i++) {

			boolean b;

			if (b = Character.isLetter(a[i]))
		
				letter = letter + 1;

			else if (b = Character.isDigit(a[i]))
				num = num + 1;

			else if (b = Character.isSpaceChar(a[i]))
				space = space + 1;

			else
				specialChar = specialChar + 1;

		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharacter: " + specialChar);
	}
}