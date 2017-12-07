package csc110_monopoly;

import java.util.ArrayList;
import java.util.Random;

public class CommunityChest {

	
	Random gen = new Random();
	ArrayList<Integer> cards = new ArrayList<>();
	int maxCards = 16;
	Banker bank = new Banker();
	
	public void deckChestCards() {
		for(int i = 0; i < maxCards; i++) {
			cards.add(i);
		}
	}
	
	public void pickChest(Player activePlayer) {
	Random gen = new Random();
	if(maxCards == 0) {
		deckChestCards();
		//check players for getoutofjailChest.
		//if player.getoutofjailchest = true
		//cards.remove(4);
		//maxCards--;
	}
	int card = gen.nextInt(maxCards);
	
	if(card == 0) {
		System.out.println("Advance to Go (Collect $200)");
		activePlayer.setLocation(0);
		bank.pay(200, activePlayer);
		cards.remove(0);
		maxCards--;
	}
	if(card == 1) {
		System.out.println("Bank error in your favor – Collect $200");
		bank.pay(200 , activePlayer);
		cards.remove(1);
		maxCards--;
	}
	if(card == 2) {
		System.out.println("Doctor's fees – Pay $50");
		bank.payBank(50 , activePlayer);
		cards.remove(2);
		maxCards--;
	}
	if(card == 3) {
		System.out.println("From sale of stock you get $50");
		bank.pay(50 , activePlayer);
		cards.remove(3);
		maxCards--;
	}
	if(card == 4) {
		System.out.println("Get Out of Jail Free – This card may be kept until needed or sold");
		activePlayer.setHasGetOutOfJailFreeChest(true);
		cards.remove(4);
		maxCards--;
	}
	if(card == 5) {
		System.out.println("Go to Jail – Go directly to jail – Do not pass Go – Do not collect $200");
		activePlayer.setLocation(10);
		activePlayer.setInJail(true);
		cards.remove(5);
		maxCards--;
	}
	if(card == 6) {
		System.out.println("Grand Opera Night – Collect $50 from every player for opening night seats");
		ArrayList<Player> inactivePlayers = Monopoly.g1.getInactivePlayers();
		for(Player p: inactivePlayers)
		{
			p.setMoney(p.getMoney() - 50);
			Monopoly.g1.getActivePlayer().setMoney(Monopoly.g1.getActivePlayer().getMoney() + 50);
		}
		cards.remove(6);
		maxCards--;
	}
	if(card == 7) {
		System.out.println("Holiday Fund matures - Receive $100");
		bank.pay(100 , activePlayer);
		cards.remove(7);
		maxCards--;
	}
	if(card == 8) {
		System.out.println("Income tax refund – Collect $20");
		bank.pay(20 , activePlayer);
		cards.remove(8);
		maxCards--;
	}
	if(card == 9) {
		System.out.println("Life insurance matures – Collect $100");
		bank.pay(100 , activePlayer);
		cards.remove(9);
		maxCards--;
	}
	if(card == 10) {
		System.out.println("Pay hospital fees of $100");
		bank.payBank(100 , activePlayer);
		cards.remove(10);
		maxCards--;
	}
	if(card == 11) {
		System.out.println("Pay school fees of $150");
		bank.payBank(150 , activePlayer);
		cards.remove(11);
		maxCards--;
	}
	if(card == 12) {
		System.out.println("Receive $25 consultancy fee");
		bank.pay(25 , activePlayer);
		cards.remove(12);
		maxCards--;
	}
	if(card == 13) {
		System.out.println("You are assessed for street repairs – $40 per house – $115 per hotel");
		bank.payBank((activePlayer.getHouses() * 40) , activePlayer);
		bank.payBank((activePlayer.getHotels() * 115) , activePlayer);
		cards.remove(13);
		maxCards--;
	}
	if(card == 14) {
		System.out.println("You have won second prize in a beauty contest – Collect $10");
		bank.pay(10 , activePlayer);
		cards.remove(14);
		maxCards--;
	}
	if(card == 15) {
		System.out.println("You inherit $100");
		bank.pay(100 , activePlayer);
		cards.remove(15);
		maxCards--;
	}

	}
}
