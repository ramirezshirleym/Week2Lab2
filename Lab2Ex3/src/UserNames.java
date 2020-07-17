
import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) {

		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);

		String firstName, lastName;

		// Reads User's First Name
		System.out.print("Enter First Name: ");
		firstName = scan.nextLine();

		// Reads User's Last Name
		System.out.print("Enter Last Name: ");
		lastName = scan.nextLine();

		// Stop scan from awaiting further input
		scan.close();

		// COMPUTE USERNAME
		String part1, part2;
		int part3;

		// Username part1: First 4 Letters of the User's Last Name
		part1 = lastName.substring(0, 4);

		// Username part2: First Letter of the User's First Name
		part2 = firstName.substring(0, 1);

		// Username part3: Random # in the range of 10 to 99 inclusive
		Random generator = new Random();
		part3 = generator.nextInt(90) + 10;

		System.out.print("Username: " + part1 + part2 + part3);

	}

}
