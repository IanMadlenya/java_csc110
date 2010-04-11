/* Write a program that will input (3) numbers
 * and then find the largest of those (3) and
 * return it
 */
 
 import java.util.Scanner;
 
 
 public class FindBigNumber
 {
 	public static void main(String[] args)
 	{
 		Scanner input = new Scanner(System.in);
 		int x, y, z;
 		
 		System.out.println("Enter the first number");
 		x = input.nextInt();
 		
 		System.out.println("Enter the second number");
 		y = input.nextInt();
 		
 		System.out.println("Enter the third number");
 		z = input.nextInt();
 	
 		int largest = findLargest(x, y, z);
 		System.out.println("the largest number is " + largest);
 	}
 	
 	public static int findLargest(int number1, int number2, int number3)
 	{
 		if (number1 >= number2 && number1 >= number3)
 			return number1;
 			
 		else if (number2 >= number1 && number2 >= number3)
 			return number2;
 			
 		else
 			return number3;
 	}

 }