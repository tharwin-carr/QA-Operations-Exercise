package bookExercise;

public class Person {

	// Attributes

	private String name;
	private int age;
	private String gender;

	// Constructors

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// Methods

	public void read(String bookTitle, String msg) {
		System.out.println(this.name + msg + bookTitle);
	}

	// Getters

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getgender() {
		return gender;
	}

	// Setters

	public void setName(String newName) {
		this.name = newName;
	}

	public void setName(int newAge) {
		this.age = newAge;
	}

	public void setGender(String newGender) {
		this.gender = newGender;
	}
}