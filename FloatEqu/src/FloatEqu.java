
public class FloatEqu {

	public static void main(String[] args) {

		final double TOLERANCE = 0.000001;

		double v1 = (1.0 / 10) * (1.0 / 10);
		double v2 = (1.0 / 100);

		// Exactly equal
		System.out.println("Is v1 equal or not equal to v2?");

		if (v1 == v2) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}

		System.out.println();

		// Approximately equal
		System.out.println("Is v1 approximately equal to v2?");

		if (Math.abs(v2 - v1) < TOLERANCE) {
			System.out.println("Approximately equal");
		}
	}

}
