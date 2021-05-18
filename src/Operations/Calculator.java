package Operations;

public class Calculator {

	public static double addResults(double num1, double num2) {
		return num1 + num2;
	}

	public static double multiplyResults(double num1, double num2) {
		return num1 * num2;
	}

	public static double subtractResults(double num1, double num2) {
		return num1 - num2;
	}

	public static double divideResults(double num1, double num2) {
		double result = 0;

		if (num1 > num2) {
			System.out.println("The division cannot be performed");
		} else {
			result = num1 / num2;
		}

		return result;
	}

}
