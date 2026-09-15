//Programmer: Javan Graber
//Date: 9/14/26

package javanproject;

import java.util.Scanner;
public class MyProject {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Create the variables
		String x, y;
				
		//Ask for user input
		System.out.print("Please enter the first number, which will represent x-->");
		x = userinput.nextLine();
		System.out.print("Please enter the second number, which will represent y -->");
		y = userinput.nextLine();
		
		//Print the calculations
		System.out.println("\n");
		System.out.println("\tHere are the calculations based on your input:");
		System.out.println("\tx plus y = " + Integer.toBinaryString(Integer.parseInt(x,2) + Integer.parseInt(y,2)));
		System.out.println("\tx minus y = " + Integer.toBinaryString(Integer.parseInt(x,2) - Integer.parseInt(y,2)));
		System.out.println("\tx multiplied by y = " + Integer.toBinaryString(Integer.parseInt(x,2) * Integer.parseInt(y,2)));
		System.out.println("\tx divided by y = " + Integer.toBinaryString(Integer.parseInt(x,2) / Integer.parseInt(y,2)));
		
		
	}

}
