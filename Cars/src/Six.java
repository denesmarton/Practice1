
public class Six {
	private static int total;
	private int counter;

	public Six () {
		total = 0;
		counter = 0;
	}
	public void addNumbers(int finalNumber)
	{
		while (counter < finalNumber)
		{
			counter +=6 ;
			total = counter + total;
			System.out.println(total);
		}
	}
public static void main (String[] args)
	{
		Six test = new Six();
		test.addNumbers(94);
		System.out.println(total);
	}
	
}
