import javax.swing.JOptionPane;

public class ProfitGUI
{
	public static void main (String [] args)
	{
		double retailPrice, profit;
		String rP;
		
		rP=JOptionPane.showInputDialog( "Enter the retail price");
		retailPrice = Double.parseDouble(rP);
	
		profit = retailPrice * 0.4;
		JOptionPane.showMessageDialog(null, "The profit is " + profit);
		
		if ( profit >= 100   )
			JOptionPane.showMessageDialog(null,"Take a TAXI");
		else
			JOptionPane.showMessageDialog(null,"Walk ");	
	}	
	
}