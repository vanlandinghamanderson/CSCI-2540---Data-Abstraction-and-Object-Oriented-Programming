/**
 * This program asks the user to enter a date
 * Then the date displays into European form
 * @author Anderson VanLandingham
 */
package assg1_vanlandinghama20;

import java.util.Scanner;

public class DateChange {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// It asks the user to enter a date
		System.out.println("Enter a date in the form mon/day/year: ");
		String date = keyboard.nextLine();
		
		// Gets month
		String month = date.substring(0, date.indexOf("/"));
		
		// Gets day
		String day = date.substring(date.indexOf("/")+1, date.lastIndexOf("/"));
		
		// Gets year
		String year = date.substring(date.lastIndexOf("/")+1);
		
		System.out.println();
		
		//It displays the date in European form
		System.out.println("Your date in European form is: ");
		System.out.println(day + "." + month + "." + year);
		
		keyboard.close();
	
	}

}
