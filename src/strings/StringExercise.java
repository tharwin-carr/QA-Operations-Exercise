package strings;

public class StringExercise {

	public static void method0() {
		String str0 = "yesterday it was raining";
		String str1 = "today it is sunny";

		String strResult = str1.toUpperCase() + ", " + str0.toUpperCase();

		System.out.println(strResult);

		String subString1 = str1.substring(0, 11);
		String subString2 = str0.substring(16, 24);

		System.out.println(subString1.toUpperCase() + subString2.toUpperCase());
	}

	public static int count_Words(String str) {

		// count how many words in a string and print on screen

		int count = 0;


			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}
			}

			count = count + 1;

		return count;

	}

	public static void verticalString(String str) {

		// print out string in vertical fashion
		
		String words = "";
		
		for(int x = 0; x <str.length(); x++) {
			if(str.substring(x, x+1).equals("\s")) {
				words += "\n";				
			} else {
				words += str.substring(x, x+1);
			}
		}
		
		System.out.println(words);
	}
		

}
