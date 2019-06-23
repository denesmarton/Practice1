public class WhileLoop {
	private static int numberOfStudents;

	public WhileLoop () {
		numberOfStudents = 0;
	}
	
	public void fillClass(int targetClassSize)
	{
		while (numberOfStudents < targetClassSize)
		{
			numberOfStudents++;
			System.out.println(numberOfStudents);
			
		}
	}
	public void waitForClass (int targetClassSize)
		{
		for (int i = 1; i <= targetClassSize; i += 2)
			{
			numberOfStudents = numberOfStudents + 1;
			}
		}
public static void main (String[] args)
{
	WhileLoop test = new WhileLoop();	
	test.waitForClass(30);
	System.out.println("The class has " + numberOfStudents + " students.");
		
}
}
