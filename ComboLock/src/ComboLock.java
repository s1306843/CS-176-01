import java.lang.Math;

public class ComboLock 
{

	private int[] numCode = new int[3];
	
	private int[] codeTurns = new int[] {0, 0, 0};
	
	private int currentPosition = 0;
	
	public ComboLock(int secret1, int secret2, int secret3)
	{
		
		numCode[0] = secret1;
		numCode[1] = secret2;
		numCode[2] = secret3;
		
	}
	
	public void reset()
	{
		
		currentPosition = 0;
		
		codeTurns = new int[] {0, 0, 0};
		
	}

	public void turnRight(int ticks)
	{
		
		currentPosition = currentPosition + ticks;
		
		if(codeTurns[0] == 0)
		{
			
			codeTurns[0] = currentPosition;
			
		}
		
		else if(codeTurns[0] != 0 && codeTurns[2] == 0)
		{
			
			codeTurns[2] = currentPosition % 40;
			
		}

	}
	
	public void turnLeft(int ticks)
	{
		
		currentPosition = Math.abs(currentPosition - ticks);
		codeTurns[1] = currentPosition;
		
	}
	
	public boolean open()
	{
		
		boolean unlocked = false;
		
		if(codeTurns[0] == numCode[0] && codeTurns[1] == numCode[1] && codeTurns[2] == numCode[2])
		{
			
			unlocked = true;
			return unlocked;
			
		}
		
		return unlocked;
		
	}
	
}
