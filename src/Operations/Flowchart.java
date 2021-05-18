package Operations;

public class Flowchart {

	public static double twoOperations(int num1, int num2, boolean isTrue) {

		if (isTrue) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}

	public static void flowchart1(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
				// THE END
			} else {
				System.out.println("B");
			}
			if (a > 4000) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		} else {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
			} else {
				System.out.println("2");
				// THE END
			} if(a > 600) {
				System.out.println("5");
			} else {
				System.out.println("4");
			} if(a > 500) {
				System.out.println("6");
			} else {
				System.out.println("7");
			}
		}
	}

}
