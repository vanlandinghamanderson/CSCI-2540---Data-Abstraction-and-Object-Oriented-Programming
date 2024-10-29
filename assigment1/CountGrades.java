/**
 * This program is to ask the user to put the number of grades
 * Then it asks a user to put a number of each grade in the array
 * It adds it up and then finds the average grade
 * @author Anderson VanLandingham
 */
package assg1_vanlandinghama20;

import java.util.Scanner;

public class CountGrades {

	public static void main(String[] args) {
		
		// Asks the user to put the number of grades
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of grades: ");
		int numOfGrades = keyboard.nextInt();
		int[] grades = new int[numOfGrades];
		double sum = 0;
		
		System.out.println();
				
		// It create an array size of numOfGrades
		// It reads the array size that a student to enter a grade
		for (int index = 0; index < numOfGrades; index++)
		{
			System.out.print("Enter a grade: ");
			grades[index] = keyboard.nextInt();
			sum = sum + grades[index];
		}
				
		System.out.println();
				
		// Prints out the average grade
		double average = sum / numOfGrades;
		System.out.println("The average grade is " + average);
				
		System.out.println();
		System.out.println("The grades above the average are:" );
				
		// If the grades is greater than the average
		// then it prints the high grade above the average
		int totalNum = 0;
		for (int x = 0; x < numOfGrades; x++) 
		{
			if (grades[x] > average) 
			{
				totalNum++;
				System.out.println(grades[x]);
			}
		}
		
		System.out.println("for a total of " + totalNum + " grades");
				
		keyboard.close();

	}

}
