import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

	public static void main(String[] args) {

		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);

		String name;
		int ageGuess, age;
		
		// Generate a random integer for the correct age
		Random generator = new Random();
		age = generator.nextInt(101);

		// Read in the name entered by user
		System.out.print("Enter a name: ");
		name = scan.nextLine();

		// Read in the age guess entered by user
		System.out.print("Guess " + name + "'s age:");
		ageGuess = scan.nextInt();
		
		System.out.println();
		System.out.println("You guessed: " + ageGuess);
		System.out.println(name + "'s actual age is: " + age);

		// Stop scan from awaiting further input
		scan.close();

	}

}
