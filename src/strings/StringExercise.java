package strings;

public class StringExercise {
	
	public static void method0() {
		String str0 = "yesterday it was raining";
		String str1 = "today it is sunny";
		
		String strResult = str1.toUpperCase() + ", "+ str0.toUpperCase();
		
		System.out.println(strResult);
		
		String subString1 = str1.substring(0, 11);
		String subString2 = str0.substring(16, 24);
		
		System.out.println(subString1.toUpperCase() + subString2.toUpperCase());
	}

}
