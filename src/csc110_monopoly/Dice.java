package csc110_monopoly;

import java.util.Random;

public class Dice 
{
	private int diceTotal;
	private Random gen = new Random();
	
	//2d6
	
	//boolean speed :(
	
	//public void roll()
	// if Game.speed
		// roll speed
	
	public void roll()
	{
		int die1 = rollD6();
		int die2 = rollD6();
		diceTotal = die1+die2;
		if(Game.Speed)
		{
			interperateSpeed(rollSpeed());
		}
		
	}
	
	
	private void interperateSpeed(Speed speed)
	{
		switch(speed)
		{
			case One:
				diceTotal += 1;
				break;
			case Two:
				diceTotal += 2;
				break;
			case Three:
				diceTotal += 3;
			case Man:
				break;
			case Bus:
				break;
				
			
		
		}
		
	}


	public int rollD6()
	{
		return gen.nextInt(6)+1;//retruns random number from 1-6
	}
	
	private Speed rollSpeed()
	{
		int outcome = gen.nextInt(6)+1;
		switch(outcome)
		{
			case 1:
				return Speed.One;
			case 2:
				return Speed.Two;
			case 3:
				return Speed.Three;
			case 4:
			case 5:
				return Speed.Man;
//				Mr. Monopoly: First, move the sum of the two white dice
//				and resolve the space you land on (such as drawing a card,
//				buying the property, paying rent, etc.). Then, one of two
//				things will happen depending on whether or not there is still
//				property in the bank.
//				YES, there is property in the bank -Advance to the NEXT
//				property that the bank still holds and buy it if you wish. If you
//				don't want to buy this property, move to the space anyway
//				and put the property up for auction.
//				NO, there are no more properties in the bank - Advance to the
//				NEXT property on which you will owe another player money. 
			case 6:
				return Speed.Bus;
//				Bus: This lets you "get off the bus early." Look at the two white
//				dice. You can move the value of one die, the other die, or the
//				sum of both dice. So if you rolled a 1 and a 5, you can move
//				1 space, 5 spaces, or 6 spaces: \t's your choice
			default:
				return null;
		}
	}
	
	
	
	
	
	// roll speed()
}
