package Arrays;

public class ForLoopExercise {
	public static int[] testArray = new int[10];

	public static void process2() {
		for (int x = 0; x < testArray.length; x++) {
			testArray[x] = x + 1;
			System.out.println(testArray[x] + " ");
		}

		for (int x = 0; x < testArray.length; x++) {
			testArray[x] *= 10;
			System.out.println(testArray[x] + " ");
		}

	}

}
