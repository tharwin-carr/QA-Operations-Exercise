package Arrays;

public class ArrayExercise {

	public static int exampleArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void process() {
		for (int i : exampleArray) {
			System.out.println(exampleArray[i - 1]);
		}

	}

}
