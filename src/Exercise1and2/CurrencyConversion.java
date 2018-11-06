package Exercise1and2;
import java.util.Scanner;

/*
 * Rosa Cristina Sezer
 * 1821060 
 * IMB WS18
 */

public class CurrencyConversion 
{

	public static void main(String[] args)
	{
		//Declare and initialize the given variable.
		double dollarExchangeRate	= 1.34;	
		double euroExchangeRate 	= 1/ dollarExchangeRate;
		//Needed to keep the loop alive
		boolean invoiceRepeat = true;
		
		//Add scanner so that the user can use the input function
		Scanner sc = new Scanner (System.in);
		
		//(while loop) is used to run a program until the condition get "wrong"
		while(invoiceRepeat)	
		{
			//Prompt the user to select an option.
			System.out.print("Hello!\nWhat type of conversion do you want to do?\n[1]Euro\t  --> Dollar\n[2]Dollar --> Euro\nChoose:");
			//Loop waits here for the further option of the user.
			String userOption = sc.next();
		
			
			//check the option input. Checks always take place in the if()-Statemant! We use .equals cause the the userOption is a String (== doesn't work with Srings)
			if(userOption.equals("1"))
			{
				//User is prompted to specify the amount to be converted.
				System.out.print("Please enter the amount you wish to convert.\nEuro:");
				//Create input field for user. userInput can be assigned a value.
				double enteredAmount = sc.nextDouble();
				//Conversion and output of the result
				double conversionAmount = enteredAmount*dollarExchangeRate;
				System.out.println(enteredAmount + "€\tequals\t" + conversionAmount + "$");
			}
			//check the userOption 2 (same lake userOption 1)
			if(userOption.equals("2"))
			{
				System.out.print("Please enter the amount you wish to convert.\nDollar:");
				double enteredAmount = sc.nextDouble();
				double conversionAmount = enteredAmount*euroExchangeRate;
				System.out.println(enteredAmount + "$\tequals\t" + conversionAmount + "€");
			}

			//repeat the question, if the User chooose wrong entry 
			boolean wrongInput = true;
			while(wrongInput) 
			{
				//Ask the user if he wants to perform further conversions.
				System.out.print("Would you like to carry out further conversions?\n[j or J]further conversions\n[n or N]Finish\nChoose:");
				//Loop waits here for the further option of the user.
				userOption = sc.next();	
				//If the user chooses "n or N", the condition is wrong and the if()_Statement ends.
				if(userOption.equals("n") || userOption.equals("N"))
				{
					invoiceRepeat=false;
					wrongInput = false;
					System.out.println("Goodbye");
				}
				//If the User choose "j or J", the condition gets true and the calculation can be continued
				else if(userOption.equals("j") || userOption.equals("J")) 
				{
					wrongInput = false;
				}
				//If the user does not press "n or N" or "j or J", "Incorrect input" appears.
				else
				{
					System.out.println("Please, pay attention to your input!");					
				}
			}
			
		}
	}
	

}
