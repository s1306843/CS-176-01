public class Quiz implements Measurable
{
	private double quizNums;
	
	public Quiz(double inputs)
	{
		quizNums = inputs;
	}
	
	public double getMeasure()
	{
		return quizNums;
	}

}
