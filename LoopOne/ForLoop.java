/* write a java program that will prompt
 * you to enter the number of times to print "hello java"
 * The print "Hello Java" as many times. 
 */
 
import javax.swing.JOptionPane;
import java.util.Scanner;

 
 public class LoopTwo
 {
 	public static void main(String [] args)
 	{
 		int limit, count;
 		Scanner keyboard = new Scanner(System.in);
 		
 		System.out.println("Enter number of times to print the message");
 		limit = keyboard.nextInt();
 		
 		for (count = 1; count<= limit; count++)
 		{
 			System.out.println(count + ". Hello Java");
 		}
 		
/*=========================================
 *
 		int count = 1; 			//starting action
 		while(count <= input) 	//ending action
 		{
 			System.out.println(count + ". hello java");
 			count = count + 1;
 		}
============================================*/
 			
 	}
 }