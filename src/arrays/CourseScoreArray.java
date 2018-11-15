
/* Richa Patel

  
 *  CIS 2212 Tuesdays Fall 2018
 *  Lab 04 - Course Score in Arrays
 *  Due September 19, 2018   
 */
package arrays;

//import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CourseScoreArray {

	public static void main(String[] args) {

		// create Scanner object for user input
		Scanner input = new Scanner(System.in);

		// getting numbers of assignments
		System.out.print("How many assignments (at least 1): ");
		int number = input.nextInt();
		while (number <= 0) {
			System.out.print("How many assignments (at least 1): ");
			number = input.nextInt();
		}
		System.out.println();

		double[] earnedPoints = ptsEarned(number); // call points earned method
		System.out.println();
		double[] maxPoints = ptsMax(number); // call max points method
		double totalEarned = calcTotalPtsEarned(earnedPoints); // call total number of points earned
		double totalMax = calcTotalPtsMax(maxPoints); // call the total number of maximum points

		displayArray(earnedPoints, maxPoints); // call displayarray method and passing two arguments which are points earned
							// and maxium points

		
		
		System.out.println("\nPoints Earned: " + String.format("%.2f",totalEarned));
		System.out.println("Total Possible: " + String.format("%.2f", totalMax));

		// calculate coursescore using formula
		double courseScore = (totalEarned / totalMax);

		// create an object for percentage formatting
		NumberFormat percentageFormat = NumberFormat.getPercentInstance();
		percentageFormat.setMinimumFractionDigits(2);
		
		
		System.out.println("Course Score: " + (percentageFormat.format(courseScore)));

		// call letter grade earned method
		char r = ltrGrade(courseScore * 100);

		System.out.println("Letter Grade: " + r);
		input.close();

	} // end main

	// create method for points earned
	public static double[] ptsEarned(int numAssignments) {

		Scanner input = new Scanner(System.in);
		// create new array
		double[] assignments = new double[numAssignments];

		// getting earned points for each assignments
		for (int i = 0; i < numAssignments; i++) {

			System.out.print("Earned pts for Assignment #" + (i + 1) + ": ");

			double number = input.nextDouble();
			while (number < 0) {
				System.out.print("Earned pts must be 0 or greater. Please try again: ");
				number = input.nextDouble();
			}
			assignments[i] = number;
		}

		return assignments;

	}

	// create method for maximum points
	public static double[] ptsMax(int numAssignments) {
		Scanner input = new Scanner(System.in);
		double[] assignments = new double[numAssignments];

		// getting maximum possible points
		for (int i = 0; i < numAssignments; i++) {

			System.out.print("Max pts possible for Assignment #" + (i + 1) + ": ");

			double number = input.nextDouble();
			while (number <= 0) {
				System.out.print("Max pts possible must be greater than 0. Please try again: ");
				number = input.nextDouble();
			}

			assignments[i] = number;
		}

		return assignments;

	}

	// create method for calculate total number of points earned
	public static double calcTotalPtsEarned(double[] earnedArray) {
		double calcTotalPtsEarned = 0;
		for (int i = 0; i < earnedArray.length; i++) {
			calcTotalPtsEarned = calcTotalPtsEarned + earnedArray[i];
		}
		return calcTotalPtsEarned;
	}

	// create method for calculate total number of maximum pints
	public static double calcTotalPtsMax(double[] maxArray) {
		double calcTotalPtsMax = 0;
		for (int i = 0; i < maxArray.length; i++) {
			calcTotalPtsMax = calcTotalPtsMax + maxArray[i];
		}
		return calcTotalPtsMax;

	}

	// create method for display array in a array
	public static void displayArray(double[] earnedArray, double[] maxArray) {
		System.out.println("\n\tEarned - Max");
		for (int i = 0; i < earnedArray.length; i++) {
			System.out.print("\t");
			System.out.print(String.format("%.2f",earnedArray[i]));
			System.out.print("\t");
			System.out.println(String.format("%.2f",maxArray[i]));
		}
	}

	// create method for letter grade
	public static char ltrGrade(double percentage) {
		if (percentage >= 90) {
			return 'A';
		} else if (percentage >= 80 && percentage < 90) {
			return 'B';
		} else if (percentage >= 70 && percentage < 80) {
			return 'C';
		} else if (percentage >= 60 && percentage < 70) {
			return 'D';
		} else {
			return 'F';
		}
	} // end letter grade method

} // end class
