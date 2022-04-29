package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)

		/*
		 * Pseudo Code:
		 * 
		 * Declare the input as Follow String test = "I am a software tester"; a) split
		 * the words and have it in an array b) Traverse through each word (using loop)
		 * c) find the odd index within the loop (use mod operator)
		 * 
		 * d)split the words and have it in an array
		 * 
		 * e)print the even position words in reverse order using another loop (nested
		 * loop) f) Convert words to character array if the position is even else print
		 * the word as it is(concatenate space at the end).
		 * 
		 * 
		 */
		String output = "";
		String rev = "";
		String test = "I am a software tester";
		// a) split the words and have it in an array
		String[] arrStr = test.split(" ");
		// b) Traverse through each word (using loop)
		for (int i = 0; i < arrStr.length; i++) {
			// c) find the odd index within the loop (use mod operator)
			if ((i+1) % 2 == 0) {
				// e)print the even position words in reverse order using another loop (nested
				// loop)
				char[] charArray = arrStr[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; --j) {

					rev = rev + charArray[j];

				}

				output = output+rev + " ";

			} else {
				output = output + arrStr[i] + " ";

			}

		}
		System.out.println(output);

	}

}
