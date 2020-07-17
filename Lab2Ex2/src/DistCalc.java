import java.util.Scanner;
import java.text.DecimalFormat;

public class DistCalc {

	public static void main(String[] args) {
		
		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);
		
		int x1,y1,x2,y2;
		
		System.out.print("Enter x-coordinate of first point: ");
		x1 = scan.nextInt();

		System.out.print("Enter y-coordinate of first point: ");
		y1 = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Enter x-coordinate of second point: ");
		x2 = scan.nextInt();
		
		System.out.print("Enter y-coordinate of secont point: ");
		y2 = scan.nextInt();
		
		// Stop scan from awaiting further input
		scan.close();
		
		
		// Use (x,y) coordinates to calculate distance
		double xDiff, xRad, yDiff, yRad, dist;
		xDiff = (x2 - x1);
		xRad = Math.pow(xDiff, 2);
		
		yDiff = (y2 - y1);
		yRad = Math.pow(yDiff, 2);
	
		dist = Math.sqrt(xRad + yRad);
		
		
		// Round distance to three decimal places, drop insignificant digits
		DecimalFormat fmt = new DecimalFormat("0.###");
		System.out.println();
		System.out.print("The distance between these two points is: " + fmt.format(dist));
		
	}

}
