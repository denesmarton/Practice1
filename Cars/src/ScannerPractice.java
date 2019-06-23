import java.util.Scanner;

public class ScannerPractice 
{
	 public static void main(String[] args) 
	 {
		 Scanner in = new Scanner(System.in);   
		 System.out.print("Write numbers, if you write zero, program ends");
		 int n = in.nextInt();
		 int sum = 0;
		 while (n != 0)
		 {
			 System.out.print("Write numbers, if you write zero, program ends");
			 n = in.nextInt();
			 sum += n;
		 }
		 
		 System.out.println(sum);
	 }
}
		 
		 
		 
		 
		/* int s = 0;
	        	while (n != 0) 
	        	{
	        		
	        		n = userInput.nextInt();
	        		
	        		s +=n;
	        	}
	     System.out.println (s);
	 }
}*/
