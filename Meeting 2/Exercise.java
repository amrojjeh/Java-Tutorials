import java.io.PrintStream;

// Exercise: Add all the numbers ranging from 0 to x. If x is negative, return 0
public class Exercise
{
	// This method should NOT use recursion! Only for loops.
	public static int summation(int x)
	{
		return 0;
	}

	// Use recursion! For an extra-challenge, make sure it utilizes tail recursion.
	// Tip: You're allowed to crate a method overload for the tail recursion
	public static int summationRecursion(int x)
	{
		return 0;
	}

	// === DO NOT MODIFY THE CODE BELOW ===
	public static void testSummation(int x, int expected)
	{
		int actual = summation(x);
		System.out.println(String.format("summation(%d) = %d : %s (%d)", x, expected, expected == actual ? "SUCCESS!" : "FAILURE!", actual));
	}

	public static void testSummationRecursion(int x, int expected)
	{
		int actual = summationRecursion(x);
		System.out.println(String.format("summationRecursion(%d) = %d : %s (%d)", x, expected, expected == actual ? "SUCCESS!" : "FAILURE!", actual));
	}

	public static void main(String[] args)
	{
		// Testing if methods are working properly
		System.out.println("=== FOR LOOP FUNCTION ===");
		long start = System.currentTimeMillis();
		testSummation(0, 0);
		testSummation(1, 1);
		testSummation(2, 1 + 2);
		testSummation(5, 1 + 2 + 3 + 4 + 5);
		testSummation(-1, 0);
		System.out.println("It took " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("=== RECURSIVE FUNCTION ===");
		start = System.currentTimeMillis();
		testSummationRecursion(0, 0);
		testSummationRecursion(1, 1);
		testSummationRecursion(2, 1 + 2);
		testSummationRecursion(5, 1 + 2 + 3 + 4 + 5);
		testSummationRecursion(-1, 0);
		System.out.println("It took " + (System.currentTimeMillis() - start) + "ms");
	}
}