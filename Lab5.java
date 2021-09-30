//-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby
// FILENAME: Lab5.java
// SPECIFICATION: Menu choosing between listing all numbers through two chosen numbers or making a triangle out of stars.
// FOR: CSE 110- Lab #5
// TIME SPENT: 1 hour
//-----------------------------------------------------------
//


//import anything you need
import java.util.Scanner;


//declare the class Lab6 <--- you mean Lab5
public class Lab5 {

    //declare the main method
    public static void main(String[] args) {

	// Define scan object of the type Scanner class
	Scanner in = new Scanner(System.in);
	
	// Declare variables for the function.
	int choice = 0;
	
		do{
		//	Print the following options:
			System.out.println("Please choose your choice from following menu");
			System.out.println("1) Print through all integer numbers between two given integers");
			System.out.println("2) Display a pattern - right triangle of stars.");
			System.out.println("3) Quit");
			
		// Use scanner to get user input	
			choice = in.nextInt();
			
			switch(choice)
	  		{
	  			case 1:
	  				int start = 0;
	  				int end = 0;
	  				System.out.println("Enter the first number");
	  				start = in.nextInt();
	  				System.out.println("Enter the last number");
	  				end = in.nextInt();
	  				System.out.print("\n");
	  				
	  				int i = 0;
	  				for(i = start;i <= end; i++) {
	  					System.out.print(i+" ");
	  				}
	  				System.out.print("\n\n");
	  				break;
	  				
	  			case 2:
	  				int height = 0;
	  				System.out.println("\nEnter the height of the triangle of stars:");
	  				height = in.nextInt();
	  				int j = 0;
	  				int k = 0;
	  				for (j = 1;j <= height;j++) {
	  					for(k = 1;k <= j;k++) {
	  						System.out.print("*");
	  					}
	  					System.out.print("\n");
	  				}
	  				System.out.print("\n");
	  				break;

	  			default:
					// A default case that doesn't do anything, but we define it just in case.
	  		}
	   	}while(choice!=3);
			
			
	//	Close the main method
    }	
//Close the Class
}	
		