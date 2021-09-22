
public class ArrayAssignment1 
{

	public static void main(String[] args) 
	{
		double values[] = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double maxNumb = 0;
		double negNumbs = 0;
		System.out.println("                           Array Elements\n");
		
		for(int n = 0; n < values.length; n++)
		{
			
			System.out.print(values[n] + ", ");
			
			if(values[n] < 0)
			{
				negNumbs = negNumbs + 1;
			}
			
			if(values[n] > maxNumb)
			{
				maxNumb = values[n];
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.println("The max value is: " +  maxNumb);
		System.out.println("There are: " + negNumbs + " negative numbers");

	}

}
