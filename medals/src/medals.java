public class medals 
{

	public static void main(String[] args) 
	{

		final int COUNTRIES = 8;
		final int MEDALS = 3;
		int sumOfMedals = 0;
		int totalOfMedals = 0;
		
		String[] countries = 
			{
				"Canada", 
				"Italy",  
				"Germany",  
				"Japan",  
				"Kazakhstan",  
				"Russia",  
				"South Korea",  
				"United States"
			};
		
		int[][] medalCount = 
			{
				{ 0, 3, 0}, 
				{ 0, 0, 1}, 
				{ 0, 0, 1}, 
				{ 1, 0, 0}, 
				{ 0, 0, 1}, 
				{ 3, 1, 1}, 
				{ 0, 1, 0}, 
				{ 1, 0, 1}
			};
		
		
		System.out.println("      COUNTRY    GOLD  SILVER  BRONZE   TOTAL");           
		System.out.println("---------------------------------------------");		                 
		
		for (int a = 0; a < COUNTRIES; a++)
		{
			
			System.out.printf("%13s", countries[a]);
			
			for (int b = 0; b < MEDALS; b++)
			{  
				
				System.out.printf("%8d",medalCount[a][b]);
				
				sumOfMedals = sumOfMedals + medalCount[a][b];
				
			}
			
			System.out.printf("%8d",sumOfMedals);
			
			//resets the count to zero so it doesn't overlap with the next for loop 
			sumOfMedals = 0;
			
			System.out.println(); 
			
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.printf("%13s", "TOTAL:");
		
		for (int b = 0; b < MEDALS; b++)
		{
			
			for (int a = 0; a < COUNTRIES; a++)
			{
				
				sumOfMedals = sumOfMedals + medalCount[a][b];
				
			}
			
			System.out.printf("%8d",sumOfMedals);
			
			totalOfMedals = totalOfMedals + sumOfMedals;
			
			
			sumOfMedals = 0;
			
		}
		
		System.out.printf("%8d", totalOfMedals);
		
	}
}