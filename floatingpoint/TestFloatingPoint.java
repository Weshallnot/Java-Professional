package com.demo.floatingpoint;

public class TestFloatingPoint {

	public static void main(String[] args) {

		double oneThird = 1.0 / 3.0;
		double one = oneThird * 3;
		System.out.println(one == 1.0);

		float floatVal = 0.1f;
		double doubleVal = 0.1;
		double doubleValCopy = floatVal;

		System.out.println(floatVal); // 0.1
		System.out.println(doubleVal); // 0.1
		System.out.println(doubleValCopy); // 0.10000000149011612

		System.out.println(floatVal == doubleVal); // false
		System.out.println(doubleVal == doubleValCopy); // false

		double[] doubles = {1.0, 1.0001, 1.0000001, 1.000000001, 1.0000000000001};
		double[] deltas = {0.01, 0.00001, 0.0000001, 0.0000000001, 0};

		// loop through all of deltas initialized above
		for (int j = 0; j < deltas.length; j++) {
			double delta = deltas[j];
			System.out.println("delta: " + delta);

			// loop through all of the doubles initialized above
			for (int i = 0; i < doubles.length - 1; i++) {
				double d1 = doubles[i];
				double d2 = doubles[i + 1];
				boolean result = deltaCompare(d1, d2, delta);
				System.out.println("" + d1 + " == " + d2 + " ? " + result);

			}
			System.out.println();

		}


		/************** Formatting the floating point values **************/

		//Two digits in fracttional part are rounded
		String format1 = String.format("%.2f", 1.2399);
		System.out.println(format1); // "1.24"
		
		// three digits in fractional part are rounded
		String format2 = String.format("%.3f", 1.2399);
		System.out.println(format2); // "1.240"

		//rounded to two digits, filled with zero
		String format3 = String.format("%.2f", 1.2);
		System.out.println(format3); // returns "1.20"

		//rounder to two digits
		String format4 = String.format("%.2f", 3.19999);
		System.out.println(format4); // "3.20"

	}

	private static boolean deltaCompare(double v1, double v2, double delta) {
		// return true iff the difference between v1 and v2 is less than delta
		return Math.abs(v1 - v2) < delta;
	}


}
