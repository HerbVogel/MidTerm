/**
 *  Method to display short help info implementing the HelpDisplay Class
 */



public class ShortHelp implements HelpDisplay {

	
	@Override
	public void displayMessage() {
			String helpMessage = new String();
		
		
			//---------------------------SHORT MODE			
			helpMessage = String.format("\nTESTPlease enter a Number , a Function , and another Number");
		
				System.out.println(helpMessage);
		}
	
		
}


