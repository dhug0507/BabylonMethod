/*
 * Daniel Hug
 * Data Structures
 * Homework 2
 * 10/01/16
 * This class is used to calculate the the square root of a number
 * using the Babylon method.
 */
public class Sqrt {
	
	//Method to compute the square root using the Babylon Method
	public static double getSqrt(double number){
		double error = .0001;
		double s = number; //Initial guess
		
		/*If the initial guess minus the number divided by
		 * the initial guess is greater than the error the
		 * while loop will repeat
		 */
		while((s-number/s) > error){
			s = ((s + number/s)/2); //Average
			System.out.println(s); //prints out the average
			//prints out the current error
			System.out.println("Error: " + (s-number/s));
			
		}
		System.out.println("Error: " + (s-number/s));
		return s;
		
		
	}

	
	
}
