package numberGame;
import java.util.*;
public class NumberGameClass extends RandomGenerator
{
	//private int answerNumber;
	private int guessfactor;
	private int guessNumber;
	static ArrayList <Integer> guessedFactors = new ArrayList();
	static ArrayList <Integer> guessedIncorrectFactors = new ArrayList();
	Random randomGenerator = new Random();
	public NumberGameClass()
	{
		super();
	}
	
	public boolean checkGuessFactor( int factor)
	{
		if(super.getAnswer()%factor ==0)
		{	
			guessedFactors.add(factor);
			return true;
		}
		else
		{
			guessedIncorrectFactors.add(factor);
			return false;
		}
	}
	
	public boolean checkGuessNumber(int number)
	{
		if(number == super.getAnswer())
			return true;
		else
			return false;
	}
	public boolean checkUsedFactors( int factor)
	{
		boolean bool = true;
		for(int i=0; i<guessedFactors.size()-1;i++)
		{
		
			if(guessedFactors.get(i)==factor)
			{
				bool = false;
				break;
			}
		}
		return bool;
	}
	
	
	public void clearList()
	{
		guessedFactors.clear();
	}
	public void clearWrongList()
	{
		guessedIncorrectFactors.clear();
	}
	public ArrayList getList()
	{
		return guessedFactors;
	}
	public ArrayList getIncorrectList()
	{
		return guessedIncorrectFactors;
	}
}
