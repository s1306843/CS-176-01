import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) 
	{
		//Variables are initialized here 
		double cost = 0;
		double paymentReceived = 0;
		//Set up boolean variable so we can use incorporate it with a loop
		boolean exit = true;
		
		//Scanner is inputed 
		Scanner console = new Scanner(System.in);
		CashRegister newCashRegister = new CashRegister();
		
		while(exit = true)
		{
			//user inputs their purchase amounts and types the sentinel value for when they want to stop
			System.out.println("Please enter a purchase amount, or type -1 to stop: ");
			cost = console.nextDouble();
			//if the input is not equal to the sentinel, then the Scanner will repeat itself
			if(cost != -1)
			{
				newCashRegister.recordPurchase(cost);
			}
			
			else
			{
				break;
			}
			
		}
		//asks for the payment from the user 
		System.out.println("Please enter payment due: ");
		paymentReceived = console.nextDouble();
		
		newCashRegister.receivePayment(paymentReceived);
		
		System.out.println();
		System.out.print("Thank you! Your change is: ");
		//calls the giveChange() method from the other class
		System.out.format("%.2f", newCashRegister.giveChange());
		System.out.print(" dollars");
	}

}
