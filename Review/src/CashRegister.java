public class CashRegister 
{

	private double purchase;
	private double payment;
	
	public CashRegister()
	{
		  
	      purchase = 0;
	      payment = 0;
	      
	}
	
	public void recordPurchase(double cost)
	{
		
		purchase = purchase + cost;
		
	}
	
	public void receivePayment(double paymentReceived)
	{
		
		payment = paymentReceived;
		
	}
	
	public double giveChange()
	{
		
		return(payment - purchase);
		
	}

}