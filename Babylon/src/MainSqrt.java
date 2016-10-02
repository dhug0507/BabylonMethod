import java.util.Scanner;
public class MainSqrt {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a Number to compute the square root: ");
		double number = keyboard.nextDouble();
		Sqrt babylon = new Sqrt(number);
		double result = babylon.getSqrt(number);
		System.out.println("Answer: " + result);

	}

}
