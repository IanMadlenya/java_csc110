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
 		int input;
 		Scanner keyboard = new Scanner(System.in);
 		
 		System.out.println("How many times do you want to print \"Hello Java\"");
 		input = keyboard.nextInt();
 		
 		int count = 1; 			//starting action
 		while(count <= input) 	//ending action
 		{
 			System.out.println(count + ". hello java");
 			count = count + 1;
 		}	
 	}
 }