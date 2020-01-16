/**
 *  Method to display long help info implementing the HelpDisplay Class
 */

public class LongHelp implements HelpDisplay {



	
	@Override
	public void displayMessage() {
			String helpMessage = new String();
		
		
//---------------------------LONG MODE		
		helpMessage = String.format("\n\nFUNCTIONS:"
				+"\nADD   (+): Add Number 1 and Number 2."
				+"\nSUB   (-): Subtract Number 2 from Number 1."
				+"\nMULTI (*): Multiply Number 1 and Number 2."
				+"\nDIV   (/): Divide Number 1 by Number 2 , return Whole Number Value"
				+"\nMOD  (/%%): Divide Number 1 by Number 2 , return Whole Number Value and Remainder"
				+"\nPOW   (^): Raise Number 1 by the power of Number 2"
				+"\nROOT  (R): Take Number 1 to the Number 2(root), Number 2 is the Nth Root"
				
				+"\n\n---------------------------------------------------------"
				+"\nENTER :  PI for the value of pi"
				+"\nENTER :   E for the value of e"
								);
		
				System.out.println(helpMessage);
		}

		
}
