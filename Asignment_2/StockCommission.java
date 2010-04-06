/* Kathryn bought 600 shares of stock at a price of $21.77 per share.
 * She must pay her stockbroker a 2 percent commission for the transaction. Write a program
 * that calculates and display the following. 
 * The amount paid for the stock alone (without the commission)
 * The amount of the commission
 * the total amount paid (for the stock plus the commission)
 */
 
 import java.util.Scanner;
 import javax.swing.JOptionPane;
 
 
 public class StockCommission
 {
 	public static void main(String [] args)
 	{
 		int numberOfShares = 600;
 		double pricePerShare = 21.77;
 		double commissionRate = 0.02;
 		double amountPaid = numberOfShares * 21.77;
 		double commissionAmount = amountPaid * commissionRate;
 		double totalAmountPaid = amountPaid + commissionAmount;
 		
 		System.out.println("The amount paid (without the commission): " + amountPaid);
 		System.out.println("The amount of the commission: " + commissionAmount);
 		System.out.println("The total amount paid is: " + totalAmountPaid);
 		
 	}
 }