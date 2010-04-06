/*
 */
 

import java.util.Scanner;

public class Loop2
{
	public static void main(String [] arg)
	{
		Scanner input = new Scanner(System.in);
		int limit, count;
		
		System.out.println("Enter a number of times to print the message");
		limit = input.nextInt();
		
		count = 1;
		
		while( count <= limit)
		{
			System.out.println(count + ". Hello java");
			count ++;
		}
		

	}	
	
}