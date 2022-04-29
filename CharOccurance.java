package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {
		/*
		 * // Check number of occurrences of a char (eg 'e') in a String
		 * 
		 * String str = "welcome to chennai";
		 * 
		 * // declare and initialize a variable count to store the number of occurrences
		 * 
		 * // convert the string into char array
		 * 
		 * //get the length of the array
		 * 
		 * // traverse from 0 till the array length
		 * 
		 * // Check the char array has the particular char in it
		 * 
		 * // if is has increment the count
		 * 
		 * 
		 * // print the count out of the loop
		 */
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		System.out.println(str);

		// convert the string into char array
		char[] charA = str.toCharArray();
		System.out.println(charA);
		// get the length of the array
		int length = charA.length;
		//Check the char array has the particular char in it
		for (int i = 0; i < length; i++) {
			if (charA[i] == 'e') {
				count++;
				System.out.println(i);
			}
		}
		// print the count out of the loop
		System.out.println("char count: " + count);
	}
}
