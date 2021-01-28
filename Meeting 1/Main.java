import java.util.Scanner;

public class Main
{
	public static void printHelloWorld()
	{
		System.out.println("This is a test");		
	}

	public static int add(int a, int b)
	{
		int test = a - b;
		return a + b;
	}

	public static void main(String[] args)
	{
		int[] testArray = {1, 2, 3, 4, 5};

		Scanner scanner = new Scanner(System.in);

		int test = scanner.nextInt();

		// for (/* variable declaration */; /* condition */; /* line of code */)
		// {
			// RUNS HEERE FIRST
		// }

		for (int i = 0; i < testArray.length; ++i)
		{
			int element = testArray[i];
			System.out.println(element);
		}

		System.out.println("===ENHANCED FOR LOOP===");

		for (int ee : testArray)
		{
			ee = 2; // It will NOT change the array, only the copy
			System.out.println(ee);
		}

		// // POST FIX:
		test = 2;
		int test2 = test++ + 3; // 5
		// IS EQUIVALENT TO
		test = 2;
		test2 = test + 3;
		test += 1;
		System.out.println(test2);
		// test = 3

		// // PRE FIX
		test = 2;
		test2 = ++test + 3; // 6
		// IS EQUIVALENT TO
		test = 2;
		test += 1;
		test2 = test + 3;
		System.out.println(test2);

	}
}
