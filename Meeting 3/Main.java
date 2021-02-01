
public class Main
{
	public static void main(String[] args)
	{
		// (x, y) = (0, 2)
		Point p1 = new Point(0, 2);

		// (5, 6)
		Point p2 = new Point(5, 6);
		p2.x = 7;

		Point p4 = new Point();
		p4.y = 2;

		Point p3 = p4.add(p2).negate().add(p1).subtract(new Point(5, 5));

		System.out.println(String.format("$%.2f", 12.50));

		System.out.println(p1 + " + " + p2 + " = " + p3);
		System.out.println(Point.amountOfPoints);
	}
}


class Point
{
	double x;
	double y;
	static int amountOfPoints = 0;

	public Point()
	{
		System.out.println("Created a new point");
		++amountOfPoints;
	}

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
		System.out.println("Created a new point");
		++amountOfPoints;
	}

	public Point add(Point other)
	{
		return Point.add(this, other);
	}

	public static Point add(Point p1, Point p2)
	{
		return new Point(p1.x + p2.x, p1.y + p2.y);
	}

	public Point negate()
	{
		return new Point(-1 * this.x, -1 * this.y);
	}

	public Point subtract(Point other)
	{
		return this.add(other.negate());
	}

	@Override
	public String toString()
	{
		return String.format("(%.2f, %.2f)", this.x, this.y);
	}
}
