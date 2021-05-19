package bookExercise;
public class Runner {

	public static void main(String[] args) {
		Book exampleBook = new Book("The Green Pass", 250, "First Edit.");
		
		Person examplePerson = new Person("David", 30, "male");
	
		
		examplePerson.read(exampleBook.title, " is reading the book titled: ");

	}

}
