package csc110_monopoly;

import java.util.ArrayList;
import java.util.Random;

public class CommunityChest {

	
	Random gen = new Random();
	ArrayList<Integer> cards = new ArrayList<>();
	int maxCards = 16;
	Banker bank = new Banker();
	
	public void deckChanceCards() {
		for(int i = 0; i < maxCards; i++) {
			cards.add(i);
		}
	}
	
	public void pickChance(Player activePlayer) {
	Random gen = new Random();
	int card = gen.nextInt(maxCards);
	
	if(card == 0) {
		System.out.println("Advance to Go (Collect $200)");
		//activePlayer.setLocation(0);
		bank.pay(200, activePlayer);
		cards.remove(0);
	}
	if(card == 1) {
		System.out.println("Bank error in your favor – Collect $200");
		bank.pay(200 , activePlayer);
		cards.remove(1);
	}
	if(card == 2) {
		System.out.println("Doctor's fees – Pay $50");
		bank.payBank(50 , activePlayer);
		cards.remove(2);
	}
	if(card == 3) {
		System.out.println("From sale of stock you get $50");
		bank.pay(50 , activePlayer);
		cards.remove(3);
	}
	if(card == 4) {
		System.out.println("Get Out of Jail Free – This card may be kept until needed or sold");
		activePlayer.setHasGetOutOfJailFreeChest(true);
		cards.remove(4);
	}
	if(card == 5) {
		System.out.println("Go to Jail – Go directly to jail – Do not pass Go – Do not collect $200");
		//activePlayer.setLocation(10);
		//activePlayer.isInJail = true;
		cards.remove(5);
	}
	if(card == 6) {
		System.out.println("Grand Opera Night – Collect $50 from every player for opening night seats");
		//remove $50 from all players minus this.playersTurn 
		//add (# of players -1)50 to currPlayer.
		cards.remove(6);
	}
	if(card == 7) {
		System.out.println("Holiday Fund matures - Receive $100");
		bank.pay(100 , activePlayer);
		cards.remove(7);
	}
	if(card == 8) {
		System.out.println("Income tax refund – Collect $20");
		bank.pay(20 , activePlayer);
		cards.remove(8);
	}
	if(card == 9) {
		System.out.println("Life insurance matures – Collect $100");
		bank.pay(100 , activePlayer);
		cards.remove(9);
	}
	if(card == 10) {
		System.out.println("Pay hospital fees of $100");
		bank.payBank(100 , activePlayer);
		cards.remove(10);
	}
	if(card == 11) {
		System.out.println("Pay school fees of $150");
		bank.payBank(150 , activePlayer);
		cards.remove(11);
	}
	if(card == 12) {
		System.out.println("Receive $25 consultancy fee");
		bank.pay(25 , activePlayer);
		cards.remove(12);
	}
	if(card == 13) {
		System.out.println("You are assessed for street repairs – $40 per house – $115 per hotel");
		//for loop, count houses times($25) payBank(amount);
		//for loop, count hotels times($100) payBank(amount);
		cards.remove(13);
	}
	if(card == 14) {
		System.out.println("You have won second prize in a beauty contest – Collect $10");
		bank.pay(10 , activePlayer);
		cards.remove(14);
	}
	if(card == 15) {
		System.out.println("You inherit $100");
		bank.pay(100 , activePlayer);
		cards.remove(15);
	}

	}
}
