import java.util.Scanner;

public class AddTwoNo {
	public static void main(String[] args) {
		// declaring primitive variables
		int firstNumber = 10;
		int secondNumber = 20;
		int sum = 0;

		sum = firstNumber + secondNumber;

		System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + sum);

		//declare reference variable of type Scanner
		Scanner input = new Scanner(System.in);

		//Accepts values from the user
		System.out.println("Enter first integer number please ");
		firstNumber = input.nextInt();
		System.out.println("Enter second integer number please ");
		secondNumber = input.nextInt();

		// calculate sum and display result
		sum = firstNumber + secondNumber;

		System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + sum);
	}
}