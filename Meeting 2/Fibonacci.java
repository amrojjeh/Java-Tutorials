import java.util.Timer;

public class Fibonacci 
{
	// f(0) = 0
	// f(1) = 1
	// fib(2) = 0 + 1 = 1
	public static long fib(long x)
	{
		long current = 1;
		long prev = 0;

		if (x <= 0)
			return prev;

		for (long i = 1; i < x; ++i)
		{
			long temp = current;
			current = current + prev;
			prev = temp;
		}

		return current;
	}

	public static long fib_rec(long x)
	{
		if (x <= 0) return 0;
		if (x == 1) return 1;

		return fib_rec(x - 1) + fib_rec(x - 2);
	}

	public static long fib_tail(long x)
	{
		return fib_tail(x, 1, 0);
	}

	// CALL STACK
	public static long fib_tail(long x, long current, long previous)
	{
		if (x <= 0) return previous;
		if (x == 1) return current;

		return fib_tail(--x, current + previous, current);
	}

	public static long recursion(int x, int y)
	{
		if (x <= 0) return y;
		return recursion(--x, y + 1);
	}
 
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		System.out.println(fib_tail(100000));
		System.out.println("It took " + (System.currentTimeMillis() - start) + "ms");
	}
}
