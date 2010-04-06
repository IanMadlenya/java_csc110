/* Write a program that display the following information, each on a seperate line
 * Your name, Your address, with city, state, and ZIP
 * Your telephone number
 * Your college major
 * */
 
 public class InfoPersonal
 {
 	public static void main(String [] args)
 	{
 		String name = "Eric J. Chuderewicz";
 		String address = "41-25 60th Street, Woodside NY 11377";
 		String phoneNumber = "917-836-4610";
 		String collegeMajor = "Chemistry";
 		String nextLine = " \n";
 		
 		System.out.println(name + nextLine + 
 							address + nextLine +
 							phoneNumber + nextLine +
 							collegeMajor);	
 	}
 }