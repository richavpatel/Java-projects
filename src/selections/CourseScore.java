
/* Richa Patel


 

*  CIS 2212 Tuesdays Fall 2018
*  Lab 01 - Course Score
*  Due August 28, 2018 
*/

package selections;

import java.util.Scanner;

public class CourseScore {

	public static void main(String[] args) {
		
		double courseOneTotalPoints;
		double courseOneTotalEarned;
		double courseTwoTotalPoints;
		double courseTwoTotalEarned;
		double courseThreeTotalPoints;
		double courseThreeTotalEarned;
		double courseFourTotalPoints;
		double courseFourTotalEarned;
		
		Scanner in = new Scanner(System.in);
		
		// Course One
		System.out.print("Max Score 1: ");    
		courseOneTotalPoints = in.nextDouble();   
        System.out.print("Earned Score 1: "); 
        courseOneTotalEarned = in.nextDouble();
        
        //Course Two
        System.out.print("Max Score 2: ");    
		courseTwoTotalPoints = in.nextDouble();   
        System.out.print("Earned Score 2: "); 
        courseTwoTotalEarned = in.nextDouble();
        
        //Course Three
        System.out.print("Max Score 3: ");    
		courseThreeTotalPoints = in.nextDouble();   
        System.out.print("Earned Score 3: "); 
        courseThreeTotalEarned = in.nextDouble();
        
        //Course Four
        System.out.print("Max Score 4: ");    
		courseFourTotalPoints = in.nextDouble();   
        System.out.print("Earned Score 4: "); 
        courseFourTotalEarned = in.nextDouble();
        
        double sumOfMaxScore = courseOneTotalPoints + courseTwoTotalPoints + courseThreeTotalPoints + courseFourTotalPoints;
        double sumOfEarned = courseOneTotalEarned + courseTwoTotalEarned + courseThreeTotalEarned + courseFourTotalEarned;
        
        System.out.println("Points Earned: " + sumOfEarned);
        System.out.println("Total Possible: " + sumOfMaxScore );
        
        double courseScore = (sumOfEarned / sumOfMaxScore) * 100 ;
        System.out.println("Course Score: " + courseScore + "%");
        
        /**
         * Determining grade based on coursescore.
         * 
         */
        if(courseScore >= 90) {
        	System.out.println("Letter Grade: A");
        }
        else if(courseScore >=80 && courseScore < 90) {
        	System.out.println("Letter Grade: B");
        }
        else if(courseScore >=70 && courseScore < 80) {
        	System.out.println("Letter Grade: C");
        }
        else if(courseScore >=60 && courseScore < 70) {
        	System.out.println("Letter Grade: D");
        }
        else {
        	System.out.println("Letter Grade: F");
        } // end if
        
        in.close(); 
	} // end main

}
