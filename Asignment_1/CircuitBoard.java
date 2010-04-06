/* Write a program that asks the user for the retail price of a circuit board
 * calculates the amount of profit earned for that product, and displays the 
 * result on the screen */
 
/* Note to self: use either Scanner or JOptionPane class to get input
 */
 
 
 import javax.swing.JOptionPane;
 
 public class CircuitBoard
 {
 	public static void main(String [] args)
 	{
 		String answer;
 		double retailPrice;
 		double profit;
 		double rate = 0.4;
 		//String newLine = "\n";
 		
 		
 		answer = JOptionPane.showInputDialog("What is the retail price of your circuit board?");
 		retailPrice = Double.parseDouble(answer);
 		profit = retailPrice * rate;
 		JOptionPane.showMessageDialog(null, "You entered $" + retailPrice + 
 										" Your profit is $" + profit);
 		
 	}
 }