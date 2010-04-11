/* Write a program that will input 2 integers from the keyboard. 
 * Call a method name "addNumbers" that will recieve the two
 * number as parameters. "addNumbers" will add the 2 numbers and 
 * return the sum to the main method. The main method will print
 * the number and the sum
 */
 
 import java.util.Scanner;
 
 
 public class Add2Numbers
 {
 	public static void main(String[] args)
 	{
 		Scanner input = new Scanner(System.in);
 		int x, y;
 		
 		System.out.println("Enter the first number");
 		x = input.nextInt();
 		
 		System.out.println("Enter the second number");
 		y = input.nextInt();
 	
 		int sum = addNumbers(x, y);
 		System.out.println("result is: " + sum);

 	}
 	
 	public static int addNumbers(int number1, int number2)
 	{
 		int added;
 		added = number1 + number2;
 		return added;
 	}

 }