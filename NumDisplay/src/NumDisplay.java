import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {

		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);
		
		int numInt;
		
		// Prompt user to enter # between 0 and 9
		System.out.print("Enter an integer between 0 and 9: ");		
		numInt = scan.nextInt();

		// Stop scan from awaiting further input
		scan.close();

		// Display corresponding word
		switch (numInt) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("Error: you did not enter a number between 0 and 9");
			break;
		}

	}

}
