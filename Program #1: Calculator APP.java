//Programmer: Javan Graber
//Date: 9/14/26

package javanproject;

import java.util.Scanner;
public class MyProject {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Create the variables
		double x, y;
		
		//Ask for user input
		System.out.print("Please enter the first number, which will represent x-->");
		x = userinput.nextDouble();
		System.out.print("Please enter the second number, which will represent y -->");
		y = userinput.nextDouble();
		
		
		//Print the calculations
		System.out.println("\n");
		System.out.println("\tThe following calculations are rounded to the hundredths place:");
		System.out.format("\tx plus y = %.2f\n", x + y);
		System.out.format("\tx multiplied by y = %.2f\n", x * y);
		System.out.format("\tx divided by y = %.2f\n", x / y);
		System.out.format("\tx to the power of y = %.2f\n", Math.pow(x, y));
		System.out.format("\tlog base y of the number x = %.2f\n", Math.log(x)/Math.log(y));
		
		
	}

}
