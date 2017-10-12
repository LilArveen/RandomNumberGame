package numberGame;
import java.util.*;
public class NumberGameMain 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int userFactorGuess, userNumberGuess, counter;
		int selectAction=0;
		int lives;
		String x;
		
		do
		{
			System.out.println("Player is supposed to guess the factor of a randomly chosen number between 1-100 inclusive");
			System.out.println("player loses a life if he/she guesses incorrectly");
			System.out.println("Player gains a life if he/she guesses correctly one of the factors");
			System.out.println("Player starts out with ten lives");
			System.out.println("");
			lives = 10;
			NumberGameClass ALVIN = new NumberGameClass();
			while( lives>0)
			{	System.out.println("Press 1 to guess factors of the number");
				System.out.println("Press 2 to guess the number");
				System.out.println("Press 3 to end game");
				System.out.println("List of correct guesses so far: "+ ALVIN.getList());
				System.out.println("List of incorrect Guesses so far: " + ALVIN.getIncorrectList());
				selectAction = input.nextInt();
			
				
				
				if(selectAction ==1)
				{
					System.out.println("Enter in the guess of the number's factor");
					userFactorGuess = input.nextInt();
					if(userFactorGuess!=1)
					{
						if(ALVIN.checkUsedFactors(userFactorGuess))
						{
						
							if(!(ALVIN.checkGuessFactor(userFactorGuess)))
							{
								lives --;
								System.out.println("Not a factor of the number");
								System.out.println("lives left: "+lives);
								System.out.println("");
						
							}
							else
							{
								lives++;
								System.out.println("It is a factor");
								System.out.println("lives left: "+lives);
								System.out.println("");
							
							}
						}
					
						else
						{
							System.out.println("Already guessed this factor");
							System.out.println("");
						}
					}
					else
					{
						System.out.println("Cannot guess 1 as a factor. Invalid. Try again");
						System.out.println("");
					}
				}
				if(selectAction ==2)
				{
					System.out.println("Guess the number");
					userNumberGuess = input.nextInt();
					if(!(ALVIN.checkGuessNumber(userNumberGuess)))
					{
						
						System.out.println("Not the number");
						System.out.println("Number is: "+ ALVIN.getAnswer());
						System.out.println("");
						break;
						
					}
					else
					{
						System.out.println("Correct Number");
						System.out.println("");
						break;
					}
					
				}
				if (selectAction ==3)
				{
					System.out.println("Number was: " + ALVIN.getAnswer());
					System.out.println("");
					break;
				}
			}
			
			if(lives ==0)
			{
				System.out.println("The number was: " + ALVIN.getAnswer());
				System.out.println("");
			}
			System.out.println("Continue new game? Enter in y/n");
			x= input.next();
			ALVIN.clearList();
			ALVIN.clearWrongList();
		}
		while(x.equals("y")|| x.equals("Y"));
		
	}
}
