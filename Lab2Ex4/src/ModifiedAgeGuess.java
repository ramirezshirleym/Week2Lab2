import java.util.Scanner;
import java.util.Random;

public class ModifiedAgeGuess {

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
		
		// Stop scan from awaiting further input
		scan.close();
		
		System.out.println("You guessed: " + ageGuess);
		System.out.println();

		// CONDITIONAL STATEMENTS
		
		if (ageGuess != age) {
			System.out.print("You guessed wrong! ");

			if (ageGuess > age) {
				System.out.println(name + " is younger.");
			} else {
				System.out.println(name + " is older.");
			}

		} else {
			System.out.print("You guessed correctly!");
		}

		System.out.println();
		System.out.println(name + "'s actual age: " + age);

	}

}
