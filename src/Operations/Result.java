package Operations;

public class Result {

	static double physics = 100;
	static double chemistry = 100;
	static double biology = 112;
	static double total = physics + chemistry + biology;
	static double percentage = total * 100 / 450;
	static double passMark = 60;
	
	public static void markResults() {
		System.out.println("Physics mark: " + physics);
		System.out.println("Chemistry mark: " + chemistry);
		System.out.println("Biology mark: " + biology);
		System.out.println("Total mark: " + total + "/450");
	}
	
	public static void percentageTotal() {
		if(percentage < passMark) {
			System.out.println("You did not pass because your percentage was below the pass mark of 60");
		} else if(physics < passMark) {
			System.out.println("You did not pass because your physics score was below the pass mark of 60");
		} else if(chemistry < passMark) {
			System.out.println("You did not pass because your chemistry is below the pass mark of 60");
		} else if(biology < passMark) {
			System.out.println("You did not pass because your biology is below the pass mark of 60");
		} else {
			System.out.println("You passed");
		}
		
		
		System.out.println("Total Percentage: " + percentage + "%");
	}

}
