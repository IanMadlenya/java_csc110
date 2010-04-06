/* The Fast Freight Shipping company charges the following rates:
 *
 * Weight of Package                                       Rate per 500 Miles Shipped
 *
 * 	2 pounds or less                                        $1.10
 * 	Over 2 pounds but not more than 6 pounds                $2.20 
 * 	Over 6 pounds but not more than 10 pounds               $3.70 
 * 	Over 10 pounds                                          $3.80 
 *
 * The shipping charges per 500 miles are not prorated. For example, if a 2-pound package
 * is shipped 550 miles, the charge would be $2.20. Write a program that asks the user to enter
 * the weight of  a package and then displays the shipping charges. 
 *
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
 
 public class ShippingCharges
 {
   public static void main(String [] args)
   {
     double packageWeight;
     String inputWeight;
     
     inputWeight = JOptionPane.showInputDialog("Enter the weight");
     packageWeight = Double.parseDouble(inputWeight);
     
     if (packageWeight <= 2)
     	JOptionPane.showMessageDialog(null, "Shipping is: $1.10");
     else if (packageWeight <= 6)
     	JOptionPane.showMessageDialog(null, "Shipping is: $2.20");
     else if (packageWeight <= 10)
     	JOptionPane.showMessageDialog(null, "Shipping is: $3.70");
	 else 
     	JOptionPane.showMessageDialog(null, "Shipping is: $3.80");   
   }
 }