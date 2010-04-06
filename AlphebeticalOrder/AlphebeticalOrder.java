/* Write a program that will input 2 name. Print them in alphabetical order
 */
 
import javax.swing.JOptionPane;

 public class AlphebeticalOrder
 {
 	
   public static void main(String [] args)
   {
   	
   	String name1, name2;
   	double discount, amount, discountAmount, totalAmount, quantity;
   	
   	name1 = JOptionPane.showInputDialog("Enter a name");
   	name2 = JOptionPane.showInputDialog("Enter another name");
   	
   	if (name1.compareTo(name2) > 0)
   		JOptionPane.showMessageDialog(null, name2 + "\n" + name1);
   	else
   		JOptionPane.showMessageDialog(null, name1 + "\n" + name2);	
   	
   }
 
 }