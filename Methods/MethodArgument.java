/* Write a java program that will input an integer
 * Call a method named "printMumber"....that will print the 
 * integer
 */
 
import java.util.Scanner;
 


public class MethodArgument
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Enter a number");
		x = input.nextInt();
		printNumber(x);
		
		
	}
	
	public static void printNumber(int number)
	{
		
		System.out.println("The number is " + number);
	}
	
}