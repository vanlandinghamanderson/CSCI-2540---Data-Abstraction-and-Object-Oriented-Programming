/**
 * This program that asks a user to put multiple non-negative numbers
 * Then it print those numbers in reverse
 * If the number is "-1" it exits out the program
 * @author Anderson VanLandingham
 */
package assg1_vanlandinghama20;

import java.util.Scanner;

public class DigitReverse {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		
		do {
			
			// Asks the user to enter a non-negative number
			System.out.print("Please enter a non-negative integer (-1 to exit): ");
			number = keyboard.nextInt();
			System.out.println();
			
			// If the number is not -1 it will prints the number in reverse order
			if (number != -1) {
				System.out.println("Your number printed in reverse order is: ");
				digitExtract(number);
				System.out.println();
			}
			
		} while (number != -1); //It exits out the program when it is entered -1
		
	}
	
	/**
	 * Reverses a number
	 * @param revNumber - Number to reverse
	 */
	public static void digitExtract(int revNumber) {
		
		// While the reverse number is greater than zero
		// Then it prints the reverse number
		while (revNumber > 0) {
			System.out.println(revNumber % 10);
			revNumber = revNumber/10;
		}
 
	}

}

