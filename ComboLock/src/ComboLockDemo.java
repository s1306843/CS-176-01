import java.util.Scanner;

public class ComboLockDemo 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		boolean unlocked = false;
		
		ComboLock Padlock = new ComboLock(30, 20, 10);
		
		while (!unlocked)
		{
			
			System.out.println("Enter the number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
			int firstRight = scan.nextInt();
			if (firstRight >= 40 || firstRight < 0)
			{
				
				break;
				
			}
			
			else if (firstRight <= 38 && firstRight > 0)
			{
				
				Padlock.turnRight(firstRight);
				
			}
			
			System.out.println("Enter the number of ticks to turn to the left 0 - 39. Enter an invalid number to quit.");
			int leftTurn = scan.nextInt();
			if (leftTurn >= 40 || leftTurn < 0)
			{
				
				break;
				
			}
			
			else if (leftTurn <= 38 && leftTurn > 0)
			{
				
				Padlock.turnLeft(leftTurn);
				
			}
			
			System.out.println("Enter the number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
			int secondRight = scan.nextInt();
			
			if (secondRight >= 40 || secondRight < 0)
			{
				
				break;
				
			}
			
			else if (secondRight <= 38 && secondRight > 0)
			{
				
				Padlock.turnRight(secondRight);
				
			}
			
			unlocked = Padlock.open();
			
			
			if (unlocked)
			{
				System.out.println("You have opened the lock!");	
			}
			if (!unlocked) 
			{
				System.out.println("You did not open the lock!");
				
				break;
			}
		}
	}
}

