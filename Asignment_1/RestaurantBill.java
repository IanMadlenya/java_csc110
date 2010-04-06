/* Write a program that computes the tax ad tip on a restuarant bill
 * The program should ask the user to enter the charge for the meal. 
 * The tax should be 6.75 percent of the meal charge. The tip 
 * should be 15 percent of the total after adding the tax. Display 
 * the meal charge, tax amount, and the total bill on the screen. 
 */
 
 import java.util.Scanner;
 import javax.swing.JOptionPane;
 	
 public class RestaurantBill
 {
 	public static void main(String [] args)
 	{
 		double charge;
 		double tax = 0.0675;
 		double tipRate = 0.15;
 		double totalWithTax;
 		double taxAmount;
 		double tipAmount;
 		double grandTotal;
 		
 		Scanner keyboard = new Scanner(System.in);
 		
 		//ask for charge from the user
 		System.out.println("What is the charge for your meal?");
 		charge = keyboard.nextDouble();
 		
 		//calculate the charge and the tip
 		taxAmount = charge * tax;
 		totalWithTax = charge + taxAmount;
 		tipAmount = totalWithTax * tipRate;
 		grandTotal = totalWithTax + tipAmount;
 		
 		//Display it back to the user
 		System.out.println("meal: $" + charge);
 		System.out.println("tax: $" + taxAmount);
 		System.out.println("meal + tax: $" + totalWithTax);
 		System.out.println("total cost(tip included): $" + grandTotal);
 		
 			
 	}
 }