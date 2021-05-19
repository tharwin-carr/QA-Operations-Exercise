package bookExercise;

public class Person {

	// Attributes

	public String name;
	public int age;
	public String gender;
	public boolean isBreathing;

	// Constructors

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// Methods
	
	public void read(String bookTitle, String msg) {
		System.out.println(this.name  + msg + bookTitle);
	}

}
