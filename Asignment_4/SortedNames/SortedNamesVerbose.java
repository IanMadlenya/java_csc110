/* 		Write a program that asks the  user to enter three names, and then 
 * 		displays the names sorted in ascending order. For example, if the 
 * 		user entered "Charlie", "Leslie", and "Andy", the program would display: 
 *
 * 		Andy
 * 		Charlie
 * 		Leslie 
 *
 *		order abc		order bac		order cab
 *		a < b			b < a			c < a
 *		b < c			a < c			a < b
 *		a < c			b < c			c < b
 * 		else acb		else bca		else cba		
 */

 import javax.swing.JOptionPane;
 
  public class SortedNamesVerbose
 {
	 public static void main(String [] args)
	 {
		 
		 String name1, name2, name3; 
		 String firstPlace = null; 
		 String secondPlace = null; 
		 String thirdPlace = null;
		 
		 //the user is asked to enter three names
		 
		 name1 = JOptionPane.showInputDialog("Please enter a persons name:");
		 name2 = JOptionPane.showInputDialog("Now enter a second name:");
		 name3 = JOptionPane.showInputDialog("Now enter a third name:");
		 
		 if (name1.compareTo(name2) < 0)
		 {
		 	if (name2.compareTo(name3) < 0)
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name1 + "\n" + name2 + "\n" + name3);
		 	}
		 	else
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name1 + "\n" + name3 + "\n" + name2);
		 	}
		 		
		 }
		 
		 else if (name2.compareTo(name1) < 0)
		 {
		 	if (name1.compareTo(name3) < 0)
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name2 + "\n" + name1 + "\n" + name3);
		 	}
		 	else
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name2 + "\n" + name3 + "\n" + name1);
		 	}
		 		
		 }
		 
		 else if (name3.compareTo(name1) < 0)
		 {
		 	if (name1.compareTo(name2) < 0)
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name3 + "\n" + name1 + "\n" + name2);
		 	}
		 	else
		 	{
		 		JOptionPane.showMessageDialog(null, "The order is: \n" 
		 						+ name3 + "\n" + name2 + "\n"+ name1);
		 	}
		 		
		 }
		 
	 }
