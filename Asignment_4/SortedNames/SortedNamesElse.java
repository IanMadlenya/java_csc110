import javax.swing.JOptionPane;

/* Write a program that asks the  user to enter three names, and then 
 * displays the names sorted in ascending order. For example, if the 
 * user entered "Charlie", "Leslie", and "Andy", the program would display: 
 *
 * Andy
 * Charlie
 * Leslie 
 * 
 */

 
 public class SortedNames
 {
	 public static void main(String [] args)
	 {
		 
		 String name1, name2, name3, firstPlace = null, secondPlace = null, thirdPlace = null;
		 
		 //the user is asked to enter three names
		 
		 name1 = JOptionPane.showInputDialog("Please enter a persons name:");
		 name2 = JOptionPane.showInputDialog("Now enter a second name:");
		 name3 = JOptionPane.showInputDialog("Now enter a third name:");
		 
		 if (name1.compareToIgnoreCase(name2) < 0)
		 {
			 if (name1.compareToIgnoreCase(name3) < 0)
				firstPlace = name1;
			 	//If the below line is uncommented then an erro occurs on line 33????
			 	//JOptionPane.showMessageDialog(null, "first place is " + firstPlace);
			 else
			 	{
			 	firstPlace = name3;
			    JOptionPane.showMessageDialog(null, "first place is " + firstPlace);
			 	}	
		 }
		 else
			 JOptionPane.showMessageDialog(null, "this is dumb");
		
	 }
	 
 }
