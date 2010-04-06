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
 
 public class SortedNamesConcise
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
		 
		
		 
	 }
		 

	 
 }
