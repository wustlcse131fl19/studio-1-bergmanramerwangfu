package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String name1 = ap.nextString("What's your name?");
		String name2 = ap.nextString("What's your name?");
		String name3 = ap.nextString("What's your name?");
		String name4 = ap.nextString("What's your name?");

		String s0 = ap.nextString(name1 + ", how are you feeling?");
		String s1 = ap.nextString(name2 + ", how's your day been?");
		String s2 = ap.nextString(name3 + ", are you doing well?");
		String s3 = ap.nextString( name4 + ", please give me good news...");

		System.out.println("Have a nice day, " + name1 + " ," + name2 + " ," + name3 + " ,and " + name4+ "!");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
