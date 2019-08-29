package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);


		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");

		boolean xVsY = x > y;
		System.out.println(xVsY);

		boolean yVsZ = y > z;
		System.out.println(yVsZ);

		boolean descending = xVsY && yVsZ;
		System.out.println(descending);


		boolean yVsX = y > x;
		System.out.println(yVsX);

		boolean zVsY = z > y;
		System.out.println(zVsY);

		boolean ascending = yVsX && zVsY;
		System.out.println(ascending);

		boolean isOrdered = ascending || descending;
		System.out.println("Is it ascending or descending: " + isOrdered);



	}

}
