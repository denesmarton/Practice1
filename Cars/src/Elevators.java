/**
 * This program is my trying to use Booleans as well as scanners
 * @author denes
 *
 */

import java.util.Scanner;


public class Elevators 
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Floor: ");
	int floor = in.nextInt();
	
	// Adjust floor if necessary
	
	int actualFloor;
	if(floor > 13)
	{
		actualFloor = floor - 1;
	}
	else
	{
		actualFloor = floor;
	}
	
	System.out.println("The elevator will travel to actual floor " + actualFloor);
	}
}
