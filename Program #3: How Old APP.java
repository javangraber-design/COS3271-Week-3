//Programmer: Javan Graber
//Date: 9/14/26

package javanproject;

import java.util.Scanner;
public class MyProject {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
    	
    	//Create the variables
        double age, futureAge;
        
        //Get the user input
        System.out.print("How old are you? (Enter as a number) --> ");
        age = userinput.nextDouble();
        futureAge = age + 5;
        
        //Perform the calculations and print
        System.out.print("\n");
        System.out.println("\tIn 5 years you will be " + futureAge + " years old.");
        System.out.println("\tIt is " + (age < 20 && age >= 13) +" that you are a teenager.");
        System.out.println("\tI am such a smart computer.");

    }

}
