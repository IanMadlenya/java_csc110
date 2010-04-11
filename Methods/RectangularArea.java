/* The Student CD contains a partially written program named AreaRectangle.java. Your
 * job is to complete the program. When uit is complete, the program will ask the user to 
 * enter the width and length of a rectangle, and then display the rectangle's area. The 
 * program call the following methods, which have not been written: 
 *
 * 	getLength -- This method should ask the user to enter the rectangle's length, and
 * 	then return that value as a double. 
 *
 *	getWidth -- This method should ask the user to enter the rectangle's width, and 
 *  then return that value as a double. 
 *
 *	getArea -- This method should accept the rectangle's length and width as arguments
 *	and return the rectangle's area. The area is calculate by multiplying the length 
 *	by the width. 
 *
 *	displayData -- This method should accept the rectangle's length, width, and area 
 *	as arguments, and display them in an appropriate message on the screen. 
 */
 
 import java.util.Scanner;
 
 
 public class RectangularArea
 {
 	public static void main(String[] args)
 	{
 		Scanner input = new Scanner(System.in);
 		double length = getLength(input);
 		double width = getWidth(input);
 		double area = getArea(length, width);
 		displayData(length, width, area);
 	}
 	
 	public static double getLength(Scanner input)
 	{
 		System.out.println("Enter the length");
 		double length = input.nextDouble();
 		return length;
 	}
 	
 	public static double getWidth(Scanner input)
 	{
 		System.out.println("Enter the width");
 		double width = input.nextDouble();
 		return width;
 	}
 	
 	public static double getArea(double length, double width)
 	{
 		double area = length * width;
 		return area;
 	}
 	
 	public static void displayData(double length, double width, double area)
 	{
 		System.out.println("The length is: " + length
 							+ "\nThe width is: " + width
 							+ "\nThe area is: " + area);				
 	}

 }