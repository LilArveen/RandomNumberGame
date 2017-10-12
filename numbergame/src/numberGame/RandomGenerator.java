package numberGame;
import java.util.*;
public class RandomGenerator 
{
	Random randomGenerator = new Random();
	private int answerNumber;
	public RandomGenerator()
	{
		answerNumber = randomGenerator.nextInt(99)+1;
	}
	public int getAnswer()
	{
		return answerNumber;
	}
}
